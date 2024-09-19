// redefine behavior of existing operators
// cannot create new operators
// each operator has a specific corresponding method

val vet1 = Vector(1, 2)
val vet2 = Vector(3, 4)
val vet3 = vet1 + vet2
val vet4 = -(vet1 + vet3)
var teste = 5

data class Vector(var x: Int, var y: Int) {
    // Arithmetic operators: +, -, *, /, %, -x
    operator fun plus(other: Vector): Vector {
        return Vector(x + other.x, y + other.y)
    }

    operator fun minus(other: Vector): Vector {
        return Vector(x - other.x, y - other.y)
    }

    operator fun times(scale: Int): Vector {
        return Vector(x * scale, y * scale)
    }

    operator fun div(scale: Int): Vector {
        return Vector(x / scale, y / scale)
    }

    operator fun rem(scale: Int): Vector {
        return Vector(x % scale, y % scale)
    }

    operator fun unaryMinus(): Vector {
        return Vector(-x, -y)
    }

    // attribution: +=
    operator fun plusAssign(other: Vector) {
        x += other.x
        y += other.y
    }

    // comparison: <, >, <=, >=
    operator fun compareTo(other: Vector): Int {
        return (x * x + y * y).compareTo(other.x * other.x + other.y * other.y)
    }
}

class Matrix(val description: String, private val data: Array<IntArray>) {
    // index access: [], []=
    operator fun get(i: Int, j: Int): Int {
        return data[i][j]
    }

    operator fun set(i: Int, j: Int, value: Int) {
        data[i][j] = value
    }

    // iteration
    operator fun iterator(): Iterator<IntArray> {
        return data.iterator()
    }
}

class Greeter {
    // invocation: ()
    operator fun invoke(name: String) {
        println("Hello, $name!")
    }
}

data class Date(val day: Int, val month: Int, val year: Int) : Comparable<Date> {
    override fun compareTo(other: Date): Int {
        return when {
            this.year != other.year -> this.year.compareTo(other.year)
            this.month != other.month -> this.month.compareTo(other.month)
            else -> this.day.compareTo(other.day)
        }
    }
}

class DateRange(
    override val start: Date,
    override val endInclusive: Date,
) : ClosedRange<Date>


operator fun Date.rangeTo(other: Date): DateRange {
    return DateRange(this, other)
}

class Toggle(var state: Boolean) {
    operator fun not(): Toggle {
        state = !state
        return this
    }
}


fun main3() {
    // arithmetic: +, -, *, /, %, -x
    val v1 = Vector(1, 2)
    val v2 = Vector(3, 4)
    val v3 = v1 + v2 // Result: Vector(x=4, y=6)
    val v4 = v1 - v2 // Result: Vector(x=-2, y=-2)
    val v5 = v1 * 2 // Result: Vector(x=2, y=4)
    val v6 = v2 / 2 // Result: Vector(x=1, y=2)
    val v7 = v2 % 2 // Result: Vector(x=1, y=0)
    val v8 = -v1 // Result: Vector(x=-1, y=-2)

    // attribution: =
    val mutableV1 = Vector(1, 2)
    mutableV1 += v2 // Changes mutableV1 to Vector(x=4, y=6)

    // comparison: <, >, <=, >=
    val isGreater = v1 > v2

    // index access: [], []=
    val matrix = Matrix(description = "test", arrayOf(intArrayOf(1, 2), intArrayOf(3, 4)))
    val element = matrix[0, 1] // Result: 2
    matrix[0, 1] = 5 // change value to 5

    // invocation: ()
    val greeter = Greeter()
    greeter("World") // Result: "Hello, World!"

    // range: ..
    val startDate = Date(1, 1, 2024)
    val endDate = Date(31, 12, 2024)

    val dateRange = startDate..endDate
    val specificDate = Date(15, 7, 2024)

    println(specificDate in dateRange)

    // iteration:
    for (element in matrix) {
        println(element)
    }

    // not: !
    var toggle = Toggle(true)
    !toggle // alternate state
}

data class DualStrings(var str1: String, var str2: String) {
    private fun getCharsAt(index1: Int, index2: Int): Pair<Char, Char> {
        return Pair(str1[index1], str2[index2])
    }

    operator fun get(index1: Int, index2: Int): Pair<Char, Char> {
        return getCharsAt(index1, index2)
    }

    operator fun get(index1: Int): Char {
        return str1[index1]
    }

    operator fun plus(other: DualStrings): String {
        return str1 + other.str1 + str2 + other.str2
    }

    operator fun times(other: Int): String {
        return (str1 + str2).repeat(other)
    }
}

fun main() {
    val dualString = DualStrings("Hello", "World")
    val chars = dualString[1, 4]
    val char: Char = dualString[1]
    println(chars)

    val concat = dualString + DualStrings("Not", "Sad")
    println(concat)

    val soma = dualString * 10
    println(soma)
}
