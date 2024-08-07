fun main() {

    // when:
    val temperature = -5
    val reaction = when {
        temperature > 55 -> "It's too hot!"
        temperature < 40 -> "It's too cold!"
        temperature < 0 -> "It's frigid!"
        else -> "It's just right!"
    }
    println(reaction)

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
