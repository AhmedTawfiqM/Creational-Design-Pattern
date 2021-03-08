package base

interface Device {
    var ram: Double
    var processorType: String

    fun configure()
}

abstract class AbstractDevice {

    abstract var ram: Double
    abstract var processorType: String

    init {
        print()
    }

    abstract fun configure()

    private fun print() {
        println("ram : $ram : processorType : $processorType")
    }
}