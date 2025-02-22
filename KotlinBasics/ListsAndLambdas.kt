package KotlinBasics

public fun main() {
    val list: List<Int> = listOf(4, 2, 1)
    val list2: MutableList<Int> = mutableListOf(1, 2, 3)

    list2[0]=100
    list2.add(101)
    println(list2)
    println(list2.contains(101))
    println(list2.isEmpty())
    println(list2.indexOf(101))
    println(list2.lastIndexOf(101))
    list2.sort()
    list2.reverse()
    println(list2)
    list2.forEach(::println)
    val lambdaFunc = { x: Int -> x*2 }
    println(lambdaFunc(5))
    println(Int::class.java.fields)
    fun check(x: Int): Boolean{
        return x>42
    }
    val newList = list2.filter(::check)
    println(newList)
    val ds = list2.filter { it: Int -> it>42 }
    val fdas = list2.map{
        it*2
    }
    println(fdas)
}