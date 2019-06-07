package demo

fun main() {
    var nullVal: String? = null

    fun retNull(): String? {
        return null
    }

    val null1 = retNull()

    val elvisOp = retNull() ?: "no name" // elvis operator.

    println(nullVal)
    println(null1)
    println(elvisOp)
}