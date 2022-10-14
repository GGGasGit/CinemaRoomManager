fun convertStringToDouble(input: String): Double {
    return try {
        input.toDouble()
    } catch (err: Exception) {
        0.0
    }
}