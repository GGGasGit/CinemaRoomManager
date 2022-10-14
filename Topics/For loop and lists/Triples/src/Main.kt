fun main() {
    val size = readln().toInt()
    val numbers = MutableList(size) { readln().toInt() }
    var count = 0
    for (i in 2 until size) {
        if (numbers[i] - 1 == numbers[i - 1] && numbers[i] - 2 == numbers[i - 2]) count++
    }
    print(count)
}