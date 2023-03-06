package controlflow

fun main(){
    val range = 1..10

    for (i in range) {
        print("$i")
        if (i < 10) print(",")
    }
}




