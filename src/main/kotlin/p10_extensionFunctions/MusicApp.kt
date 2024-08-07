package p10_extensionFunctions

fun main() {

    val chord = "C".majorChord()
    println(chord)

    val chord2 = "C".minorChord()
    println(chord2)

    val dNote = "C".transpose(2)
    println(dNote)

}
