package demo

import java.util.*

fun main() {

    for (x in 1..10) {
        println("Loop: $x")
    }

    val rand = Random()
    val magicNum = rand.nextInt(50) + 1

    var guess = 0

    while (magicNum != guess) guess += 1

    println("Magic number was $guess")

    println("10 in 1..10 ${12 in 1..10}")

    var arr2: Array<Int> = arrayOf(3,6,9)

    for (i in arr2.indices) {
        println("Mult 3: ${arr2[i]}")
    }

    for ((index, value) in arr2.withIndex()) {
        println("Index: $index Value: $value")
    }
}