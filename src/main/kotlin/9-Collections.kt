fun main() {
//    lists()
    maps()
}

fun lists() {

    val list = listOf("João", "Maria", "Pedro", "Paula")
    val mutableList = mutableListOf("João", "Maria", "Pedro", "Paula")

    mutableList.add("Carlos")
    var newList = mutableList + "Carla" // add
    newList = newList - "João" // remove

    var first = newList.first()
    first = newList.get(0)
    first = newList[0]

    newList.forEach { println(it) }
    newList.forEachIndexed { index, value -> println("$index: $value") }

    newList
        .map { name -> name.length }
        .filter { length -> length > 4 }
        .average()
}

fun maps() {

    val state1 = Pair("SP", "São Paulo")
    val state2 = Pair("RJ", "Rio de Janeiro")
    val state3 = Pair("MG", "Minas Gerais")

    println("Sigla: ${state1.first}, Nome: ${state1.second}")

    val map1 = mutableMapOf(
        state1,
        state2,
        state3,
    )

    val map2 = mapOf(
        "SP" to "São Paulo",
        "RJ" to "Rio de Janeiro",
        "MG" to "Minas Gerais",
    )

    map1.get("SP")
    val s = map1["SP"]
    println(s)

    map1.put("ES", "Espírito Santo")
    map1["ES"] = "Espírito Santo"
    map1 + ("ES" to "Espírito Santo")

    map1.remove("ES")
    map1 - "ES"

    map1.forEach { println("${it.key} -> ${it.value}") }

    map1
        .filter { it.value.length > 10 }
        .forEach { println("${it.key} -> ${it.value}") }

}