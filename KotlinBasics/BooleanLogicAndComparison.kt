package KotlinBasics

fun main() {
    val a = 1 + 1
    val b = (1 == 1)

    val useAge = 20
    val comparisonResult: Boolean = (useAge >= AGE_OF_MAJORITY) && !(useAge >= RETIREMENT_AGE)
    val result = useAge in AGE_OF_MAJORITY..RETIREMENT_AGE
    println("Result is: $comparisonResult")


}

const val AGE_OF_MAJORITY = 18
const val RETIREMENT_AGE = 65