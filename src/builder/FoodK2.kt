package builder

//Best Practice in Kotlin
data class FoodK2(
    val infoFood: InfoFood
) {

    class Builder(id: String) {  //todo 'id' is Mandatory - if there is more mandatory fields dont make it in Constructor
        val infoFood = InfoFood()

        init {
            infoFood.id= id
        }
        fun bread(bread: String) = apply { infoFood.bread = bread }
        fun condiments(condiments: String) = apply { infoFood.condiments = condiments }
        fun meat(meat: String) = apply { infoFood.meat = meat }
        fun fish(fish: String) = apply { infoFood.fish = fish }
        fun build(): FoodK2 {
            if (infoFood.bread != "")
                return FoodK2(infoFood)
            else throw IllegalStateException("can't create Valid Object")
        }
    }
}