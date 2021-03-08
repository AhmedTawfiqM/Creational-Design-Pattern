package base.factory.factories

import base.Device
import base.factory.AbstractDeviceFactory
import base.factory.DeviceType
import base.types.Dell
import base.types.HP
import java.lang.Exception

class LaptopFactory  : AbstractDeviceFactory() {

    override fun getGadget(deviceType: DeviceType): Device {

        return when (deviceType) {
            DeviceType.HP -> HP(12.5, "amd")
            DeviceType.DELL -> Dell(5.5, "intel")
            else -> throw Exception("not existed Device Type")
        }
    }
}