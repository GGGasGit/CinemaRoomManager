fun main() {
    val size = readln().toInt()
    val numbers = MutableList(size) { readln().toInt() }
    val (p, m) = readln().split(" ").map { it.toInt() }

    var result = "YES"
    for (i in 0 until size - 1) {
        if (numbers[i] == p && numbers[i + 1] == m || numbers[i] == m && numbers[i + 1] == p) {
            result = "NO"
            break
        }
    }
    print(result)
}