import kotlin.Exception        

fun calculateBrakingDistance(v1: String, a: String): Int {
    return try {
        -v1.toInt() * v1.toInt() / (2 * a.toInt())
    } catch (err: ArithmeticException) {
        println("The car does not slow down!")
        -1
    } catch (err: Exception) {
        println(err.message)
        -1
    }
}