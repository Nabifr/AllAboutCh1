package controlflow

fun main() {
    var sum = 0
    for (i in 1..50) {
        if (i % 2 == 0) {
            continue
        }
        if (i > 25) {
            break
        }
        sum += i
    }
    println("Jumlah bilangan ganjil antara 1 dan 25 adalah $sum")
}






