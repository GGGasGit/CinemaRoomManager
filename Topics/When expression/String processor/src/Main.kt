fun main() {
    val word1 = readln()
    val operation = readln()
    val word2 = readln()

    when (operation) {
        "equals" -> print(word1 == word2)
        "plus" -> print(word1 + word2)
        "endsWith" -> print(word1.endsWith(word2))
        else -> print("Unknown operation")
    }
}