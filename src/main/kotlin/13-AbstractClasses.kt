abstract class Animal(val name: String) {
    abstract val weight: Int
    abstract fun makeSound()

    val isDangerous: Boolean = false

    open fun breathe() {
        println("Animal is breathing in regular fashion...")
    }
}

class Dog(name: String) : Animal(name) {
    override fun makeSound() {
        println("Woof!")
    }
    override val weight: Int = 10
}

class Turtle() : Animal("Turtle") {
    override fun makeSound() {}
    override val weight: Int = 5
    override fun breathe() = println("A turtle is breathing slowly...")
}

fun main() {
//    val animal1 = Animal("Lucas")
}