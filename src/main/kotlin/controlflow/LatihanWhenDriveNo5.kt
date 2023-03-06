package controlflow

fun main() {
    print("Number : ")
    val number = readLine()?.toInt()

    val status = when {
        number == 0 -> "Zero"
        0 < number!! -> "Positive"
        else -> "Negative"
    }

    println(status)
}
