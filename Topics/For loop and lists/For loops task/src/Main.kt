fun main() {
    val size = readln().toInt()
    val numbers = MutableList(size) { readln().toInt() }
    val (p, m) = readln().split(" ").map { it.toInt() }
    print(if (p in numbers && m in numbers) "YES" else "NO")
}