package org.example.`1_10`

fun main() {
    val range1: IntRange = 31..422
    val range2: IntRange = 31 until 422
    val range3: CharRange = 'a'..'z'
    val range4: ClosedRange<Double> = 31.1..321.21
    val range5: IntProgression = 32..321 step 2
    val range6: IntProgression = 32 downTo 1 step 2

    val a = 52 in range1
    val b = 52 !in range1

    println(a)
    println(b)

    for (i in 5 downTo 1) {
        if (i == 3) break
        println("ds: $i")
        Thread.sleep(1000)
    }

    for(i in range2 step 8){
        println(i)
    }
}