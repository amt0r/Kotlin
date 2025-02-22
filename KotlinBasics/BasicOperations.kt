package KotlinBasics

fun main() {
    val a = 5
    val b = 7
    val sum: Int = a + b

    println(sum)
    println(10 % 2)
    println(10 / 3)
    println(10 / 3f)

    println(sum::class.java.simpleName)
    println(Int::class)

    fun dsa() {

    }

    println(::dsa)
    val test: Double = 2.0
    println(test)

    var counter = 0

    counter = counter + 1
    counter += 1
    counter++
    println(counter)
}