fun main() {

    val obj1: Any = "a string"

    // println(obj1.length)

    if (obj1 is String) {
        println(obj1.length) // smart cast
    }

    val obj2 = obj1 as String
    val obj3 = obj1 as? String

}