fun main() {
    try {
        val number = "one"
        val convertedNumber = number.toInt()

    // do not touch the lines below    
    } catch(e: RuntimeException) {
        println("Well")
    } catch (e: Exception) {
        println("Wrong")
    }
}