/* This autogenerated file is part of jpcsp. */
package jpcsp.HLE.modules;

import jpcsp.HLE.pspSysMem;
import jpcsp.Memory;
import jpcsp.Processor;

public class ModuleMgrForUser implements HLEModule {

    @Override
    public final String getName() {
        return "ModuleMgrForUser";
    }

    @Override
    public void installModule(HLEModuleManager mm, int version) {

        mm.add(sceKernelLoadModuleByID, 0xB7F46618);

        mm.add(sceKernelLoadModule, 0x977DE386);

        mm.add(sceKernelLoadModuleMs, 0x710F61B5);

        mm.add(sceKernelLoadModuleBufferUsbWlan, 0xF9275D98);

        mm.add(sceKernelStartModule, 0x50F0C1EC);

        mm.add(sceKernelStopModule, 0xD1FF982A);

        mm.add(sceKernelUnloadModule, 0x2E0911AA);

        mm.add(sceKernelSelfStopUnloadModule, 0xD675EBB8);

        mm.add(sceKernelStopUnloadSelfModule, 0xCC1D3699);

        mm.add(sceKernelGetModuleIdList, 0x644395E2);

        mm.add(sceKernelQueryModuleInfo, 0x748CBED9);

        mm.add(sceKernelGetModuleId, 0xF0A26395);

        mm.add(sceKernelGetModuleIdByAddress, 0xD8B73127);

    }

    @Override
    public void uninstallModule(HLEModuleManager mm, int version) {

        mm.remove(sceKernelLoadModuleByID);

        mm.remove(sceKernelLoadModule);

        mm.remove(sceKernelLoadModuleMs);

        mm.remove(sceKernelLoadModuleBufferUsbWlan);

        mm.remove(sceKernelStartModule);

        mm.remove(sceKernelStopModule);

        mm.remove(sceKernelUnloadModule);

        mm.remove(sceKernelSelfStopUnloadModule);

        mm.remove(sceKernelStopUnloadSelfModule);

        mm.remove(sceKernelGetModuleIdList);

        mm.remove(sceKernelQueryModuleInfo);

        mm.remove(sceKernelGetModuleId);

        mm.remove(sceKernelGetModuleIdByAddress);

    }
    public static final HLEModuleFunction sceKernelLoadModuleByID = new HLEModuleFunction("ModuleMgrForUser", "sceKernelLoadModuleByID") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceKernelLoadModuleByID [0xB7F46618]");
        }
    };
    public static final HLEModuleFunction sceKernelLoadModule = new HLEModuleFunction("ModuleMgrForUser", "sceKernelLoadModule") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceKernelLoadModule [0x977DE386]");
        }
    };
    public static final HLEModuleFunction sceKernelLoadModuleMs = new HLEModuleFunction("ModuleMgrForUser", "sceKernelLoadModuleMs") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceKernelLoadModuleMs [0x710F61B5]");
        }
    };
    public static final HLEModuleFunction sceKernelLoadModuleBufferUsbWlan = new HLEModuleFunction("ModuleMgrForUser", "sceKernelLoadModuleBufferUsbWlan") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceKernelLoadModuleBufferUsbWlan [0xF9275D98]");
        }
    };
    public static final HLEModuleFunction sceKernelStartModule = new HLEModuleFunction("ModuleMgrForUser", "sceKernelStartModule") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceKernelStartModule [0x50F0C1EC]");
        }
    };
    public static final HLEModuleFunction sceKernelStopModule = new HLEModuleFunction("ModuleMgrForUser", "sceKernelStopModule") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceKernelStopModule [0xD1FF982A]");
        }
    };
    public static final HLEModuleFunction sceKernelUnloadModule = new HLEModuleFunction("ModuleMgrForUser", "sceKernelUnloadModule") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceKernelUnloadModule [0x2E0911AA]");
        }
    };
    public static final HLEModuleFunction sceKernelSelfStopUnloadModule = new HLEModuleFunction("ModuleMgrForUser", "sceKernelSelfStopUnloadModule") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceKernelSelfStopUnloadModule [0xD675EBB8]");
        }
    };
    public static final HLEModuleFunction sceKernelStopUnloadSelfModule = new HLEModuleFunction("ModuleMgrForUser", "sceKernelStopUnloadSelfModule") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceKernelStopUnloadSelfModule [0xCC1D3699]");
        }
    };
    public static final HLEModuleFunction sceKernelGetModuleIdList = new HLEModuleFunction("ModuleMgrForUser", "sceKernelGetModuleIdList") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceKernelGetModuleIdList [0x644395E2]");
        }
    };
    public static final HLEModuleFunction sceKernelQueryModuleInfo = new HLEModuleFunction("ModuleMgrForUser", "sceKernelQueryModuleInfo") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceKernelQueryModuleInfo [0x748CBED9]");
        }
    };
    public static final HLEModuleFunction sceKernelGetModuleId = new HLEModuleFunction("ModuleMgrForUser", "sceKernelGetModuleId") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceKernelGetModuleId [0xF0A26395]");
        }
    };
    public static final HLEModuleFunction sceKernelGetModuleIdByAddress = new HLEModuleFunction("ModuleMgrForUser", "sceKernelGetModuleIdByAddress") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceKernelGetModuleIdByAddress [0xD8B73127]");
        }
    };
};
