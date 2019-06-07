package demo

fun main(args: Array<String>) {
    println("Yeah")

    val name = "Brian"

    var myAge = 23

    var bigInt: Int = Int.MAX_VALUE
    var smallInt: Int = Int.MIN_VALUE

    println("Biggest Int: " + bigInt)
    println("Smallest Int: $smallInt") // String interpolation is favored

//  Loss of precision with double after fifteen digits
    var dbl1 = 1.1111111111111111
    var dbl2 = 1.1111111111111111

    println("Sum: " + (dbl1 + dbl2))

    var letterGrade: Char = 'A'

    println("A is a character: ${ letterGrade is Char }")

    val longStr = "Hello"
    println("String length : ${longStr.length}")

    var str1 = "A book"
    var str2 = "A book"

    println("Second index: ${str1[2]}")
    println("Second 2 - 7: ${str1.subSequence(2,5)}")
    println("Contains ook: ${str1.contains("ook")}")
    println("Compare A to B: ${"Z".compareTo("B")}")

}