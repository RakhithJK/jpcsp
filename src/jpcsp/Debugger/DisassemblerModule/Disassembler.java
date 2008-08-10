/*
This file is part of jpcsp.

Jpcsp is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

Jpcsp is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with Jpcsp.  If not, see <http://www.gnu.org/licenses/>.
 */
package jpcsp.Debugger.DisassemblerModule;


import jpcsp.util.OptionPaneMultiple;
import java.awt.Point;
import jpcsp.Debugger.*;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;
import jpcsp.Emulator;
import jpcsp.GeneralJpcspException;
import jpcsp.Memory;
import jpcsp.Processor;
import jpcsp.Settings;
import jpcsp.util.JpcspDialogManager;
import static jpcsp.AllegrexOpcodes.*;
import static jpcsp.Debugger.DisassemblerModule.DisHelper.*;
/**
 *
 * @author  shadow
 */
public class Disassembler extends javax.swing.JInternalFrame implements ClipboardOwner{
    Emulator emu;
    int DebuggerPC;
    private DefaultListModel model_1 = new DefaultListModel();
    //int pcreg;
    int opcode_address; // store the address of the opcode used for offsetdecode
   // Processor c;
    Registers regs;
    MemoryViewer memview;
    DisVFPU dvfpu = new DisVFPU();
    DisSpecial2 special2 =new DisSpecial2();
    DisCOP0 cop0 = new DisCOP0();
    DisSpecial3 special3 = new DisSpecial3();
    /* Creates new form Disasembler */
    public Disassembler(Emulator emu, Registers regs, MemoryViewer memview) {
        //this.c = c;
        this.regs=regs;
        this.memview=memview;
        this.emu=emu;
        DebuggerPC = 0;
        //pcreg = c.pc;
        model_1 = new DefaultListModel();
        initComponents();
        RefreshDebugger();

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DisMenu = new javax.swing.JPopupMenu();
        CopyAddress = new javax.swing.JMenuItem();
        CopyAll = new javax.swing.JMenuItem();
        BranchOrJump = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList(model_1);
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        CopyAddress.setText("Copy Address");
        CopyAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CopyAddressActionPerformed(evt);
            }
        });
        DisMenu.add(CopyAddress);

        CopyAll.setText("Copy All");
        CopyAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CopyAllActionPerformed(evt);
            }
        });
        DisMenu.add(CopyAll);

        BranchOrJump.setText("Copy Branch Or Jump address");
        BranchOrJump.setEnabled(false); //disable as default
        BranchOrJump.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BranchOrJumpActionPerformed(evt);
            }
        });
        DisMenu.add(BranchOrJump);

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setTitle("Disassembler");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jList1.setFont(new java.awt.Font("Courier New", 0, 11));
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jList1MouseWheelMoved(evt);
            }
        });
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jList1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jList1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jButton1.setText("Reset to PC");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Jump to Address");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Dump code");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Step CPU");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Run ");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Stop");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(105, 105, 105))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


private void jList1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jList1KeyPressed
// TODO add your handling code here:

    if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_DOWN && jList1.getSelectedIndex() == jList1.getLastVisibleIndex()) {
        DebuggerPC += 4;
        RefreshDebugger();
        evt.consume();
        jList1.setSelectedIndex(jList1.getLastVisibleIndex());
    } else if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_UP && jList1.getSelectedIndex() == 0) {
        DebuggerPC -= 4;
        RefreshDebugger();
        evt.consume();
        jList1.setSelectedIndex(0);
    } else if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_PAGE_UP && jList1.getSelectedIndex() == 0) {
        DebuggerPC -= 72;
        RefreshDebugger();
        evt.consume();
        jList1.setSelectedIndex(0);
    } else if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_PAGE_DOWN && jList1.getSelectedIndex() == jList1.getLastVisibleIndex()) {
        DebuggerPC += 72;
        RefreshDebugger();
        evt.consume();
        jList1.setSelectedIndex(jList1.getLastVisibleIndex());
    }
}//GEN-LAST:event_jList1KeyPressed

