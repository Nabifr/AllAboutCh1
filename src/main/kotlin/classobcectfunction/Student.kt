package classobcectfunction
//extfun = function yang kita tambahkan kedalam suatu class
class Student(var nama:String, var umur:Int, var nim:String) {

}

//fuction biasa
//fun isAdult(umur: Int):Boolean{
//    return umur >= 18
//}

//extfun
fun Student.isAdult():Boolean{
    return umur >= 18
}

fun main() {
    val student1 = Student("Sekar", 18, "2020")
    println(student1.isAdult())
}