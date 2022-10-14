fun main() {
    val number = readln().toInt()

    when (number) {
        2 -> print("Yes!")
        1, 3, 4 -> print("No!")
        else -> print("Unknown number")
    }
}