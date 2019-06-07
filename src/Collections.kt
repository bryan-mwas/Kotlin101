package demo

fun main() {
    // Mutable list
    var list1: MutableList<Int> = mutableListOf(1,2,3,4)
    var list2: List<Int> = listOf(1,2,3)

    list1.add(6)

    list1.removeAt(1)

    list1.remove(5)

    val list3 = list1.subList(1,3)

    list3.forEach { println(it) }



    val numList = 1..20

    val listSum = numList.reduce { x, y -> x + y }
    println("Reduced sum: $listSum")

    val foldSum = numList.fold(5) { x, y -> x + y}
    println("Fold sum: $foldSum")

    // Check if x meet certain condition, returns True or False
    println("Evens any: ${numList.any { it % 2 == 0 }}")
    println("Evens all: ${numList.all { it % 2 == 0 }}")

    val big3 = numList.filter { it > 3 }

    big3.forEach { n -> println(">3 : $n")}

    // Map ==> Perform an action on every single item and then return a new list
    val times7 = numList.map { it * 7 }

    times7.forEach { println("*7 => $it") }

    workMaps()
}

fun workMaps() {
    val map = mutableMapOf<Int, Any?>()

    val map1 = mutableMapOf(1 to "Dog", 2 to "Beth")

    map[1] = 545
    map[2] = 90
    map.put(3, "St.Petersburg")

    map.remove(2)

    for ((x,y) in map) {
        println("Key: $x, Value: $y")
    }

}