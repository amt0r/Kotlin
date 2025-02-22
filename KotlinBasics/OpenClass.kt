package KotlinBasics

open class OpenClass (private val intArg: Int, private val  strArg: String) {
    open fun function() {
        println("$intArg $strArg")
    }
}

class ChildClass (intArg: Int, strArg: String, private val booleanArg: Boolean): OpenClass(intArg, strArg) {
    override fun function() {
        super.function()
        println(booleanArg)
    }
}

fun main(){
    val childObj = ChildClass(2, "Hi!", true)
    childObj.function()
    val openObj: OpenClass = childObj
    openObj.function()
    //unexpected for me same result
}