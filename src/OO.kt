package demo

open class Animal(val name: String, var height: Double, var weight: Double) {
    init {
        val regex = Regex(".*\\d+.*")
        require(!name.matches(regex)) { "Animal name can't contain numbers." }
        require(height > 0) { "Height must be greater than zero" }
        require(weight > 0) { "Weight must be greater than zero" }
    }

    // To allow overriding of methods
    open fun getInfo(): Unit {
        println("$name is $height tall and weighs $weight")
    }
}

class Dog(name: String, height: Double, weight: Double, var owner: String): Animal(name, weight, height) {
    override fun getInfo() {
        println("$name is $height tall and weighs $weight and is owned by $owner")
    }
}

interface Flyable {
    var flies: Boolean
    fun fly(distMiles: Double): Unit
}

class Bird(val name: String, override var flies: Boolean = true): Flyable {
    override fun fly(distMiles: Double) {
        if(flies) {
            println("$name flies $distMiles miles")
        }
    }
}

fun main() {
    val bowser = Animal("Bowser", 10.0, 90.0)
    bowser.getInfo()

    val spot = Dog("Spot", 20.0, 14.5, "Paul Smith")
    spot.getInfo()

    val tweety = Bird("Tweety")

    tweety.fly(10.0)
}