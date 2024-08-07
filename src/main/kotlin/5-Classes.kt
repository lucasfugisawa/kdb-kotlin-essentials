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

val obj : Any? = null

// Access modifiers: public (default),  private, protected, internal

open class Rectangle (
    val length: Double,
    val height: Double,
) {
    fun perimeter() = length * 2 + height * 2
    fun area() = length * height

    val diagonal: Double by lazy { sqrt(2 * length * height) }

    private lateinit var color: Color

    fun paint(color: Color) {
        this.color = color
    }

    override fun toString() =
        (if (this::color.isInitialized) "${color.name}-colored " else "") + "Rectangle(length=$length, height=$height)"
}

class Square(
    length: Double = 1.0,
) : Rectangle(length, length) {
    override fun toString(): String = "Square(length=$length)"
}

// data class = equals, hashCode, copy, toString, destructuring
data class Person(
    val name: String,
    val age: Int,
)

