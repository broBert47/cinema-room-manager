package cinema

fun layoutKino(rows: Int, seats: Int): MutableList<MutableList<String>> {
    val glavnaLista = mutableListOf<MutableList<String>>()
    for (row in 0..rows) {
        val lista = mutableListOf<String>()
        if (row == 0) {
            lista.add(" ")
        } else {
            lista.add(row.toString())
        }

        for (seat in 0..seats) {
            if (row > 0 && seat > 0) {
                lista.add("S")
            } else if (seat > 0) {
                lista.add(seat.toString())
            }
        }

        glavnaLista.add(lista)
    }
    return glavnaLista
}

fun ispisLayouta(list: MutableList<MutableList<String>>) {
    println("Cinema:")
    for (row in list) {
        for (seat in row) {
            print("$seat ")
        }
        println()
    }
}