private void jList1MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jList1MouseWheelMoved
// TODO add your handling code here:
    if (evt.getWheelRotation() < 0) {
        evt.consume();
        if (jList1.getSelectedIndex() == 0 || jList1.getSelectedIndex() == -1) {
            DebuggerPC -= 4;
            RefreshDebugger();
            jList1.setSelectedIndex(0);
        } else {
            jList1.setSelectedIndex(jList1.getSelectedIndex() - 1);
        }
    } else {
        evt.consume();
        if (jList1.getSelectedIndex() == jList1.getLastVisibleIndex()) {
            DebuggerPC += 4;
            RefreshDebugger();
            jList1.setSelectedIndex(jList1.getLastVisibleIndex());
        } else {
            jList1.setSelectedIndex(jList1.getSelectedIndex() + 1);
        }
    }
}//GEN-LAST:event_jList1MouseWheelMoved

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    DebuggerPC = emu.getProcessor().pc;//c.pc;//
    RefreshDebugger();
}//GEN-LAST:event_jButton1ActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    String input = (String) JOptionPane.showInternalInputDialog(this, "Enter the address to which to jump (Hex)", "Jpcsp", JOptionPane.QUESTION_MESSAGE, null, null, String.format("%08x", emu.getProcessor().pc));
    if (input == null) {
        return;
    }
    int value;//GEN-LAST:event_jButton2ActionPerformed
        try {
            value = Integer.parseInt(input, 16);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "The Number you enter is not correct");
            return;
        }
        DebuggerPC = value;
        RefreshDebugger();
    }

private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    //c.stepCpu();
    emu.getProcessor().stepCpu();
    DebuggerPC = 0;
    RefreshDebugger();
    regs.RefreshRegisters();
    memview.RefreshMemory();
}//GEN-LAST:event_jButton4ActionPerformed

private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
// TODO add your handling code here:
    //System.out.println("dump code dialog created");
    OptionPaneMultiple opt=new OptionPaneMultiple(Integer.toHexString(DebuggerPC),Integer.toHexString(DebuggerPC + 0x00000070));
    if(opt.completed()){
        //Here the input can be used to actually dump code
        System.out.println("Start address: "+opt.getInput()[0]);
        System.out.println("End address: "+opt.getInput()[1]);
        System.out.println("File name: "+opt.getInput()[2]);

        BufferedWriter bufferedWriter = null;
        try {

            //Construct the BufferedWriter object
            bufferedWriter = new BufferedWriter(new FileWriter(opt.getInput()[2]));

            //Start writing to the output stream
            bufferedWriter.write("-------JPCSP DISASM-----------");
            bufferedWriter.newLine();
            int Start = Integer.parseInt(opt.getInput()[0],16);
            int End = Integer.parseInt(opt.getInput()[1],16);
            for(int i =Start; i<=End; i+=4)
            {
               int memread = Memory.get_instance().read32((int) i);
             if (memread == 0) {
                bufferedWriter.write(String.format("%08x : [%08x]: nop", i, memread));
                bufferedWriter.newLine();
             } else {
                opcode_address = i;
                bufferedWriter.write(String.format("%08x : [%08x]: %s", i, memread, disasm(memread)));
                bufferedWriter.newLine();
             }
            }


        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            //Close the BufferedWriter
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.flush();
                    bufferedWriter.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
    //System.out.println("dump code dialog done");
    opt=null;
}//GEN-LAST:event_jButton3ActionPerformed

private void CopyAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CopyAddressActionPerformed
    String value = (String)jList1.getSelectedValue();
    String address = value.substring(0, 8);
    StringSelection stringSelection = new StringSelection( address);
    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    clipboard.setContents(stringSelection, this);
}//GEN-LAST:event_CopyAddressActionPerformed

private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
       BranchOrJump.setEnabled(false);
       if (SwingUtilities.isRightMouseButton(evt) && !jList1.isSelectionEmpty() && jList1.locationToIndex(evt.getPoint()) == jList1.getSelectedIndex())
       {
           //check if we can enable branch or jump address copy
           String line = (String)jList1.getSelectedValue();
           int finddot = line.indexOf("]:");
           String opcode = line.substring(finddot+3,line.length());
           if(opcode.startsWith("b") || opcode.startsWith("j"))//it is definately a branch or jump opcode
           {
               BranchOrJump.setEnabled(true);
           }
            DisMenu.show(jList1, evt.getX(), evt.getY());
       }

}//GEN-LAST:event_jList1MouseClicked

