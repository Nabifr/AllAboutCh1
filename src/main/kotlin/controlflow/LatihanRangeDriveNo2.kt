package controlflow

fun main(){

    val genap = 0..20 step 2
    for (bilangan in genap) {
        if (bilangan != 16) {
            println(bilangan)
        }
    }
}



