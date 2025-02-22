package KotlinBasics.ClassesAndConstructors

class Dish(
    val id: Int,
    val name: String,
    val category: String,
    val ingredients: List<String>,
    var inFavourites: Boolean = false,
) {
    fun addToFavourite() {
        println("$name")
        inFavourites = true
    }
    fun dowloadIngredients(): List<String> {
        return ingredients
    }

    constructor(id: Int, name: String, category: String, ingredients: List<String>, inFavourites: Boolean, dsa: String): this(id, name, category, ingredients, inFavourites) {
        println(dsa)
    }

    init {
        println("INIT!")
    }
}