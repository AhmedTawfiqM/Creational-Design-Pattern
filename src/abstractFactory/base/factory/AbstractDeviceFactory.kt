package base.factory

import base.Device

abstract class AbstractDeviceFactory {
    abstract fun getGadget(deviceType: DeviceType): Device
}