fun main() {
    val size = readln().toInt()
    val numbers = MutableList(size) { readln().toInt() }
    val number = readln().toInt()
    var count = 0
    for (elem in numbers) {
        if (elem == number) count++
    }
    print(count)
}