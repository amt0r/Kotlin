package KotlinBasics.CustomSettersAndGetters

fun main() {

    val fish = BubleFish(8)
    fish.nervousSignalLevel=301
    println(fish.nervousSignalLevel)
    println(fish.isTransleted)
}