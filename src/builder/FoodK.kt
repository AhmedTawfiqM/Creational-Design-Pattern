package builder

data class FoodK(
    val bread: String?,
    val condiments: String?,
    val meat: String?,
    val fish: String?,
) {

    class Builder {
        var bread: String? = null
        var condiments: String? = null
        var meat: String? = null
        var fish: String? = null

        fun bread(bread: String) = apply { this.bread = bread }
        fun condiments(condiments: String) = apply { this.condiments = condiments }
        fun meat(meat: String) = apply { this.meat = meat }
        fun fish(fish: String) = apply { this.fish = fish }
        fun build(): FoodK {
            if (bread != "")
                return   FoodK(bread, condiments, meat, fish)
            else throw IllegalStateException("can't create Valid Object")
        }
    }
}


