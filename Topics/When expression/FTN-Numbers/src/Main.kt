fun main() {
    val number = readln().toInt()

    when (number) {
        0, 1, 2, 3, 5, 8, 13, 21, 34, 55 -> print("F")
        6, 10, 15, 28, 36, 45 -> print("T")
        100, 1000, 10000, 100000 -> print("P")
        else -> print("N")
    }
}