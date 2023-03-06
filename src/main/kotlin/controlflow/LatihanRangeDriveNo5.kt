package controlflow

fun main() {
    val ganjil = 1..100 step 2
    var jumlah = 0
    for (n in ganjil) {
        jumlah += n
    }
    println("Jumlah bilangan ganjil dari 1 hingga 100 adalah $jumlah")
}




