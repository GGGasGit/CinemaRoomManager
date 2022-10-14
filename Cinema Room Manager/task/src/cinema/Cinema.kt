package cinema

import java.util.Locale

fun main() {
    println("Enter the number of rows:")
    val rows = readln().toInt()
    println("Enter the number of seats in each row:")
    val seats = readln().toInt()

    val cinema = MutableList(rows) {
        MutableList(seats) { "S" }
    }

    var numberTicketsSold = 0

    fun cinemaPrinter() {
        println("\nCinema:")
        print(" ")
        for (seat in 1..seats) {
            print(" $seat")
        }
        println("")
        for (row in 0 until rows) {
            print(row + 1)
            for (seat in cinema[row]) {
                print(" $seat")
            }
            println("")
        }
    }

    fun ticketBuyer() {
        var rowNumber = 0
        var seatNumber = 0
        var badChoice: Boolean

        do {
            try {
                println("\nEnter a row number:")
                rowNumber = readln().toInt()
                println("Enter a seat number in that row:")
                seatNumber = readln().toInt()

                badChoice = if (cinema[rowNumber - 1][seatNumber - 1] == "B") {
                    println("\nThat ticket has already been purchased!")
                    true
                } else {
                    false
                }

            } catch (err: IndexOutOfBoundsException) {
                badChoice = true
                println("\nWrong input!")
            }
        } while (badChoice)

        val totalSeats = rows * seats
        val price = if (totalSeats <= 60) {
            10
        } else {
            if (rowNumber <= rows / 2) 10 else 8
        }

        cinema[rowNumber - 1][seatNumber - 1] = "B"
        numberTicketsSold++

        println("\nTicket price: \$$price")
    }

    fun incomeCalculator(): MutableList<Int> {
        var currentIncome = 0
        var totalIncome = 0

        val totalSeats = rows * seats
        if (totalSeats <= 60) {
            totalIncome = totalSeats * 10
            currentIncome = cinema.flatten().filter { it == "B" }.size * 10
        } else {
            for (row in 0 until rows / 2) {
                for (seat in cinema[row]) {
                    totalIncome += 10
                    if (seat == "B") currentIncome += 10
                }
            }
            for (row in rows / 2 until rows) {
                for (seat in cinema[row]) {
                    totalIncome += 8
                    if (seat == "B") currentIncome += 8
                }
            }
        }

        return mutableListOf(currentIncome, totalIncome)
    }

    fun displayStatistics() {
        println("\nNumber of purchased tickets: $numberTicketsSold")
        val percentage: Double = numberTicketsSold.toDouble() / (rows * seats) * 100
        println("Percentage: ${"%.2f".format(Locale.US, percentage)}%")
        val (currentIncome, totalIncome) = incomeCalculator()
        println("Current income: \$$currentIncome")
        println("Total income: \$$totalIncome")
    }

    do {
        println("""

1. Show the seats
2. Buy a ticket
3. Statistics
0. Exit
    """.trimIndent()
        )
        val selection = readln().toInt()
        when (selection) {
            1 -> cinemaPrinter()
            2 -> ticketBuyer()
            3 -> displayStatistics()
            else -> Unit
        }
    } while (selection != 0)

}