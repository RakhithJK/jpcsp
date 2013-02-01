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
package jpcsp.HLE.modules500;

import jpcsp.HLE.HLEFunction;
import jpcsp.HLE.HLELogging;
import jpcsp.HLE.TPointer;

@HLELogging
public class sceUtility extends jpcsp.HLE.modules303.sceUtility {
	protected UtilityDialogState storeCheckoutState;

	@Override
	public void start() {
		storeCheckoutState = new NotImplementedUtilityDialogState("sceUtilityStoreCheckout");

		super.start();
	}

	@HLEFunction(nid = 0xDA97F1AA, version = 500)
	public int sceUtilityStoreCheckoutInitStart(TPointer paramsAddr) {
		return storeCheckoutState.executeInitStart(paramsAddr);
	}

	@HLEFunction(nid = 0x54A5C62F, version = 500)
	public int sceUtilityStoreCheckoutShutdownStart() {
		return storeCheckoutState.executeShutdownStart();
	}

	@HLEFunction(nid = 0xB8592D5F, version = 500)
	public int sceUtilityStoreCheckoutUpdate(int drawSpeed) {
		return storeCheckoutState.executeUpdate(drawSpeed);
	}

	@HLEFunction(nid = 0x3AAD51DC, version = 500)
	public int sceUtilityStoreCheckoutGetStatus() {
		return storeCheckoutState.executeGetStatus();
	}
}
