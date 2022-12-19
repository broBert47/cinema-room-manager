package cinema

fun kupnjaKarte(rows: Int, seats: Int, list: MutableList<MutableList<String>>){

    var selectedRow: Int
    var selectedSeat: Int
    var successful = false
    do {
        println("Enter a row number:")
        selectedRow = readln().toInt()
        println("Enter a seat number in that row:")
        selectedSeat = readln().toInt()

        when{
            selectedRow > 9 || selectedRow < 1 || selectedSeat > 9 || selectedSeat < 1 -> println("Wrong input!")
            list[selectedRow][selectedSeat] == "B" -> println("That ticket has already been purchased!")
            else -> successful = true
        }
    } while(!successful)

    list[selectedRow][selectedSeat] = "B"

    ticketPrice(rows, seats, selectedRow)
    println()


}


fun ticketPrice(rows: Int, seats: Int, rows2: Int) {
    val numberOfSeats = rows * seats
    val price = if (numberOfSeats < 60) {
        FRONT_PRICE
    } else {
        if (rows2 <= 4) {
            FRONT_PRICE
        } else {
            BACK_PRICE
        }
    }
    println("Ticket price: $$price")

}