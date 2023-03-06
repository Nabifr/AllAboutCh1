package controlflow

fun main() {
    print("Input angka : ")
    val angka = readLine()?.toInt()

    val hari = when (angka) {
        1 -> "Senin"
        2 -> "Selasa"
        3 -> "Rabu"
        4 -> "Kamis"
        5 -> "Jumat"
        6 -> "Sabtu"
        7 -> "Minggu"
        else -> "Tidak valid"
    }

    println("Sekarang hari $hari")
}


