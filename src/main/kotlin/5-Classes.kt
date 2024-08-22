import kotlin.math.sqrt

fun main() {
    val aRectangle = Rectangle(2.5, 1.25)
    val aSquare = Square(5.0)

    var aShape: Rectangle = aSquare
    println(aShape.perimeter())
    println(aShape) // .toString()

    println(aRectangle)
    aRectangle.paint(Color.GREEN)
    println(aRectangle)

    var aRectList: List<Rectangle> = listOf(aRectangle, aSquare)

}

var nome = "Lucas"
    get() = "$field."
    set(value: String) {
        if (value.isBlank()) throw IllegalArgumentException()
        field = value
    }

val obj : Any? = null

// Access modifiers: public (default), private, protected, internal

open class Rectangle (
    val length: Double,
    val height: Double,
) {
    fun perimeter(): Double = length * 2 + height * 2

    fun area(): Double = length * height

//    val diagonal: Double = sqrt(2 * length * height)
    val diagonal: Double by lazy { sqrt(2 * length * height) }

    private lateinit var color: Color

    fun paint(color: Color) {
        this.color = color
        // now paint it!
    }

    override fun toString() =
        (if (this::color.isInitialized) "${color.name}-colored " else "") + "Rectangle(length=$length, height=$height)"
}

class Square(
    length: Double,
) : Rectangle(length, length) {
    constructor(): this(length = 1.0)
    constructor(color: String) : this(length = 1.0)

    override fun toString(): String = "Square(length=$length)"
}

// data class -> equals, hashCode, toString, copy, destructuring (componentX)
data class Person(
    val name: String, // component1(): String
    val age: Int, // // component2(): Int
)

fun main1() {
    val person1 = Person("Lucas", 41)
    val person2 = Person("Maria", 42)

    println(person1 == person2)
    println(person1) // -> "Person(name=Lucas, age=41)"

    val person3 = person1.copy(age = 47)
    val person4 = person1.copy()

//    val name = person1.name
//    val age = person1.age

    val (_, age) = person1
}

// Para mais adiante:
// Interfaces, Classes Abstratas, Class Delegation.