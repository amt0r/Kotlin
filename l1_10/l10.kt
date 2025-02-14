package org.example.`1_10`

fun main() {
    val name = getName()
    function(name, getAge())
}

fun getName(): String = readln()

fun getAge(): Int? {
    val age = readLine()?.toInt()
    return age
}

fun function(name: String, age: Int?): Unit {
    println(name + ' ' + age)
}