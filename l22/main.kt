package l22

fun main() {

    val word = Word("red", "червоний")
    println(word)

}

data class Word(
    val text: String,
    val translate: String,
)