package base.factory.factories

import base.Device
import base.factory.AbstractDeviceFactory
import base.factory.DeviceType
import base.types.Dell
import base.types.HP
import base.types.Nokia
import base.types.OnePlus
import java.lang.Exception

class MobileFactory : AbstractDeviceFactory() {


    override fun getGadget(deviceType: DeviceType): Device {

        return when (deviceType) {
            DeviceType.NOKIA -> Nokia(12.5, "amd")
            DeviceType.OnePlus -> OnePlus(5.5, "intel")
            else -> throw Exception("not existed Device Type")
        }
    }
}