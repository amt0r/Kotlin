package org.example.`1_10`

fun main() {
    var userAge: Int
    for (i in 1..5) {
        userAge = readln().toInt()
        val resultText =
            if (userAge >= AGE_OF_MAJORITY) "old"
            else if (userAge in 16..17) "young"
            else "very young"
        println(resultText)

        val text = when(userAge) {
            20 -> {
                println('s')
                "20"
            }
            30 -> "30"
            10 -> "10"
            else -> "dsa"
        }
        println(text)
    }
}