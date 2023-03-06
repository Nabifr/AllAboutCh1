package controlflow

fun main() {
    print("Masukkan sebuah bilangan bulat positif: ")
    var num = readLine()?.toIntOrNull() ?: 0

    var i = 1
    do {
        println(i)
        i++
    } while (i < num)
}






