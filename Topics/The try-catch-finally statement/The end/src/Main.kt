fun solution() {
    try {
        val a = readln().toInt()
        val b = readln().toInt()
        println(a / b)
    } catch (err: Exception) {
        println(err.message)
    } finally {
        println("This is the end, my friend.")
    }
}