/* This autogenerated file is part of jpcsp. */
package jpcsp.HLE.modules;

import jpcsp.HLE.pspSysMem;
import jpcsp.Memory;
import jpcsp.Processor;

public class sceChnnlsv_driver implements HLEModule {

    @Override
    public final String getName() {
        return "sceChnnlsv_driver";
    }

    @Override
    public void installModule(HLEModuleManager mm, int version) {

        mm.add(sceSdSetIndex, 0xE7833020);

        mm.add(sceSdRemoveValue, 0xF21A1FCA);

        mm.add(sceSdGetLastIndex, 0xC4C494F8);

        mm.add(sceSdCreateList, 0xABFDFC8B);

        mm.add(sceSdSetMember, 0x850A7FA1);

        mm.add(sceChnnlsv_driver_21BE78B4, 0x21BE78B4);

    }

    @Override
    public void uninstallModule(HLEModuleManager mm, int version) {

        mm.remove(sceSdSetIndex);

        mm.remove(sceSdRemoveValue);

        mm.remove(sceSdGetLastIndex);

        mm.remove(sceSdCreateList);

        mm.remove(sceSdSetMember);

        mm.remove(sceChnnlsv_driver_21BE78B4);

    }
    public static final HLEModuleFunction sceSdSetIndex = new HLEModuleFunction("sceChnnlsv_driver", "sceSdSetIndex") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceSdSetIndex [0xE7833020]");
        }
    };
    public static final HLEModuleFunction sceSdRemoveValue = new HLEModuleFunction("sceChnnlsv_driver", "sceSdRemoveValue") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceSdRemoveValue [0xF21A1FCA]");
        }
    };
    public static final HLEModuleFunction sceSdGetLastIndex = new HLEModuleFunction("sceChnnlsv_driver", "sceSdGetLastIndex") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceSdGetLastIndex [0xC4C494F8]");
        }
    };
    public static final HLEModuleFunction sceSdCreateList = new HLEModuleFunction("sceChnnlsv_driver", "sceSdCreateList") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceSdCreateList [0xABFDFC8B]");
        }
    };
    public static final HLEModuleFunction sceSdSetMember = new HLEModuleFunction("sceChnnlsv_driver", "sceSdSetMember") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceSdSetMember [0x850A7FA1]");
        }
    };
    public static final HLEModuleFunction sceChnnlsv_driver_21BE78B4 = new HLEModuleFunction("sceChnnlsv_driver", "sceChnnlsv_driver_21BE78B4") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceChnnlsv_driver_21BE78B4 [0x21BE78B4]");
        }
    };
};
