/* This autogenerated file is part of jpcsp. */
package jpcsp.HLE.modules;

import jpcsp.HLE.pspSysMem;
import jpcsp.Memory;
import jpcsp.Processor;

public class SysMemForKernel implements HLEModule {

    @Override
    public final String getName() {
        return "SysMemForKernel";
    }

    @Override
    public void installModule(HLEModuleManager mm, int version) {

        mm.add(sceKernelCreateHeap, 0x1C1FBFE7);

        mm.add(sceKernelDeleteHeap, 0xC9805775);

        mm.add(sceKernelAllocHeapMemoryWithOption, 0xEB7A74DB);

        mm.add(sceKernelAllocHeapMemory, 0x636C953B);

        mm.add(sceKernelFreeHeapMemory, 0x7B749390);

        mm.add(sceKernelHeapTotalFreeSize, 0xA823047E);

        mm.add(sceKernelGetHeapTypeCB, 0xB2163AA1);

        mm.add(SysMemForKernel_EFF0C6DD, 0xEFF0C6DD);

        mm.add(SysMemForKernel_EFEEBAC7, 0xEFEEBAC7);

        mm.add(sceKernelIsValidHeap, 0x2DB687E9);

        mm.add(sceKernelQueryMemoryPartitionInfo, 0x55A40B2C);

        mm.add(sceKernelPartitionMaxFreeMemSize, 0xE6581468);

        mm.add(sceKernelPartitionTotalFreeMemSize, 0x9697CD32);

        mm.add(sceKernelFillFreeBlock, 0xA2A65F0E);

        mm.add(sceKernelAllocPartitionMemory, 0x237DBD4F);

        mm.add(sceKernelSizeLockMemoryBlock, 0xEE867074);

        mm.add(sceKernelResizeMemoryBlock, 0xCE5544F4);

        mm.add(sceKernelJointMemoryBlock, 0x5EBE73DE);

        mm.add(SysMemForKernel_915EF4AC, 0x915EF4AC);

        mm.add(sceKernelFreePartitionMemory, 0xB6D61D02);

        mm.add(sceKernelQueryMemoryInfo, 0x2A3E5280);

        mm.add(sceKernelQueryBlockSize, 0xEB4C0E1B);

        mm.add(sceKernelQueryMemoryBlockInfo, 0x82CCA14F);

        mm.add(sceKernelGetBlockHeadAddr, 0x9D9A5BA1);

        mm.add(SysMemForKernel_2F3B7611, 0x2F3B7611);

        mm.add(sceKernelMemoryExtendSize, 0x7B3E7441);

        mm.add(sceKernelSetDdrMemoryProtection, 0xB2C7AA36);

        mm.add(sceKernelCallUIDFunction, 0x6C1DCD41);

        mm.add(sceKernelCallUIDObjFunction, 0x5367923C);

        mm.add(SysMemForKernel_CE05CCB7, 0xCE05CCB7);

        mm.add(sceKernelLookupUIDFunction, 0x6CD838EC);

        mm.add(sceKernelCreateUIDtypeInherit, 0xAD09C397);

        mm.add(sceKernelCreateUIDtype, 0xFEFC8666);

        mm.add(sceKernelDeleteUIDtype, 0xD1BAB054);

        mm.add(sceKernelGetUIDname, 0x1C221A08);

        mm.add(sceKernelRenameUID, 0x2E3402CC);

        mm.add(sceKernelGetUIDtype, 0x39357F07);

        mm.add(sceKernelCreateUID, 0x89A74008);

        mm.add(sceKernelDeleteUID, 0x8F20C4C0);

        mm.add(sceKernelSearchUIDbyName, 0x55BFD686);

        mm.add(sceKernelGetUIDcontrolBlock, 0xCF4DE78C);

        mm.add(sceKernelGetUIDcontrolBlockWithType, 0x41FFC7F9);

        mm.add(SysMemForKernel_82D3CEE3, 0x82D3CEE3);

        mm.add(SysMemForKernel_FC207849, 0xFC207849);

        mm.add(SysMemForKernel_536AD5E1, 0x536AD5E1);

        mm.add(sceKernelIsHold, 0xDFAEBD5B);

        mm.add(sceKernelHoldUID, 0x7BE95FA0);

        mm.add(sceKernelReleaseUID, 0xFE8DEBE0);

        mm.add(sceKernelSysmemIsValidAccess, 0xBD5941B4);

        mm.add(sceKernelIsValidUserAccess, 0x80F25772);

        mm.add(sceKernelSysMemCheckCtlBlk, 0x3905D956);

        mm.add(sceKernelSysMemDump, 0x26F96157);

        mm.add(sceKernelSysMemDumpBlock, 0x6D6200DD);

        mm.add(sceKernelSysMemDumpTail, 0x621037F5);

        mm.add(sceKernelMemset, 0xA089ECA4);

        mm.add(sceKernelMemset32, 0x2F808748);

        mm.add(sceKernelMemmove, 0x1C4B1713);

        mm.add(sceKernelSysMemInit, 0xE400FDB0);

        mm.add(sceKernelSysMemMemSize, 0x1890BE9C);

        mm.add(sceKernelSysMemMaxFreeMemSize, 0x03072750);

        mm.add(sceKernelSysMemTotalFreeMemSize, 0x811BED79);

        mm.add(sceKernelGetSysMemoryInfo, 0xF6C10E27);

        mm.add(SysMemForKernel_CDA3A2F7, 0xCDA3A2F7);

        mm.add(SysMemForKernel_960B888C, 0x960B888C);

        mm.add(sceKernelDevkitVersion, 0x3FC9AE6A);

        mm.add(sceKernelGetSystemStatus, 0x452E3696);

        mm.add(sceKernelSetSystemStatus, 0x95F5E8DA);

    }

