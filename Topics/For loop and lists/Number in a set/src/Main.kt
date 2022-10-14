fun main() {
    val size = readln().toInt()
    val numbers = MutableList(size) { readln().toInt() }
    val number = readln().toInt()
    print(if (number in numbers) "YES" else "NO")
}