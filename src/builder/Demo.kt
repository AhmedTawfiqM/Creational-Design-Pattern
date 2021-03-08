package builder

import kotlin.jvm.JvmStatic

object Demo {
    @JvmStatic
    fun main(args: Array<String>) {

        //java or kotlin
        val food = Food.Builder()
            .bread("")
            .condiments("")
            .fish("")
            .meat("")
            .build()

        //full advantage of Kotlin
        val food1  = FoodK.Builder()
            .bread("test")
            .condiments("")
            .fish("")
            .meat("")
            .build()

        //AT Best Practice
        val food2 = FoodK2.Builder("ID-12")
            .bread("test")
            .condiments("")
            .fish("")
            .meat("")
            .build()
        food2.infoFood
    }
}