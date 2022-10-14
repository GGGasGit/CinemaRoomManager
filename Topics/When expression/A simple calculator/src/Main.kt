fun main() {
    val (a, operator, c) = readln().split(" ")
    val firstNum = a.toLong()
    val secondNum = c.toLong()

    print(
        when (operator) {
            "+" -> firstNum + secondNum
            "-" -> firstNum - secondNum
            "/" -> if (secondNum == 0L) "Division by 0!" else firstNum / secondNum
            "*" -> firstNum * secondNum
            else -> "Unknown operator"
        }
    )
}