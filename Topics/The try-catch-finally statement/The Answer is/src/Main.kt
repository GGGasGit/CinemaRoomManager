const val FORTYTWO = 42

fun main() {
    val answer: Int = try { readLine()!!.toInt() } catch (err: Exception) { FORTYTWO }
    finally { println("The answer is a number") }
    println(answer)
}