package abstractFactory

import base.deviceFactoryHelper
import base.factory.DeviceFactoryType
import base.factory.DeviceType
import base.factory.factoryGenerator

object Client {

    @JvmStatic
    fun main(args: Array<String>) {

        val dell = factoryGenerator.getInstance(DeviceFactoryType.LAPTOP).getGadget(DeviceType.DELL)
        println(dell)

        val hp = factoryGenerator.getInstance(DeviceFactoryType.LAPTOP).getGadget(DeviceType.HP)
        println(hp)

        val onePlus = factoryGenerator.getInstance(DeviceFactoryType.MOBILE).getGadget(DeviceType.OnePlus)
        println(onePlus)

        val nokia = factoryGenerator.getInstance(DeviceFactoryType.MOBILE).getGadget(DeviceType.NOKIA)
        println(nokia)

        //Concise Way
        val dell1 = deviceFactoryHelper.getDevice(DeviceFactoryType.LAPTOP, DeviceType.DELL)
        println(dell1)
    }
}

//https://www.youtube.com/watch?v=j50FusMmUMw
//Abstract Factory patterns work around a super-factory which creates other factories. This factory is also called as factory of factories. This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.

//........................................................DOCS....................................................................
//https://refactoring.guru/design-patterns/abstract-factory
//https://sourcemaking.com/design_patterns/abstract_factory
//https://www.geeksforgeeks.org/abstract-factory-pattern/
//https://www.tutorialspoint.com/design_pattern/abstract_factory_pattern.htm