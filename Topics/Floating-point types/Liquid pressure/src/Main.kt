const val GRAVCOEFF = 9.8

fun main() {
    val rho = readln().toDouble()
    val h = readln().toDouble()
    print(GRAVCOEFF * rho * h)
}