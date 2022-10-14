fun parseCardNumber(cardNumber: String): Long {
    val cardNumberPattern = "\\d{4}\\s\\d{4}\\s\\d{4}\\s\\d{4}".toRegex()
    if (cardNumberPattern.matches(cardNumber)) {
        val (part1, part2, part3, part4) = cardNumber.split(" ")
        return (part1 + part2 + part3 + part4).toLong()
    } else {
        throw Exception("The card number is incorrect")
    }
}