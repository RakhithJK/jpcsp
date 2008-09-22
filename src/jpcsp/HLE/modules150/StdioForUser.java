/* This autogenerated file is part of jpcsp. */
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
package jpcsp.HLE.modules150;

import jpcsp.HLE.modules.HLEModule;
import jpcsp.HLE.modules.HLEModuleFunction;
import jpcsp.HLE.modules.HLEModuleManager;

import jpcsp.Memory;
import jpcsp.Processor;

import jpcsp.Allegrex.CpuState; // New-Style Processor

public class StdioForUser implements HLEModule {

    @Override
    public String getName() {
        return "StdioForUser";
    }

    @Override
    public void installModule(HLEModuleManager mm, int version) {
        if (version >= 150) {

            mm.addFunction(sceKernelStdioReadFunction, 0x3054D478);
            mm.addFunction(sceKernelStdioLseekFunction, 0x0CBB0571);
            mm.addFunction(sceKernelStdioSendCharFunction, 0xA46785C9);
            mm.addFunction(sceKernelStdioWriteFunction, 0xA3B931DB);
            mm.addFunction(sceKernelStdioCloseFunction, 0x9D061C19);
            mm.addFunction(sceKernelStdioOpenFunction, 0x924ABA61);
            mm.addFunction(sceKernelStdinFunction, 0x172D316E);
            mm.addFunction(sceKernelStdoutFunction, 0xA6BAB2E9);
            mm.addFunction(sceKernelStderrFunction, 0xF78BA90A);

        }
    }

    @Override
    public void uninstallModule(HLEModuleManager mm, int version) {
        if (version >= 150) {

            mm.removeFunction(sceKernelStdioReadFunction);
            mm.removeFunction(sceKernelStdioLseekFunction);
            mm.removeFunction(sceKernelStdioSendCharFunction);
            mm.removeFunction(sceKernelStdioWriteFunction);
            mm.removeFunction(sceKernelStdioCloseFunction);
            mm.removeFunction(sceKernelStdioOpenFunction);
            mm.removeFunction(sceKernelStdinFunction);
            mm.removeFunction(sceKernelStdoutFunction);
            mm.removeFunction(sceKernelStderrFunction);

        }
    }

    public void sceKernelStdioRead(Processor processor) {
        // CpuState cpu = processor.cpu; // New-Style Processor
        Processor cpu = processor; // Old-Style Processor
        Memory mem = Processor.memory;

        /* put your own code here instead */

        // int a0 = cpu.gpr[4];  int a1 = cpu.gpr[5];  ...  int t3 = cpu.gpr[11];
        // float f12 = cpu.fpr[12];  float f13 = cpu.fpr[13];  ... float f19 = cpu.fpr[19];

        System.out.println("Unimplemented NID function sceKernelStdioRead [0x3054D478]");

        cpu.gpr[2] = 0xDEADC0DE;

    // cpu.gpr[2] = (int)(result & 0xffffffff);  cpu.gpr[3] = (int)(result  32); cpu.fpr[0] = result;
    }

    public void sceKernelStdioLseek(Processor processor) {
        // CpuState cpu = processor.cpu; // New-Style Processor
        Processor cpu = processor; // Old-Style Processor
        Memory mem = Processor.memory;

        /* put your own code here instead */

        // int a0 = cpu.gpr[4];  int a1 = cpu.gpr[5];  ...  int t3 = cpu.gpr[11];
        // float f12 = cpu.fpr[12];  float f13 = cpu.fpr[13];  ... float f19 = cpu.fpr[19];

        System.out.println("Unimplemented NID function sceKernelStdioLseek [0x0CBB0571]");

        cpu.gpr[2] = 0xDEADC0DE;

    // cpu.gpr[2] = (int)(result & 0xffffffff);  cpu.gpr[3] = (int)(result  32); cpu.fpr[0] = result;
    }

    public void sceKernelStdioSendChar(Processor processor) {
        // CpuState cpu = processor.cpu; // New-Style Processor
        Processor cpu = processor; // Old-Style Processor
        Memory mem = Processor.memory;

        /* put your own code here instead */

        // int a0 = cpu.gpr[4];  int a1 = cpu.gpr[5];  ...  int t3 = cpu.gpr[11];
        // float f12 = cpu.fpr[12];  float f13 = cpu.fpr[13];  ... float f19 = cpu.fpr[19];

        System.out.println("Unimplemented NID function sceKernelStdioSendChar [0xA46785C9]");

        cpu.gpr[2] = 0xDEADC0DE;

    // cpu.gpr[2] = (int)(result & 0xffffffff);  cpu.gpr[3] = (int)(result  32); cpu.fpr[0] = result;
    }

    public void sceKernelStdioWrite(Processor processor) {
        // CpuState cpu = processor.cpu; // New-Style Processor
        Processor cpu = processor; // Old-Style Processor
        Memory mem = Processor.memory;

        /* put your own code here instead */

        // int a0 = cpu.gpr[4];  int a1 = cpu.gpr[5];  ...  int t3 = cpu.gpr[11];
        // float f12 = cpu.fpr[12];  float f13 = cpu.fpr[13];  ... float f19 = cpu.fpr[19];

        System.out.println("Unimplemented NID function sceKernelStdioWrite [0xA3B931DB]");

        cpu.gpr[2] = 0xDEADC0DE;

    // cpu.gpr[2] = (int)(result & 0xffffffff);  cpu.gpr[3] = (int)(result  32); cpu.fpr[0] = result;
    }

