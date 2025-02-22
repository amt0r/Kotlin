package KotlinBasics

fun main() {
    val ingredient1 = "One"
    val ingredient2 = "Two"
    val ingredient3 = "Three"
    val ingredient4 = "Four"
    val ingredient5 = "Five"

    val arrayOfIngredients: Array<String> = arrayOf(ingredient1, ingredient2, ingredient3, ingredient4, ingredient5)

    val intArray: IntArray = intArrayOf(4,4,4)
    val charArray: CharArray = charArrayOf('s', 's', 's')

    val intArray2 = intArrayOf(1, 2, 3, 4, 5)
//    intArray2 = intArrayOf(1, 2, 3)
    intArray2[0] = -100
    println(intArray2[0])
    println(arrayOfIngredients)

    println(arrayOfIngredients.size)
    arrayOfIngredients.set(0, "dsa")
    println(arrayOfIngredients.get(0))
    println("\n---------")
    for (i in arrayOfIngredients){
        println("${arrayOfIngredients.indexOf(i)+1}  $i")
    }
}