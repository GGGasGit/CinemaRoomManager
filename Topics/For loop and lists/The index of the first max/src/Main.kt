fun main() {
    val size = readln().toInt()
    val numbers = MutableList(size) { readln().toInt() }
    var max = 0
    var maxIndex = 0
    for (i in numbers.indices) {
        if (numbers[i] > max) {
            max = numbers[i]
            maxIndex = i
        }
    }
    print(maxIndex)
}