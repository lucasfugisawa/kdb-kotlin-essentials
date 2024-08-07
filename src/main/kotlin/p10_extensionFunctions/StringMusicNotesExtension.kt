package p10_extensionFunctions

val musicNotes = listOf("C", "C#/Db", "D", "D#/Eb", "E", "F", "F#/Gb", "G", "G#/Ab", "A", "A#/Bb", "B")

fun String.transpose(interval: Int): String {
    val index = musicNotes.indexOf(this)
    return musicNotes[(index + interval) % musicNotes.size]
}

fun String.majorChord(): List<String> {
    val index = musicNotes.indexOf(this)
    return listOf(
        musicNotes[index], musicNotes[(index + 4) % musicNotes.size],
        musicNotes[(index + 7) % musicNotes.size])
}

fun String.minorChord(): List<String> {
    val index = musicNotes.indexOf(this)
    return listOf(
        musicNotes[index], musicNotes[(index + 3) % musicNotes.size],
        musicNotes[(index + 7) % musicNotes.size])
}