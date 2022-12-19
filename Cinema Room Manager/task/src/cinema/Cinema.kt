package cinema

fun main(args: Array<String>) {
    println("Enter the number of rows:")
    val rows = readln().toInt()
    println("Enter the number of seats in each row:")
    val seats = readln().toInt()

    val listaGlavna = layoutKino(rows, seats)

    do {
        println("1. Show the seats")
        println("2. Buy a ticket")
        println("3. Statistics")
        println("0. Exit")
        val unos = readln().toInt()

        when (unos) {
            1 -> {
                ispisLayouta(listaGlavna)
                println()
            }

            2 -> {
                kupnjaKarte(rows, seats, listaGlavna)
            }

            3 -> {
                statistika(rows, seats, listaGlavna)
            }
        }

    } while (unos != 0)



}

