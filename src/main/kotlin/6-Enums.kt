fun main() {

    val aColor = Color.RED

    fun showCircleColor(color: Color) {
        when (color) {
            Color.RED -> println("Vermelho")
            Color.GREEN -> println("Verde")
            Color.BLUE -> println("Azul")
        }
    }

    fun printColorComponents(color: ColorWithValues) {
        println("R: ${color.r}, G: ${color.g}, B: ${color.b}")
        println("R: ${color.redAmount()}, G: ${color.greenAmount()}, B: ${color.blueAmount()}")
    }

    println("Color ${ColorWithValues.RED.name} has r=${ColorWithValues.RED.r}.")

    val colorName = "BLUE"
    val color = Color.valueOf(colorName)
    println("Color of $colorName is ${color.ordinal}.")
}

enum class Color {
    RED,
    GREEN,
    BLUE,
}

enum class ColorWithValues(val r: Int, val g: Int, val b: Int) {
    RED(127, 0, 0 ),
    GREEN(0, 127, 0),
    BLUE(0, 0, 127);

    fun redAmount(): Int = r
    fun greenAmount(): Int = g
    fun blueAmount(): Int = b
}