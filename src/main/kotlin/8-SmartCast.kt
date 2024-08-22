fun main() {

    val obj1: Any = "a string"

//    println(obj1.length) // compilation error

    if (obj1 is String) {
        println(obj1.length) // smart cast
    }

    val obj2 = obj1 as String

    obj1.length

    val obj3 = obj1 as? String

}