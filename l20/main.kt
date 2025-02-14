package l20

import java.util.Calendar

fun main() {

    val calendar: Calendar = Calendar.getInstance()

    val getDaysToEndYear: () -> Int = fun(): Int = 365 - calendar[Calendar.DAY_OF_YEAR]

    println(getDaysToEndYear())
    
    val convertEndDaysToMills: (Int) -> Unit = fun(endDays: Int) = println(1000 * 60 * 60 * 24L * endDays)
    convertEndDaysToMills(getDaysToEndYear())

    val printStringWithLambda: () -> String

    printStringWithLambda = {
        "prasfsa"
    }

    printStringWithLambda();

    { it: Int -> "dsa $it" }(442)

    val convertLambda = { endDays: Int ->
        println("dsa: ${1000 * 60 * 60 * 24L * endDays}")
    }

    convertLambda(getDaysToEndYear())
}