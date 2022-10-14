fun main(args: Array<String>) {
    val number = readln().toInt()

    val shape = when (number) {
        1 -> "square"
        2 -> "circle"
        3 -> "triangle"
        4 -> "rhombus"
        else -> ""
    }

    print(if (number in 1..4) "You have chosen a $shape" else "There is no such shape!")
}