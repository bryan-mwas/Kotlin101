package demo

fun main() {
    var arr = arrayOf(1,1.24, "Dog")

    println(arr[2])

    arr[1] = 3.14

    println("Array: $arr")

    println("Array length: ${arr.size}")

    println("Dog in array: ${ arr.contains("Dog")}")
    println("Dog in array: ${"Dog" in arr}")

    var partArray = arr.copyOfRange(0,1)

    println("Part array: ${partArray.first()}")

    println("Index of Dog: ${arr.indexOf("Dog")}")

    val squareArray = Array(5) { x -> x * x}

    println(squareArray)

    // Type specific arrays
    var arr2: Array<Int> = arrayOf(1, 2, 3)
}
