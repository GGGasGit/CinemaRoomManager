fun main() {
    val size = readln().toInt()
    val income = MutableList(size) { readln().toInt() }
    val tax = MutableList(size) { readln().toInt() }

    var highestTax = 0
    var highestTaxIndex = 0
    for (i in 0 until size) {
        if (income[i] * tax [i] > highestTax) {
            highestTax = income[i] * tax [i]
            highestTaxIndex = i + 1
        }
    }
    print(highestTaxIndex)
}