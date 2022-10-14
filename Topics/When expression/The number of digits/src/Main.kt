fun main() {
    val number = readln()

    print(
        when (number.length) {
            1 -> "1"
            2 -> "2"
            3 -> "3"
            4 -> "4"
            else -> "0"
        }
    )
}