package cinema
const val FRONT_PRICE = 10
const val BACK_PRICE = 8

fun statistika(rows: Int, seats: Int, list: MutableList<MutableList<String>>) {

    val numberOfSeats = rows * seats

    var kupljeneKarte = 0
    for (index in list.indices) {
        for (seat in list[index]) {
            if ("B" == seat) {
                kupljeneKarte++
            }
        }
    }
    println("Number of purchased tickets: $kupljeneKarte")

    val percentage = (kupljeneKarte / numberOfSeats.toFloat()) * 100
    val formatPercentage = "%.2f".format(percentage)
    println("Percentage: $formatPercentage%")


    var currentIncome = 0
    if (numberOfSeats < 60) {
        currentIncome = kupljeneKarte * FRONT_PRICE
    } else {
        var sumaFront = 0
        var sumaBack = 0
        for (index in list.indices) {
            for (seat in list[index]) {
                if ("B" == seat) {
                    if (index <= 4) {
                        sumaFront++
                    } else {
                        sumaBack++
                    }
                }
            }
        }
        currentIncome = (sumaFront * FRONT_PRICE) + (sumaBack * BACK_PRICE)
    }


    println("Current income: $$currentIncome")

    val totalIncome = if (numberOfSeats < 60) {
        numberOfSeats * FRONT_PRICE
    } else {
        val front = rows / 2
        val back = rows - front
        (front * seats * FRONT_PRICE) + (back * seats * BACK_PRICE)
    }
    println("Total income: $$totalIncome")
    println()

}