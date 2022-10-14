fun main() {
    val input = readLine()!!

    print(
        if (input.isEmpty()) {
            ""
        } else {
            when (input.first()) {
                'i' -> input.drop(1).toInt() + 1
                's' -> input.drop(1).reversed()
                else -> input
            }
        }
    )
}