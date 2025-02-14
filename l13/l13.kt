package l13

fun main() {
    val nullableString: String? = "dsa"
    val justString: String = "some string"

    println(nullableString?.length)
    println(justString.length)

    val nullableLine: String? = readLine()

    val stringLength: Int = nullableString?.length ?: 0

    val stringLengthds: Int = nullableString!!.length
}