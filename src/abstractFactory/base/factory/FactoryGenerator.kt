package base.factory

import base.factory.factories.LaptopFactory
import base.factory.factories.MobileFactory
import java.lang.Exception

val factoryGenerator by lazy { FactoryGenerator() }

class FactoryGenerator {

    fun getInstance(factoryType: DeviceFactoryType): AbstractDeviceFactory {

        return when (factoryType) {
            DeviceFactoryType.LAPTOP -> LaptopFactory()
            DeviceFactoryType.MOBILE -> MobileFactory()
            else -> throw Exception("not existed Factory Type ..")
        }
    }
}