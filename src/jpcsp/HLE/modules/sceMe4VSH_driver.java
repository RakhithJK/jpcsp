/* This autogenerated file is part of jpcsp. */
package jpcsp.HLE.modules;

import jpcsp.HLE.pspSysMem;
import jpcsp.Memory;
import jpcsp.Processor;

public class sceMe4VSH_driver implements HLEModule {

    @Override
    public final String getName() {
        return "sceMe4VSH_driver";
    }

    @Override
    public void installModule(HLEModuleManager mm, int version) {

        mm.add(sceMe4VSH_driver_99CBCF35, 0x99CBCF35);

    }

    @Override
    public void uninstallModule(HLEModuleManager mm, int version) {

        mm.remove(sceMe4VSH_driver_99CBCF35);

    }
    public static final HLEModuleFunction sceMe4VSH_driver_99CBCF35 = new HLEModuleFunction("sceMe4VSH_driver", "sceMe4VSH_driver_99CBCF35") {

        @Override
        public void execute(Processor cpu, Memory mem) {
            System.out.println("Unimplement function sceMe4VSH_driver_99CBCF35 [0x99CBCF35]");
        }
    };
};
