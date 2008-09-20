/* This autogenerated file is part of jpcsp. */
package jpcsp.HLE.modules;

import jpcsp.HLE.pspSysMem;
import jpcsp.Memory;
import jpcsp.Processor;

public class sceUtility_driver implements HLEModule {

    @Override
    public final String getName() {
        return "sceUtility_driver";
    }

    @Override
    public void installModule(HLEModuleManager mm, int version) {

        mm.add(sceUtilityInit, 0xF062AEA6);

        mm.add(sceUtilityEnd, 0x20C68C34);

    }

    @Override
    public void uninstallModule(HLEModuleManager mm, int version) {

        mm.remove(sceUtilityInit);

        mm.remove(sceUtilityEnd);

    }
    public static final HLEModuleFunction sceUtilityInit = new HLEModuleFunction("sceUtility_driver", "sceUtilityInit") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceUtilityInit [0xF062AEA6]");
        }
    };
    public static final HLEModuleFunction sceUtilityEnd = new HLEModuleFunction("sceUtility_driver", "sceUtilityEnd") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceUtilityEnd [0x20C68C34]");
        }
    };
};
