fun main() {

    var s1: String = "abc"
    var s2: String? = null

    val res1 = s1.length
    val res2 = s2?.length

    var s2Length = if (s2 != null) s2.length else 0

    s2Length = s2?.length ?: 0

    if (s2 != null) {
        println(s2.length) // smart cast
    }

    var s3NN: String = "abc"
    var s4N: String? = null

    funcaoQueRecebeNullable(s3NN)
    funcaoQueRecebeNullable(s4N)

    funcaoQueRecebeNonNullable(s3NN)
    // funcaoQueRecebeNonNullable(s4N)

    print(s4N!!.length)

}

fun funcaoQueRecebeNullable(valor: String?) {
    println(valor?.length ?: "Valor é nulo.")
}

fun funcaoQueRecebeNonNullable(valor: String) {
    println(valor.length)
}