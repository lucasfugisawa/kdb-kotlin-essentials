// Object Declarations
interface Configurable {
    fun configure()
}

object DatabaseConfig: Configurable {
    val url = "jdbc:mysql://localhost:3306/mydatabase"
    val user = "root"
    val password = "password"

    fun connect() {
        println("Connecting to $url as $user")
    }

    override fun configure() {
        TODO("Not yet implemented")
    }
}
// singleton, lazy init, thread-safe init, can implement interfaces

fun main2() {
    DatabaseConfig.connect()
}

// Object Expressions - anonymous objects
interface ClickListener {
    fun onClick()
}

val myListener = object : ClickListener {
    override fun onClick() {
        println("Clicked!")
    }
}

// recreated on each usage:
fun createListener(): ClickListener {
    return object : ClickListener {
        init {
            println("New object '$this' created! ")
        }

        override fun onClick() {
            println("The object '$this' was clicked!")
        }
    }
}

fun main() {
    val listener1 = createListener() // Cria uma nova instância
    val listener2 = createListener() // Cria outra nova instância

    listener1.onClick() // Executa o método da primeira instância
    listener2.onClick() // Executa o método da segunda instância

    println(listener1 === listener2)
}
