fun main() {
    val size = readln().toInt()
    val numbers = MutableList(size) { readln().toInt() }
    val lastNumber = numbers[size - 1]
    for (i in size - 1 downTo 1) {
        numbers[i] = numbers[i - 1]
    }
    numbers[0] = lastNumber
    print(numbers.joinToString(" "))
}