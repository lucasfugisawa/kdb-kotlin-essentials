fun main() {

    var s1: String = "abc"
    var s2: String? = null

    s1.length
    s2?.length

    var s2Length = if (s2 != null) s2.length else 0

    s2Length = s2?.length ?: 0

    if (s2 != null) {
        println(s2.length) // smart cast
    }

}