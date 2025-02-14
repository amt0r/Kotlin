package org.example.`1_10`

fun main() {
    val greeting = "Hello"
    val space = ' '
    val userName = "Star Lord"

    fun test(): String{
        return "dsa"
    }

    println(greeting + ' ' +userName + '!' + space + "What is your qu?")

    println("$greeting $userName! What is your qu?")

    println("To which you can respond ${test()}")

    val multiString = """
                |dasdas
            |dsfasadas
          |dsadsa
                |sdadsa
    """.trimMargin()

    println(multiString)

    val phrase = "ASdnds\"klakl\"\ndsa"
    println(phrase)
}