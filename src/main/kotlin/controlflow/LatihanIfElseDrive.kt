package controlflow
//exceute
fun main(){
    println(isOdd(9))
    println(getDiscount(140.000, 50.0))
    println(calculateGrade(95))
    println(calculateGrade(95))
    println(calculateGrade(80))
    println(calculateGrade(73))
    println(calculateGrade(67))
    println(calculateGrade(45))


}

//Syntax
//1
fun isOdd(num: Int): Boolean {
    return num % 2 != 0
}

//2
fun getDiscount(price: Double, discount: Double): Double {
    if (price > 100 && discount > 10) {
        return price * (1 - discount/100)
    } else {
        return price
    }
}

//3
fun calculateGrade(score: Int): String {
    when (score) {
        in 90..100 -> return "A"
        in 80..89 -> return "B"
        in 70..79 -> return "C"
        in 60..69 -> return "D"
        else -> return "F"
    }
}

//4








