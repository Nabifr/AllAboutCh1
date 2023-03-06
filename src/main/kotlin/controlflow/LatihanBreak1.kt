package controlflow

fun main() {
    var sum = 0
    for (i in 1..50 step 2) {
        if (i > 25) {
            break
        }
        sum += i
    }
    println("Jumlah bilangan ganjil antara 1 dan 25 adalah $sum")
}







