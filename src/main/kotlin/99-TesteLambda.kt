fun main() {
    println("Main: Iniciando programa.")
    repeater(5) {
        val currentTime = System.currentTimeMillis()
        println("Main: Current timestamp is $currentTime")
    }
    repeater(3) {
        println("Main: Nothing")
    }
    repeater(2) {
        println("Main: Another Nothing")
    }
    println("Main: Finalizando programa.")
}

inline fun repeater(times: Int, block: (Int) -> Unit) {
    for (index in 0 until times) {
        println("Lamba: Iteration $index:")
        block(index)
    }
}