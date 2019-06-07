package demo

fun main() {

    val age = 8

    if(age < 5) {
        println("Go to Preschool")
    } else if(age == 5) {
        println("Go to kintagarden :)")
    } else if((age > 5) && (age <= 17)) {
        val grade = age - 5
        println("Go to grade $grade")
    } else {
        println("Go to college")
    }

    // Switch ==> When
    when (age) {
        0,1,2,3,4 -> println("Go to preschool")

        5 -> println("Go to kintagarden")

        in 6..17 -> {
            val grade = age - 5
            println("Go to grade $grade")
        }

        else -> println("Go to college")
    }

    for (x in 1..20) {
        if(x % 2 == 0) {
            continue
        }

        println("Odd: $x")

        if(x == 15) break
    }
}