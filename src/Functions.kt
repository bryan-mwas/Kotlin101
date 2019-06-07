package demo

fun main() {

    fun add(num1: Int, num2: Int): Int = num1 + num2 // single line function don't require return types

    fun subtract(num1: Int = 1, num2: Int = 1) = num1 - num2

    fun sayHello(name: String): Unit = println("Hello $name")

    // Function literals
    val multiply = { num1: Int, num2: Int -> num1 * num2 }

    println("6 * 9 = ${multiply(6, 9)}")

    println("5 + 90 = ${add(5, 90)}")
    println("5 - 90 = ${subtract(num2 = 90)}")

    val (two, three) = nextTwo(1)
    println("1, $two, $three")

    sayHello("Bryan")

    println(getSum(10, 20, 30, 40, 50))

    println("5! = ${fact(5)}")
}

fun nextTwo(num: Int): Pair<Int, Int> {
    return Pair(num + 1, num + 2)
}

fun getSum(vararg nums: Int): Int {
    var sum = 0

    nums.forEach { sum += it }

    return sum
}

fun fact(x: Int): Int {
    tailrec fun factTail(y: Int, z: Int): Int {
        return if (y == 0) z
        else factTail(y - 1, y * z)
    }

    return factTail(x, 1)
}