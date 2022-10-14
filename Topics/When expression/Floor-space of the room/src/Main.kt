import kotlin.math.sqrt

const val PI = 3.14

fun main() {
    val shape = readln()

    print(
        when (shape) {
            "triangle" -> {
                val a = readln().toDouble()
                val b = readln().toDouble()
                val c = readln().toDouble()
                val s = (a + b + c) / 2
                sqrt(s * (s - a) * (s - b) * (s - c))
            }
            "rectangle" -> {
                val a = readln().toDouble()
                val b = readln().toDouble()
                a * b
            }
            "circle" -> {
                val r = readln().toDouble()
                r * r * PI
            }
            else -> "No such shape!"
        }
    )
}