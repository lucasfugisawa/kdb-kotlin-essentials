import kotlin.math.PI

fun main() {

    // Declarando funções:
    fun circumference1(radius: Double): Double {
        return 2 * PI * radius
    }

    fun circumference2(radius: Double): Double = 2 * PI * radius

    fun circumference3(radius: Double) = 2 * PI * radius

    val circumference4 = { radius: Double -> 2 * PI * radius }

    // Chamando funções:
    val perimeter1 = circumference1(1.0)
    println(perimeter1)

    val perimeter2 = circumference1(radius = 2.0)
    println(perimeter2)

    val perimeter3 = circumference4(3.0)
    println(perimeter3)

    // Função como último argumento:
    fun fazAlgoComString(str: String, algo: (String)->Unit): Unit {
        algo(str)
    }

    var minhaString = "Lucas"

    fazAlgoComString(minhaString, { nome -> println(nome) }) // Função dentro do ()

    fazAlgoComString(minhaString) { nome -> println(nome) } // Função fora do ()
}
