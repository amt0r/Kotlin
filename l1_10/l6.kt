package org.example.`1_10`

fun main() {
    var counter = 5
    while (counter > 0) {
        println("До кінця: ${counter--}")
        Thread.sleep(1000)
    }
}