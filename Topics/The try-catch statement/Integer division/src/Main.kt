fun intDivision(x: String, y: String): Int {
    return try {
        x.toInt() / y.toInt()
    } catch (err: ArithmeticException) {
        println("Exception: division by zero!")
        0
    } catch (err: NumberFormatException) {
        println("Read values are not integers.")
        0
    }
}

fun main() {
    val x = readLine()!!
    val y = readLine()!!
    println(intDivision(x, y))

}