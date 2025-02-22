package KotlinBasics.ClassesAndConstructors

fun main() {
    val dish1: Dish = Dish(1, "Яйця бенедикт", "Сніданок", listOf("Яйце", "Хліб", "Бекон", "Соус"),)
    val dish2: Dish = Dish(2, "dsa", "dsa", listOf("dsa", "dsa"), true, "dsads")
    println(dish1.ingredients)
    dish2.addToFavourite()
    val ingr = dish1.dowloadIngredients()
    println(ingr)
    println(dish2.inFavourites)
}