enum class SensacaoTermica {
    MUITO_FRIO,
    FRIO,
    NORMAL,
    QUENTE,
    MUITO_QUENTE,
}

fun main() {

    // when:
    val temperature = -2
    val reaction = when {
        temperature > 55 -> "It's too hot!"
        temperature < 40 -> "It's too cold!"
        temperature < 0 -> "It's frigid!"
        else -> "It's too bright!"
    }
    println(reaction)

    var sensacaoTermica = SensacaoTermica.MUITO_QUENTE

    val mensagem = when(sensacaoTermica) {
        SensacaoTermica.MUITO_FRIO -> "Frio demais!"
        SensacaoTermica.FRIO -> "Frio!"
        SensacaoTermica.QUENTE -> "Quete demais!"
        SensacaoTermica.NORMAL -> "Normal"
        SensacaoTermica.MUITO_QUENTE -> "Quete demais!"
    }

    // if:
    val a = 1
    val b = 2

    var max = a

    if (a > b) {
        max = a
    } else {
        max = b
    }

    max = if (a > b) a else b

    max = if (a > b) {
        println("Choose a")
        a
    } else {
        println("Choose b")
        b
    }
}