    @Override
    public void uninstallModule(HLEModuleManager mm, int version) {

        mm.remove(sceKernelCreateHeap);

        mm.remove(sceKernelDeleteHeap);

        mm.remove(sceKernelAllocHeapMemoryWithOption);

        mm.remove(sceKernelAllocHeapMemory);

        mm.remove(sceKernelFreeHeapMemory);

        mm.remove(sceKernelHeapTotalFreeSize);

        mm.remove(sceKernelGetHeapTypeCB);

        mm.remove(SysMemForKernel_EFF0C6DD);

        mm.remove(SysMemForKernel_EFEEBAC7);

        mm.remove(sceKernelIsValidHeap);

        mm.remove(sceKernelQueryMemoryPartitionInfo);

        mm.remove(sceKernelPartitionMaxFreeMemSize);

        mm.remove(sceKernelPartitionTotalFreeMemSize);

        mm.remove(sceKernelFillFreeBlock);

        mm.remove(sceKernelAllocPartitionMemory);

        mm.remove(sceKernelSizeLockMemoryBlock);

        mm.remove(sceKernelResizeMemoryBlock);

        mm.remove(sceKernelJointMemoryBlock);

        mm.remove(SysMemForKernel_915EF4AC);

        mm.remove(sceKernelFreePartitionMemory);

        mm.remove(sceKernelQueryMemoryInfo);

        mm.remove(sceKernelQueryBlockSize);

        mm.remove(sceKernelQueryMemoryBlockInfo);

        mm.remove(sceKernelGetBlockHeadAddr);

        mm.remove(SysMemForKernel_2F3B7611);

        mm.remove(sceKernelMemoryExtendSize);

        mm.remove(sceKernelSetDdrMemoryProtection);

        mm.remove(sceKernelCallUIDFunction);

        mm.remove(sceKernelCallUIDObjFunction);

        mm.remove(SysMemForKernel_CE05CCB7);

        mm.remove(sceKernelLookupUIDFunction);

        mm.remove(sceKernelCreateUIDtypeInherit);

        mm.remove(sceKernelCreateUIDtype);

        mm.remove(sceKernelDeleteUIDtype);

        mm.remove(sceKernelGetUIDname);

        mm.remove(sceKernelRenameUID);

        mm.remove(sceKernelGetUIDtype);

        mm.remove(sceKernelCreateUID);

        mm.remove(sceKernelDeleteUID);

        mm.remove(sceKernelSearchUIDbyName);

        mm.remove(sceKernelGetUIDcontrolBlock);

        mm.remove(sceKernelGetUIDcontrolBlockWithType);

        mm.remove(SysMemForKernel_82D3CEE3);

        mm.remove(SysMemForKernel_FC207849);

        mm.remove(SysMemForKernel_536AD5E1);

        mm.remove(sceKernelIsHold);

        mm.remove(sceKernelHoldUID);

        mm.remove(sceKernelReleaseUID);

        mm.remove(sceKernelSysmemIsValidAccess);

        mm.remove(sceKernelIsValidUserAccess);

        mm.remove(sceKernelSysMemCheckCtlBlk);

        mm.remove(sceKernelSysMemDump);

        mm.remove(sceKernelSysMemDumpBlock);

        mm.remove(sceKernelSysMemDumpTail);

        mm.remove(sceKernelMemset);

        mm.remove(sceKernelMemset32);

        mm.remove(sceKernelMemmove);

        mm.remove(sceKernelSysMemInit);

        mm.remove(sceKernelSysMemMemSize);

        mm.remove(sceKernelSysMemMaxFreeMemSize);

        mm.remove(sceKernelSysMemTotalFreeMemSize);

        mm.remove(sceKernelGetSysMemoryInfo);

        mm.remove(SysMemForKernel_CDA3A2F7);

        mm.remove(SysMemForKernel_960B888C);

        mm.remove(sceKernelDevkitVersion);

        mm.remove(sceKernelGetSystemStatus);

        mm.remove(sceKernelSetSystemStatus);

    }
    public static final HLEModuleFunction sceKernelCreateHeap = new HLEModuleFunction("SysMemForKernel", "sceKernelCreateHeap") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceKernelCreateHeap [0x1C1FBFE7]");
        }
    };
    public static final HLEModuleFunction sceKernelDeleteHeap = new HLEModuleFunction("SysMemForKernel", "sceKernelDeleteHeap") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceKernelDeleteHeap [0xC9805775]");
        }
    };
    public static final HLEModuleFunction sceKernelAllocHeapMemoryWithOption = new HLEModuleFunction("SysMemForKernel", "sceKernelAllocHeapMemoryWithOption") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceKernelAllocHeapMemoryWithOption [0xEB7A74DB]");
        }
    };
    public static final HLEModuleFunction sceKernelAllocHeapMemory = new HLEModuleFunction("SysMemForKernel", "sceKernelAllocHeapMemory") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceKernelAllocHeapMemory [0x636C953B]");
        }
    };
    public static final HLEModuleFunction sceKernelFreeHeapMemory = new HLEModuleFunction("SysMemForKernel", "sceKernelFreeHeapMemory") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceKernelFreeHeapMemory [0x7B749390]");
        }
    };
    public static final HLEModuleFunction sceKernelHeapTotalFreeSize = new HLEModuleFunction("SysMemForKernel", "sceKernelHeapTotalFreeSize") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceKernelHeapTotalFreeSize [0xA823047E]");
        }
    };
    public static final HLEModuleFunction sceKernelGetHeapTypeCB = new HLEModuleFunction("SysMemForKernel", "sceKernelGetHeapTypeCB") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceKernelGetHeapTypeCB [0xB2163AA1]");
        }
    };
    public static final HLEModuleFunction SysMemForKernel_EFF0C6DD = new HLEModuleFunction("SysMemForKernel", "SysMemForKernel_EFF0C6DD") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function SysMemForKernel_EFF0C6DD [0xEFF0C6DD]");
        }
    };
    public static final HLEModuleFunction SysMemForKernel_EFEEBAC7 = new HLEModuleFunction("SysMemForKernel", "SysMemForKernel_EFEEBAC7") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function SysMemForKernel_EFEEBAC7 [0xEFEEBAC7]");
        }
    };
    public static final HLEModuleFunction sceKernelIsValidHeap = new HLEModuleFunction("SysMemForKernel", "sceKernelIsValidHeap") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceKernelIsValidHeap [0x2DB687E9]");
        }
    };
    public static final HLEModuleFunction sceKernelQueryMemoryPartitionInfo = new HLEModuleFunction("SysMemForKernel", "sceKernelQueryMemoryPartitionInfo") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceKernelQueryMemoryPartitionInfo [0x55A40B2C]");
        }
    };
    public static final HLEModuleFunction sceKernelPartitionMaxFreeMemSize = new HLEModuleFunction("SysMemForKernel", "sceKernelPartitionMaxFreeMemSize") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceKernelPartitionMaxFreeMemSize [0xE6581468]");
        }
    };
    public static final HLEModuleFunction sceKernelPartitionTotalFreeMemSize = new HLEModuleFunction("SysMemForKernel", "sceKernelPartitionTotalFreeMemSize") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceKernelPartitionTotalFreeMemSize [0x9697CD32]");
        }
    };
    public static final HLEModuleFunction sceKernelFillFreeBlock = new HLEModuleFunction("SysMemForKernel", "sceKernelFillFreeBlock") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceKernelFillFreeBlock [0xA2A65F0E]");
        }
    };
    public static final HLEModuleFunction sceKernelAllocPartitionMemory = new HLEModuleFunction("SysMemForKernel", "sceKernelAllocPartitionMemory") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceKernelAllocPartitionMemory [0x237DBD4F]");
        }
    };
    public static final HLEModuleFunction sceKernelSizeLockMemoryBlock = new HLEModuleFunction("SysMemForKernel", "sceKernelSizeLockMemoryBlock") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceKernelSizeLockMemoryBlock [0xEE867074]");
        }
    };
    public static final HLEModuleFunction sceKernelResizeMemoryBlock = new HLEModuleFunction("SysMemForKernel", "sceKernelResizeMemoryBlock") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceKernelResizeMemoryBlock [0xCE5544F4]");
        }
    };
    public static final HLEModuleFunction sceKernelJointMemoryBlock = new HLEModuleFunction("SysMemForKernel", "sceKernelJointMemoryBlock") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceKernelJointMemoryBlock [0x5EBE73DE]");
        }
    };
    public static final HLEModuleFunction SysMemForKernel_915EF4AC = new HLEModuleFunction("SysMemForKernel", "SysMemForKernel_915EF4AC") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function SysMemForKernel_915EF4AC [0x915EF4AC]");
        }
    };
    public static final HLEModuleFunction sceKernelFreePartitionMemory = new HLEModuleFunction("SysMemForKernel", "sceKernelFreePartitionMemory") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceKernelFreePartitionMemory [0xB6D61D02]");
        }
    };
    public static final HLEModuleFunction sceKernelQueryMemoryInfo = new HLEModuleFunction("SysMemForKernel", "sceKernelQueryMemoryInfo") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceKernelQueryMemoryInfo [0x2A3E5280]");
        }
    };
    public static final HLEModuleFunction sceKernelQueryBlockSize = new HLEModuleFunction("SysMemForKernel", "sceKernelQueryBlockSize") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceKernelQueryBlockSize [0xEB4C0E1B]");
        }
    };
    public static final HLEModuleFunction sceKernelQueryMemoryBlockInfo = new HLEModuleFunction("SysMemForKernel", "sceKernelQueryMemoryBlockInfo") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceKernelQueryMemoryBlockInfo [0x82CCA14F]");
        }
    };
    public static final HLEModuleFunction sceKernelGetBlockHeadAddr = new HLEModuleFunction("SysMemForKernel", "sceKernelGetBlockHeadAddr") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceKernelGetBlockHeadAddr [0x9D9A5BA1]");
        }
    };
    public static final HLEModuleFunction SysMemForKernel_2F3B7611 = new HLEModuleFunction("SysMemForKernel", "SysMemForKernel_2F3B7611") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function SysMemForKernel_2F3B7611 [0x2F3B7611]");
        }
    };
    public static final HLEModuleFunction sceKernelMemoryExtendSize = new HLEModuleFunction("SysMemForKernel", "sceKernelMemoryExtendSize") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceKernelMemoryExtendSize [0x7B3E7441]");
        }
    };
    public static final HLEModuleFunction sceKernelSetDdrMemoryProtection = new HLEModuleFunction("SysMemForKernel", "sceKernelSetDdrMemoryProtection") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceKernelSetDdrMemoryProtection [0xB2C7AA36]");
        }
    };
    public static final HLEModuleFunction sceKernelCallUIDFunction = new HLEModuleFunction("SysMemForKernel", "sceKernelCallUIDFunction") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceKernelCallUIDFunction [0x6C1DCD41]");
        }
    };
    public static final HLEModuleFunction sceKernelCallUIDObjFunction = new HLEModuleFunction("SysMemForKernel", "sceKernelCallUIDObjFunction") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceKernelCallUIDObjFunction [0x5367923C]");
        }
    };
    public static final HLEModuleFunction SysMemForKernel_CE05CCB7 = new HLEModuleFunction("SysMemForKernel", "SysMemForKernel_CE05CCB7") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function SysMemForKernel_CE05CCB7 [0xCE05CCB7]");
        }
    };
    public static final HLEModuleFunction sceKernelLookupUIDFunction = new HLEModuleFunction("SysMemForKernel", "sceKernelLookupUIDFunction") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceKernelLookupUIDFunction [0x6CD838EC]");
        }
    };
    public static final HLEModuleFunction sceKernelCreateUIDtypeInherit = new HLEModuleFunction("SysMemForKernel", "sceKernelCreateUIDtypeInherit") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceKernelCreateUIDtypeInherit [0xAD09C397]");
        }
    };
    public static final HLEModuleFunction sceKernelCreateUIDtype = new HLEModuleFunction("SysMemForKernel", "sceKernelCreateUIDtype") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceKernelCreateUIDtype [0xFEFC8666]");
        }
    };
    public static final HLEModuleFunction sceKernelDeleteUIDtype = new HLEModuleFunction("SysMemForKernel", "sceKernelDeleteUIDtype") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceKernelDeleteUIDtype [0xD1BAB054]");
        }
    };
    public static final HLEModuleFunction sceKernelGetUIDname = new HLEModuleFunction("SysMemForKernel", "sceKernelGetUIDname") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceKernelGetUIDname [0x1C221A08]");
        }
    };
    public static final HLEModuleFunction sceKernelRenameUID = new HLEModuleFunction("SysMemForKernel", "sceKernelRenameUID") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceKernelRenameUID [0x2E3402CC]");
        }
    };
    public static final HLEModuleFunction sceKernelGetUIDtype = new HLEModuleFunction("SysMemForKernel", "sceKernelGetUIDtype") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceKernelGetUIDtype [0x39357F07]");
        }
    };
    public static final HLEModuleFunction sceKernelCreateUID = new HLEModuleFunction("SysMemForKernel", "sceKernelCreateUID") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceKernelCreateUID [0x89A74008]");
        }
    };
    public static final HLEModuleFunction sceKernelDeleteUID = new HLEModuleFunction("SysMemForKernel", "sceKernelDeleteUID") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceKernelDeleteUID [0x8F20C4C0]");
        }
    };
    public static final HLEModuleFunction sceKernelSearchUIDbyName = new HLEModuleFunction("SysMemForKernel", "sceKernelSearchUIDbyName") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceKernelSearchUIDbyName [0x55BFD686]");
        }
    };
    public static final HLEModuleFunction sceKernelGetUIDcontrolBlock = new HLEModuleFunction("SysMemForKernel", "sceKernelGetUIDcontrolBlock") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceKernelGetUIDcontrolBlock [0xCF4DE78C]");
        }
    };
    public static final HLEModuleFunction sceKernelGetUIDcontrolBlockWithType = new HLEModuleFunction("SysMemForKernel", "sceKernelGetUIDcontrolBlockWithType") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceKernelGetUIDcontrolBlockWithType [0x41FFC7F9]");
        }
    };
    public static final HLEModuleFunction SysMemForKernel_82D3CEE3 = new HLEModuleFunction("SysMemForKernel", "SysMemForKernel_82D3CEE3") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function SysMemForKernel_82D3CEE3 [0x82D3CEE3]");
        }
    };
    public static final HLEModuleFunction SysMemForKernel_FC207849 = new HLEModuleFunction("SysMemForKernel", "SysMemForKernel_FC207849") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function SysMemForKernel_FC207849 [0xFC207849]");
        }
    };
    public static final HLEModuleFunction SysMemForKernel_536AD5E1 = new HLEModuleFunction("SysMemForKernel", "SysMemForKernel_536AD5E1") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function SysMemForKernel_536AD5E1 [0x536AD5E1]");
        }
    };
    public static final HLEModuleFunction sceKernelIsHold = new HLEModuleFunction("SysMemForKernel", "sceKernelIsHold") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceKernelIsHold [0xDFAEBD5B]");
        }
    };
    public static final HLEModuleFunction sceKernelHoldUID = new HLEModuleFunction("SysMemForKernel", "sceKernelHoldUID") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceKernelHoldUID [0x7BE95FA0]");
        }
    };
    public static final HLEModuleFunction sceKernelReleaseUID = new HLEModuleFunction("SysMemForKernel", "sceKernelReleaseUID") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceKernelReleaseUID [0xFE8DEBE0]");
        }
    };
    public static final HLEModuleFunction sceKernelSysmemIsValidAccess = new HLEModuleFunction("SysMemForKernel", "sceKernelSysmemIsValidAccess") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceKernelSysmemIsValidAccess [0xBD5941B4]");
        }
    };
    public static final HLEModuleFunction sceKernelIsValidUserAccess = new HLEModuleFunction("SysMemForKernel", "sceKernelIsValidUserAccess") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceKernelIsValidUserAccess [0x80F25772]");
        }
    };
    public static final HLEModuleFunction sceKernelSysMemCheckCtlBlk = new HLEModuleFunction("SysMemForKernel", "sceKernelSysMemCheckCtlBlk") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceKernelSysMemCheckCtlBlk [0x3905D956]");
        }
    };
    public static final HLEModuleFunction sceKernelSysMemDump = new HLEModuleFunction("SysMemForKernel", "sceKernelSysMemDump") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceKernelSysMemDump [0x26F96157]");
        }
    };
    public static final HLEModuleFunction sceKernelSysMemDumpBlock = new HLEModuleFunction("SysMemForKernel", "sceKernelSysMemDumpBlock") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceKernelSysMemDumpBlock [0x6D6200DD]");
        }
    };
    public static final HLEModuleFunction sceKernelSysMemDumpTail = new HLEModuleFunction("SysMemForKernel", "sceKernelSysMemDumpTail") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceKernelSysMemDumpTail [0x621037F5]");
        }
    };
    public static final HLEModuleFunction sceKernelMemset = new HLEModuleFunction("SysMemForKernel", "sceKernelMemset") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceKernelMemset [0xA089ECA4]");
        }
    };
    public static final HLEModuleFunction sceKernelMemset32 = new HLEModuleFunction("SysMemForKernel", "sceKernelMemset32") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceKernelMemset32 [0x2F808748]");
        }
    };
    public static final HLEModuleFunction sceKernelMemmove = new HLEModuleFunction("SysMemForKernel", "sceKernelMemmove") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceKernelMemmove [0x1C4B1713]");
        }
    };
    public static final HLEModuleFunction sceKernelSysMemInit = new HLEModuleFunction("SysMemForKernel", "sceKernelSysMemInit") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceKernelSysMemInit [0xE400FDB0]");
        }
    };
    public static final HLEModuleFunction sceKernelSysMemMemSize = new HLEModuleFunction("SysMemForKernel", "sceKernelSysMemMemSize") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceKernelSysMemMemSize [0x1890BE9C]");
        }
    };
    public static final HLEModuleFunction sceKernelSysMemMaxFreeMemSize = new HLEModuleFunction("SysMemForKernel", "sceKernelSysMemMaxFreeMemSize") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceKernelSysMemMaxFreeMemSize [0x03072750]");
        }
    };
    public static final HLEModuleFunction sceKernelSysMemTotalFreeMemSize = new HLEModuleFunction("SysMemForKernel", "sceKernelSysMemTotalFreeMemSize") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceKernelSysMemTotalFreeMemSize [0x811BED79]");
        }
    };
    public static final HLEModuleFunction sceKernelGetSysMemoryInfo = new HLEModuleFunction("SysMemForKernel", "sceKernelGetSysMemoryInfo") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceKernelGetSysMemoryInfo [0xF6C10E27]");
        }
    };
    public static final HLEModuleFunction SysMemForKernel_CDA3A2F7 = new HLEModuleFunction("SysMemForKernel", "SysMemForKernel_CDA3A2F7") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function SysMemForKernel_CDA3A2F7 [0xCDA3A2F7]");
        }
    };
    public static final HLEModuleFunction SysMemForKernel_960B888C = new HLEModuleFunction("SysMemForKernel", "SysMemForKernel_960B888C") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function SysMemForKernel_960B888C [0x960B888C]");
        }
    };
    public static final HLEModuleFunction sceKernelDevkitVersion = new HLEModuleFunction("SysMemForKernel", "sceKernelDevkitVersion") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceKernelDevkitVersion [0x3FC9AE6A]");
        }
    };
    public static final HLEModuleFunction sceKernelGetSystemStatus = new HLEModuleFunction("SysMemForKernel", "sceKernelGetSystemStatus") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceKernelGetSystemStatus [0x452E3696]");
        }
    };
    public static final HLEModuleFunction sceKernelSetSystemStatus = new HLEModuleFunction("SysMemForKernel", "sceKernelSetSystemStatus") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceKernelSetSystemStatus [0x95F5E8DA]");
        }
    };
};