    public void sceKernelStdioClose(Processor processor) {
        // CpuState cpu = processor.cpu; // New-Style Processor
        Processor cpu = processor; // Old-Style Processor
        Memory mem = Processor.memory;

        /* put your own code here instead */

        // int a0 = cpu.gpr[4];  int a1 = cpu.gpr[5];  ...  int t3 = cpu.gpr[11];
        // float f12 = cpu.fpr[12];  float f13 = cpu.fpr[13];  ... float f19 = cpu.fpr[19];

        System.out.println("Unimplemented NID function sceKernelStdioClose [0x9D061C19]");

        cpu.gpr[2] = 0xDEADC0DE;

    // cpu.gpr[2] = (int)(result & 0xffffffff);  cpu.gpr[3] = (int)(result  32); cpu.fpr[0] = result;
    }

    public void sceKernelStdioOpen(Processor processor) {
        // CpuState cpu = processor.cpu; // New-Style Processor
        Processor cpu = processor; // Old-Style Processor
        Memory mem = Processor.memory;

        /* put your own code here instead */

        // int a0 = cpu.gpr[4];  int a1 = cpu.gpr[5];  ...  int t3 = cpu.gpr[11];
        // float f12 = cpu.fpr[12];  float f13 = cpu.fpr[13];  ... float f19 = cpu.fpr[19];

        System.out.println("Unimplemented NID function sceKernelStdioOpen [0x924ABA61]");

        cpu.gpr[2] = 0xDEADC0DE;

    // cpu.gpr[2] = (int)(result & 0xffffffff);  cpu.gpr[3] = (int)(result  32); cpu.fpr[0] = result;
    }

    public void sceKernelStdin(Processor processor) {
        // CpuState cpu = processor.cpu; // New-Style Processor
        Processor cpu = processor; // Old-Style Processor
        cpu.gpr[2] = 3;
    }

    public void sceKernelStdout(Processor processor) {
        // CpuState cpu = processor.cpu; // New-Style Processor
        Processor cpu = processor; // Old-Style Processor
        cpu.gpr[2] = 1;
    }

    public void sceKernelStderr(Processor processor) {
        // CpuState cpu = processor.cpu; // New-Style Processor
        Processor cpu = processor; // Old-Style Processor
        cpu.gpr[2] = 2;
    }
    public final HLEModuleFunction sceKernelStdioReadFunction = new HLEModuleFunction("StdioForUser", "sceKernelStdioRead") {

        @Override
        public final void execute(Processor processor) {
            sceKernelStdioRead(processor);
        }

        @Override
        public final String compiledString() {
            return "jpcsp.HLE.modules150.StdioForUserModule.sceKernelStdioRead(processor);";
        }
    };
    public final HLEModuleFunction sceKernelStdioLseekFunction = new HLEModuleFunction("StdioForUser", "sceKernelStdioLseek") {

        @Override
        public final void execute(Processor processor) {
            sceKernelStdioLseek(processor);
        }

        @Override
        public final String compiledString() {
            return "jpcsp.HLE.modules150.StdioForUserModule.sceKernelStdioLseek(processor);";
        }
    };
    public final HLEModuleFunction sceKernelStdioSendCharFunction = new HLEModuleFunction("StdioForUser", "sceKernelStdioSendChar") {

        @Override
        public final void execute(Processor processor) {
            sceKernelStdioSendChar(processor);
        }

        @Override
        public final String compiledString() {
            return "jpcsp.HLE.modules150.StdioForUserModule.sceKernelStdioSendChar(processor);";
        }
    };
    public final HLEModuleFunction sceKernelStdioWriteFunction = new HLEModuleFunction("StdioForUser", "sceKernelStdioWrite") {

        @Override
        public final void execute(Processor processor) {
            sceKernelStdioWrite(processor);
        }

        @Override
        public final String compiledString() {
            return "jpcsp.HLE.modules150.StdioForUserModule.sceKernelStdioWrite(processor);";
        }
    };
    public final HLEModuleFunction sceKernelStdioCloseFunction = new HLEModuleFunction("StdioForUser", "sceKernelStdioClose") {

        @Override
        public final void execute(Processor processor) {
            sceKernelStdioClose(processor);
        }

        @Override
        public final String compiledString() {
            return "jpcsp.HLE.modules150.StdioForUserModule.sceKernelStdioClose(processor);";
        }
    };
    public final HLEModuleFunction sceKernelStdioOpenFunction = new HLEModuleFunction("StdioForUser", "sceKernelStdioOpen") {

        @Override
        public final void execute(Processor processor) {
            sceKernelStdioOpen(processor);
        }

        @Override
        public final String compiledString() {
            return "jpcsp.HLE.modules150.StdioForUserModule.sceKernelStdioOpen(processor);";
        }
    };
    public final HLEModuleFunction sceKernelStdinFunction = new HLEModuleFunction("StdioForUser", "sceKernelStdin") {

        @Override
        public final void execute(Processor processor) {
            sceKernelStdin(processor);
        }

        @Override
        public final String compiledString() {
            return "jpcsp.HLE.modules150.StdioForUserModule.sceKernelStdin(processor);";
        }
    };
    public final HLEModuleFunction sceKernelStdoutFunction = new HLEModuleFunction("StdioForUser", "sceKernelStdout") {

        @Override
        public final void execute(Processor processor) {
            sceKernelStdout(processor);
        }

        @Override
        public final String compiledString() {
            return "jpcsp.HLE.modules150.StdioForUserModule.sceKernelStdout(processor);";
        }
    };
    public final HLEModuleFunction sceKernelStderrFunction = new HLEModuleFunction("StdioForUser", "sceKernelStderr") {

        @Override
        public final void execute(Processor processor) {
            sceKernelStderr(processor);
        }

        @Override
        public final String compiledString() {
            return "jpcsp.HLE.modules150.StdioForUserModule.sceKernelStderr(processor);";
        }
    };
};
