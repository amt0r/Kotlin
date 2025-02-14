package org.example.`1_10`

import kotlin.random.Random

fun main() {
    var numberOfOrders: Int = 33
    val welcomeString: String = "Welcome to app!"

    println(numberOfOrders)
    println(welcomeString)

    numberOfOrders = 203

    println(numberOfOrders)

    val intNum1: Int = 2147
    val longNum: Long = 3213121
    val shortNum: Short = 1
    val byteNum: Byte = 127
    val unsignedInt: UInt = 321u

    val doubleNum: Double = 32.321
    val floatNum: Float = 321.32f

    val stringAga: String = "dsa"
    val charAga: Char = 'd'

    val booleanAga: Boolean = true

    println(unsignedInt)
    println(byteNum)
    println(floatNum)
    println(booleanAga)

    numberOfOrders = Random.nextInt(99,102)

    if (numberOfOrders > 100) {
        println("більше")
    } else if (numberOfOrders < 100) {
        println("менша")
    } else println("ага")
}