private void CopyAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CopyAllActionPerformed
    String value = (String)jList1.getSelectedValue();
    StringSelection stringSelection = new StringSelection( value);
    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    clipboard.setContents(stringSelection, this);
}//GEN-LAST:event_CopyAllActionPerformed

private void BranchOrJumpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BranchOrJumpActionPerformed
    String value = (String)jList1.getSelectedValue();
    int address = value.indexOf("0x");
    if(address==-1)
    {
      JpcspDialogManager.showError(this, "Can't find the jump or branch address");
      return;
    }
    else
    {
      String add = value.substring(address+2,value.length());
      StringSelection stringSelection = new StringSelection(add);
      Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
      clipboard.setContents(stringSelection, this);

    }
}//GEN-LAST:event_BranchOrJumpActionPerformed

private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
   // System.out.println(this.getLocation());
    Point location = getLocation();
    //location.x
    String[] coord = new String[2];
    coord[0]=Integer.toString(location.x);
    coord[1]=Integer.toString(location.y);
    Settings.get_instance().writeWindowPos("disassembler", coord);

}//GEN-LAST:event_formInternalFrameClosing
   final SwingWorker<Integer,Void> worker = new SwingWorker<Integer,Void>() {
   @Override
    public Integer doInBackground() { //start emulator
       System.out.println("HEY");
       try {
           if(emu.pause)//emu is paused
           {
               emu.resume();
           }
           else
           {
             emu.run=true;
             emu.run();
           }
       }catch(GeneralJpcspException e)
       {

       }
        return 0;
    }

    @Override
    public void done() {
        emu.pause();
    }
  };
private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

  worker.execute();

}//GEN-LAST:event_jButton5ActionPerformed

