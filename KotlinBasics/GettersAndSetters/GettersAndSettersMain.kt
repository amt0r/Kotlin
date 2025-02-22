package KotlinBasics.GettersAndSetters

fun convertToUsd (value: Int): Int {
    return value*42
}

fun main() {
    println(convertToUsd(75))
    println(convertToUsd(100))
    println(convertToUsd(150))

    val guide = Guide()
    guide.setTittle("Don't panic")
    println(guide.getTittle())
}