package controlflow

fun main() {
    val arr = intArrayOf(5, 3, 7, 9, 6, 2)
    var result = 0

    for (num in arr) {
        if (num % 3 == 0) {
            result = num
            break
        }
    }

    println("Bilangan pertama dalam array yang habis dibagi 3 adalah $result")
}







