package base

import base.factory.DeviceFactoryType
import base.factory.DeviceType
import base.factory.factoryGenerator

val deviceFactoryHelper by lazy { DeviceFactoryHelper() }

class DeviceFactoryHelper {

    fun getDevice(factoryType: DeviceFactoryType, deviceType: DeviceType) =
        factoryGenerator.getInstance(factoryType).getGadget(deviceType)
}