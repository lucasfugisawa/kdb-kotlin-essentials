import kotlin.math.PI

fun main() {

    // Declarando funções:
    fun circumference1(radius: Double): Double {
        return 2 * PI * radius
    }

    fun circumference2(radius: Double): Double = 2 * PI * radius

    fun circumference3(radius: Double) = 2 * PI * radius

    val circumference4 = { radius: Double ->
        // ...
        2 * PI * radius
    }


    val myLambda = { texto: String, numero: Int ->
        // ..
        if (numero == 0) texto
        else "texto: $numero"
    }


    // Chamando funções:
    val perimeter1 = circumference1(1.0)
    println(perimeter1)

    val perimeter2 = circumference1(radius = 2.0)
    println(perimeter2)

    val perimeter3 = circumference4(3.0)
    println(perimeter3)

    // Função como último argumento:
    fun fazAlgoComString(str: String, algo: (String) -> Unit): Unit {
        algo(str)
    }

    var minhaString = "Lucas"

    fun imprimeNaTela(texto: String) = println(texto)

    fazAlgoComString("text", ::imprimeNaTela)

    fazAlgoComString("text") { nome ->
        // ...
        // ...
        println(nome)
    }

    fazAlgoComString("text") {
        println(it)
        println(it)
        println(it)
        println(it)
    } // Função lambda fora dos ()

    fazAlgoComString("text") { println(it) } // Função fora do ()
}

fun greet(name: String, greeting: String? = "Welcome"): String {
    return if (greeting != null) {
        "$greeting, $name!"
    } else {
        return name
    }
}

fun namedParameterDefaultArgs() {
    val mensagem = greet(name = "Lucas")
}