private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
     worker.cancel(false);
     DebuggerPC = 0;
    RefreshDebugger();
    regs.RefreshRegisters();
    memview.RefreshMemory();
}//GEN-LAST:event_jButton6ActionPerformed

    public void RefreshDebugger() {
        int t;
        int cnt;
        if (DebuggerPC == 0) {
            DebuggerPC = emu.getProcessor().pc;//0x08900000;//test
        }
        model_1.clear();

        for (t = DebuggerPC          , cnt = 0; t < (DebuggerPC + 0x00000074); t += 0x00000004, cnt++) {

            int memread = Memory.get_instance().read32((int) t);
            if (memread == 0) {
                model_1.addElement(String.format("%08x:[%08x]: nop", t, memread));
            } else {
                opcode_address = t;
                model_1.addElement(String.format("%08x:[%08x]: %s", t, memread, disasm(memread)));

            }
        }

    }

    String disasm(int value) {
        String s = new String();

        //Opcodes of form:

        // ooooo dddddddddddddddddddddddddd
        // 31 26 25						  0
        // where o..o = opcode
        // 		 d..d = data

        //e.g. for a register op:
        //op 	 rs    rt 	 rd    shamt func
        //oooooo sssss ttttt ddddd aaaaa ffffff
        //31  26 25 21 20 16 15 11 10  6 5    0

        //So we read out rs/rt/rd/immediate
        //And switch on opcode
        //opcode = 00000b -> special code

        int rs = (value >> 21) & 0x1f;
        int rt = (value >> 16) & 0x1f;
        int rd = (value >> 11) & 0x1f;
        int imm = value & 0xffff;
        if ((imm & 0x8000) == 0x8000) {
            imm |= 0xffff0000;
        }
        int opcode = (value >> 26) & 0x3f;

        //s = Integer.toString(opcode);
        switch (opcode) {
            case SPECIAL: //Special table
                int specialop = (value & 0x3f);
                switch (specialop) {
                    case SLL: //sll
                        s = s + Dis_RDRTSA("sll", value);
                        break;
                    case SRLROR://srl
                        s = s + Dis_RDRTSA("srl", value);
                        break;
                    case SRA://sra
                        s = s + Dis_RDRTSA("sra", value);
                        break;
                    case SLLV: //sllv
                        s = s + Dis_RDRSRT("sllv", value);
                        break;

                    case SRLRORV://srlv
                        s = s + Dis_RDRSRT("srlv", value);
                        break;
                    case SRAV://srav
                        s = s + Dis_RDRSRT("srav", value);
                        break;
                    case JR: //jr
                        s = s + Dis_RS("jr", value);
                        break;
                    case JALR: //jalr
                        s = s + Dis_RS("jalr", value);
                        break;
                    case 11://movn
                        s = s + Dis_RDRSRT("movn", value);
                        break;
                    case SYSCALL://syscall
                        s = s + Dis_Syscall(value);
                        break;
                    case BREAK://break;
                        s = s + Dis_Break(value);
                        break;
                    case MFHI: //mfhi
                        s = s + Dis_RD("mfhi", value);
                        break;
                    case MTHI: //mthi
                        s = s + Dis_RS("mthi", value);
                        break;
                    case MFLO: //mflo
                        s = s + Dis_RD("mflo", value);
                        break;
                    case MTLO://mtlo
                        s = s + Dis_RS("mtlo", value);
                        break;
                    case MULT://mult
                        s = s + Dis_RSRT("mult", value);
                        break;
                    case MULTU://multu
                        s = s + Dis_RSRT("multu", value);
                        break;
                    case DIV://div
                        s = s + Dis_RSRT("div", value);
                        break;
                    case DIVU://divu
                        s = s + Dis_RSRT("divu", value);
                        break;
                    case ADD://add
                        s = s + Dis_RDRSRT("add", value);
                        break;
                    case ADDU://addu
                        s = s + Dis_RDRSRT("addu", value);
                        break;
                    case SUB://sub
                        s = s + Dis_RDRSRT("sub", value);
                        break;
                    case SUBU://subu
                        s = s + Dis_RDRSRT("subu", value);
                        break;
                    case AND://and
                        s = s + Dis_RDRSRT("and", value);
                        break;
                    case OR://or
                        s = s + Dis_RDRSRT("or", value);
                        break;
                    case XOR://xor
                        s = s + Dis_RDRSRT("xor", value);
                        break;
                    case NOR://nor
                        s = s + Dis_RDRSRT("nor", value);
                        break;
                    case SLT://slt
                        s = s + Dis_RDRSRT("slt", value);
                        break;
                    case SLTU://sltu
                        s = s + Dis_RDRSRT("sltu", value);
                        break;
                    case MAX:
                        s = s + Dis_RDRSRT("max", value);
                        break;
                   /* case 1:
                    case 5:
                    case 48:
                        s = s + "invalid ?";
                        break;*/
                    default:
                        s = "unsupported special instruction + " + Integer.toHexString(specialop);
                        break;
                }
                break;
            case REGIMM: //Bcond table
                int regimmcode = (value >> 16) & 0x1f;
                switch(regimmcode)
                {
                    case BLTZ:
                        s = s + Dis_RSOFFSET("bltz",value);
                        break;
                    case BGEZ:
                        s = s + Dis_RSOFFSET("bgez",value);
                        break;
                    case BLTZL:
                        s = s + Dis_RSOFFSET("bltzl",value);
                        break;
                    case BGEZL:
                        s = s + Dis_RSOFFSET("bgezl",value);
                        break;
                    case BLTZAL:
                        s = s + Dis_RSOFFSET("bltzal",value);
                        break;
                    case BGEZAL:
                        s = s + Dis_RSOFFSET("bgezal",value);
                        break;
                    case BLTZALL:
                        s = s + Dis_RSOFFSET("bltzall",value);
                        break;
                    case BGEZALL:
                        s = s + Dis_RSOFFSET("bgezall",value);
                        break;
                    default:
                       s = s + "Unknown regimm instruction " + Integer.toHexString(regimmcode);
                       break;
                }
                break;
            case J: //J
                s = s + Dis_JUMP("j", value);
                break;
            case JAL://JAL
                s = s + Dis_JUMP("jal", value);
                break;
            case BEQ: //beq
                s = s + Dis_RSRTOFFSET("beq", value);
                break;
            case BNE: //bne
                s = s + Dis_RSRTOFFSET("bne", value);
                break;
            case BLEZ://blez
                s = s + Dis_RSOFFSET("blez", value);
                break;
            case BGTZ://bgtz
                s = s + Dis_RSOFFSET("bgtz", value);
                break;
            case ADDI: //addi
                s = s + Dis_RTRSIMM("addi", value);
                break;
            case ADDIU: //addiu
                s = s + Dis_RTRSIMM("addiu", value);
                break;
            case SLTI://slti
                s = s + Dis_RTRSIMM("slti", value);
                break;
            case SLTIU://sltiu
                s = s + Dis_RTRSIMM("sltiu", value);
                break;
            case ANDI://ANDI
                s = s + Dis_RTRSIMM("andi", value);
                break;
            case ORI: //ori
                s = s + Dis_RTRSIMM("ori", value);
                break;
            case XORI: //xori
                s = s + Dis_RTRSIMM("xori", value);
                break;
            case LUI://lui
                s = s + "lui " + gprNames[rt] + " , " + imm;
                break;
            case COP0:
                s = s + cop0.DisCop0(value);
                break;
            case COP1:
                s = s + Dis_17opcode(value);
                break;
            case BEQL: //beql
                s = s + Dis_RSRTOFFSET("beql", value);
                break;
            case BNEL: //bnel
                s = s + Dis_RSRTOFFSET("bnel", value);
                break;
            case BLEZL: //BLEZL
                s = s + Dis_RSOFFSET("blezl", value);
                break;
            case BGTZL: //bgtzl
                s = s + Dis_RSOFFSET("bgtzl", value);
                break;
            case VFPU0:
                s = s + dvfpu.DisVFPU0(value);
                break;
            case VFPU1:
                s = s + dvfpu.DisVFPU1(value);
                break;
            case VFPU3:
                s = s + dvfpu.DisVFPU3(value);
                break;
            case SPECIAL2:
                s = s + special2.Special2(value);
                break;
            case SPECIAL3:
                s = s + special3.special3(value);
                break;
            case LB: //lb
                s = s + Dis_RTIMMRS("lb", value);
                break;
            case LH://lh
                s = s + Dis_RTIMMRS("lh", value);
                break;
            case LWL://lwl
                s = s + Dis_RTIMMRS("lwl", value);
                break;
            case LW://lw
                s = s + Dis_RTIMMRS("lw", value);
                break;
            case LBU://lbu
                s = s + Dis_RTIMMRS("lbu", value);
                break;
            case LHU://lhu
                s = s + Dis_RTIMMRS("lhu", value);
                break;
            case LWR://lwr
                s = s + Dis_RTIMMRS("lwr", value);
                break;
            case SB: //sb
                s = s + Dis_RTIMMRS("sb", value);
                break;
            case SH: //sh
                s = s + Dis_RTIMMRS("sh", value);
                break;
            case SWL: //swl
                s = s + Dis_RTIMMRS("swl", value);
                break;
            case SW: //sw
                s = s + Dis_RTIMMRS("sw", value);
                break;
            case SWR://swr
                s = s + Dis_RTIMMRS("swr", value);
                break;
            case LWC1://lwc1
                s = s + Dis_BASEFTOFFSET("lwc1", value);
                break;
            case SWC1://swc1
                s = s + Dis_BASEFTOFFSET("swc1", value);
                break;
            case VFPU6:
                s = s + dvfpu.DisVFPU6(value);
                break;
            /*case 19:
            case 29:
                s=s+ "invalid ?";
                break;*/
            default:
                s = "Unsupported instruction " + Integer.toHexString(opcode);
                break;


        }
        return s;
    }

    private String Dis_Syscall(int value) {  /* probably okay */
        String s = new String();
        int code = (value >> 6) & 0xFFFFF;
        for (syscalls.calls c : syscalls.calls.values()) {
            if (c.getValue() == code) {
                s = "syscall " + Integer.toHexString(code) + "     " + c;
                return s;

            }
        }
        s = "syscall 0x" + Integer.toHexString(code) + " [unknown]";
        return s;
    }

    private String Dis_17opcode(int value) {
        //note; for opcodes with only two arguments, ft ought to be 0
        //17 opcodes of form:
        //opcode fmt   ft    fs    fd    ident
        //pppppp mmmmm iiiii sssss ddddd tttttt

        //also note, in pspemulator, these are denoted with the suffix .s rather than .fmt

        if (((value >> 21) & 0x1f) == 8) {	//These are the BC opcodes
            int offset = value & 0x1FFFF;
            switch ((value >> 16) & 0x1f) {
                case 0:
                    return "bc1f " + offset;
                case 1:
                    return "bc1t " + offset;
                case 2:
                    return "bc1fl " + offset;
                case 3:
                    return "bc1tl " + offset;
                default:
                    return "Unhandled BC opcode " + ((value >> 16) & 0x1f);
            }
        }

        int ident = value & 0x3f; //These bits identify separate '17' opcodes, so switch amongst them
        int fd = (value >> 6) & 0x1f;
        int fs = (value >> 11) & 0x1f;
        int ft = (value >> 16) & 0x1f;
        int fmt = (value >> 21) & 0x1f;
        int args = 2; //The majority of opcodes take 2 args; this will be altered only if 3 are taken
        String opname = "";
        switch (ident) {
            case 5:
                opname = "abs.fmt";
                break;
            case 0:
                args = 3;
                opname = "add.fmt";
                break;
            case 10:
                opname = "ceil.l.fmt";
                break;
            case 14:
                opname = "ceil.w.fmt";
                break;
            case 33:
                opname = "cvt.d.fmt";
                break;
            case 37:
                opname = "cvt.l.fmt";
                break;
            case 32:
                opname = "cvt.d.fmt";
                break;
            case 36:
                opname = "cvt.w.fmt";
                break;
            case 3:
                args = 3;
                opname = "div.fmt";
                break;
            case 11:
                opname = "floor.l.fmt";
                break;
            case 15:
                opname = "floor.w.fmt";
                break;
            case 6:
                opname = "mov.fmt";
                break;
            case 2:
                args = 3;
                opname = "mul.fmt";
                break;
            case 7:
                opname = "neg.fmt";
                break;
            case 8:
                opname = "round.l.fmt";
                break;
            case 12:
                opname = "round.w.fmt";
                break;
            case 4:
                opname = "sqrt.fmt";
                break;
            case 1:
                args = 3;
                opname = "sub.fmt";
                break;
            case 9:
                opname = "trunc.l.fmt";
                break;
            case 13:
                opname = "trunc.w.fmt";
                break;
            default:
                return "Unhandled '17' instruction. ident:" + Integer.toString(ident);
        }

        if (args == 2) {
            return opname + " f" + Integer.toString(fd) + ", f" + Integer.toString(fs);
        }
        if (args == 3) {
            return opname + " f" + Integer.toString(fd) + ", f" + Integer.toString(fs) + ", f" + Integer.toString(ft);
        }
        return "Unhandled number of arguments: " + Integer.toString(args) + ", for opcode 17: " + opname;
    }

    private String Dis_Break(int value) {
        int code = (value >> 6) & 0xFFFFF;
        return "break 0x" + Integer.toHexString(code);
    }

    private String Dis_RSRTOFFSET(String opname, int value) {
        int rs = (value >> 21) & 0x1f;
        int rt = (value >> 16) & 0x1f;
        int imm = value & 0xffff;
        if ((imm & 0x8000) == 0x8000) {
            imm |= 0xffff0000;
        }
        return opname + " " + gprNames[rs] + ", " + gprNames[rt] + " 0x" + Integer.toHexString(imm * 4 + opcode_address + 4);

    }

    private String Dis_RSOFFSET(String opname, int value) {
        int rs = (value >> 21) & 0x1f;
        int imm = value & 0xffff;
        if ((imm & 0x8000) == 0x8000) {
            imm |= 0xffff0000;
        }
        return opname + " " + gprNames[rs] + ", 0x" + Integer.toHexString(imm * 4 + opcode_address + 4);


    }

    private String Dis_JUMP(String opname, int value) {
        int jump = (opcode_address & 0xf0000000) | ((value & 0x3ffffff) << 2);
        return opname + " 0x" + Integer.toHexString(jump);
    }

    /**
   * Empty implementation of the ClipboardOwner interface.
   */

   public void lostOwnership( Clipboard aClipboard, Transferable aContents) {
     //do nothing
   }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem BranchOrJump;
    private javax.swing.JMenuItem CopyAddress;
    private javax.swing.JMenuItem CopyAll;
    private javax.swing.JPopupMenu DisMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
