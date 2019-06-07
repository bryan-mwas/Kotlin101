package demo

fun main() {
    val numList = 1..20

    val evenList = numList.filter { it % 2 == 0 }

    evenList.forEach { println(it) }

    val mult3 = makeMathFunc(3)
    println("3 * 8 = ${mult3(8)}")

    val multiply2 = { num: Int -> num * 2 }

    val numList2 = arrayOf(1,3,8,0,94)

    mathOnList(numList2, multiply2)

}

fun makeMathFunc(num1: Int): (Int) -> Int = { num2 -> num1 * num2 }

fun mathOnList(numList: Array<Int>, myFunc: (Int) -> Int) {
    for (num in numList) {
        println("MathOnList: ${myFunc(num)}")
    }
}