package controlflow

fun main(){
    var i = 1
    var count = 0
    while (i <= 50) {
        if (i % 2 != 0) {
            count++
        }
        i++
    }
    println("Jumlah bilangan ganjil antara 1 dan 50 adalah $count")

}




