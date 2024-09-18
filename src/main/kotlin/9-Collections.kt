import java.util.LinkedList

fun main() {
//    lists()
    maps()
}

fun lists() {

    val immutableList = listOf<String>("João", "Maria", "Pedro", "Paula")
    val mutableList = mutableListOf("João", "Maria", "Pedro", "Paula")

    val minhaListaVazia: List<Int?> = emptyList<Int?>()

    mutableList.add("Carlos")
    var newList1 = mutableList + "Carla" // add
    var newList2 = newList1 - "João" // remove

    immutableList.get(0)
    immutableList[0]
    immutableList.plus("José")
    immutableList + "José"

    mutableList.get(0)
    mutableList[0]

    mutableList.add("Miguel")

    mutableList.plus("Raquel")
    mutableList + "Raquel"

    mutableList.remove("Vitor") // altera a mutable list
    mutableList - "Vitor" // retorna uma NOVA List sem o Vitor

    mutableList.first()
    mutableList.last() // mutableList[mutableList.size -1]


    var first = newList1.first()
    first = newList1.get(0)
    first = newList1[0]

    for (name in newList1) {
        val qtChars = name.length
        println("$name tem $qtChars caracteres.")
    }

    for (index in 0..newList1.size - 1) {
        val qtChars = newList1[index].length
        println("${newList1[index]} tem $qtChars caracteres e está na posição ${index}.")
    }

    for (index in newList1.indices) {
        val qtChars = newList1[index].length
        println("${newList1[index]} tem $qtChars caracteres e está na posição ${index}.")
    }

    for ((index, value) in newList1.withIndex()) {
        val qtChars = value.length
        println("$value tem $qtChars caracteres e está na posição ${index}.")
    }

    newList1.forEachIndexed { index, value ->
        val qtChars = value.length
        println("$value tem $qtChars caracteres e está na posição ${index}.")
    }


    newList1.forEach { println(it) }
    newList1.forEach { println(it) }


    newList1.forEachIndexed { index, value -> println("$index: $value") }

    newList1
        .map { it.length }
        .filter { it >= 4 }
        .average()
}

fun maps() {

    val state1 = Pair("SP", "São Paulo")
    val state2 = Pair("RJ", "Rio de Janeiro")
    val state3 = Pair("MG", "Minas Gerais")

    println("Sigla: ${state1.first}, Nome: ${state1.second}")

    val map1: MutableMap<String, String> = mutableMapOf(
        state1,
        state2,
        state3,
    )

    val mapEstadosBr = mutableMapOf(
//        "SP" to "São Paulo",
        Pair("SP", "São Paulo"),
        "RJ" to "Rio de Janeiro",
        "MG" to "Minas Gerais",
    )

    val mapEstadosCodBr = mutableMapOf(
        1 to "São Paulo",
        2 to "Rio de Janeiro",
        3 to "Minas Gerais",
    )

    map1.get("SP")
    val s = map1["SP"]
    println(s)

    map1.put("ES", "Espírito Santo")
    map1["ES"] = "Espírito Santo"
    map1 + ("ES" to "Espírito Santo")

    map1.remove("ES")
    map1 - "ES"

    for (estado in mapEstadosBr) {
        println("${estado.key} -> ${estado.value}")
    }



    map1.forEach { println("${it.key} -> ${it.value}") }

    map1
        .filter { it.value.length > 10 }
        .forEach { println("${it.key} -> ${it.value}") }


    // lista com 8 pessoas de gêneros e idades diferentes:
    val pessoas = listOf(
        Pessoa("Lucas", 30, "Masculino"),
        Pessoa("Ana", 7, "Feminino"),
        Pessoa("Carlos", 40, "Masculino"),
        Pessoa("Mariana", 32, "Feminino"),
        Pessoa("João", 4, "Masculino"),
        Pessoa("Beatriz", 45, "Feminino"),
        Pessoa("Gabriel", 28, "Masculino"),
        Pessoa("Isabela", 22, "Feminino"),
        Pessoa("Paulo", 17, "Masculino"),
        Pessoa("Camila", 35, "Feminino")
    )

    var somaIdades = 0
    var quantidadePessoas = 0
    for (pessoa in pessoas) {
        if (pessoa.idade >= 18 && pessoa.genero == "Feminino") {
            somaIdades += pessoa.idade
            quantidadePessoas += 1
        }
    }
    var mediaIdades: Double? = null
    if (quantidadePessoas > 0) {
        mediaIdades = somaIdades / quantidadePessoas.toDouble()
    }
    println("Média das idades: ${mediaIdades ?: "N/A."}")

    pessoas
        .filter { it.idade >= 18 && it.genero == "Feminino" }
        .map { it.idade }
        .average()
        .also { println("Média das idades: $it") }
}

data class Pessoa(val nome: String, val idade: Int, val genero: String)
