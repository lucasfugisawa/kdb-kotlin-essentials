import kotlin.math.PI

interface Drawable {
    fun draw() // method
}

interface Shape {
    val area: Double // properties
    val position: Pair<Int, Int>
        get() = Pair(0, 0)
}

interface Printable {
    fun print() { // method with default implementation -> extend interfaces without breaking existing code
        println("Default print implementation")
    }
}

class Circle(val x: Int, val y: Int, val radius: Int) : Shape, Drawable, Printable {
    override val area: Double
        get() = PI * radius * radius

    override fun draw() {
        println("Drawing a circle...")
    }
}

val c1: Drawable = Circle(1, 1, 1)
val c2: Shape = Circle(1, 1, 1)
val c3: Printable = Circle(1, 1, 1)
