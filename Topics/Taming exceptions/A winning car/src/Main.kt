import java.lang.Exception

const val SPEEDLIMIT = 120
const val ACCTIMELIMIT = 4

fun findCar(): String {
    val maxSpeed = readln().toInt()
    val accTime = readln().toInt()

    if (maxSpeed < SPEEDLIMIT || accTime > ACCTIMELIMIT || accTime < 1) {
        throw Exception("The race can't be won with this car")
    } else {
        return "I will definitely win!"
    }
}