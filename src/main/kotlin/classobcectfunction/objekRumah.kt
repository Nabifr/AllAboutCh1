package classobcectfunction

fun main() {
    //deklarasi objek
    val rumahA = Rumah()
    rumahA.warnaRumah = "Putih"
    println("Nama Pemilik Rumah : ${rumahA.namaPemilik}")
    println("Salah satu fungsi rumah A : ${rumahA.AsistenAi()}")
    println("Warna Rumah A : ${rumahA.warnaRumah}")

    //objek 2
    val rumahB = Rumah()
    rumahB.namaPemilik = "Reno"
    println(rumahB.namaPemilik)


    //function
    PrimaryConstructor()
    SecondaryConstructor()
    ContohLambFun()

    val sum = {a : Int, b : Int -> a+b }
    val sub = {a : Int, b : Int -> a-b}

    val hitungSum = calculate(12,14,sum)
    val hitungSub = calculate(13,10,sub)
    println("Hasil Penjumlahan : $hitungSum")
    println("Hasil Pengurangan : $hitungSub")
}

fun calculate(a : Int, b : Int, operation:(Int,Int)->Int):Int{
    return operation(a,b)
}

fun PrimaryConstructor(){
    //primary constructor
    val rumahC = RumahDua(120, 50, 50, "Sekar", "Hijau")
    rumahC.luasTanah = 150
}

fun SecondaryConstructor(){
    //secondary constructor
    val rumahD =RumahTiga(100, 80, "Surya")
    val rumahE =RumahTiga(150, "Kuning")
}

fun ContohLambFun(){
    //contoh penggunaan Lambda Expression/anonymous function
    val ucapanUltah = {name:String -> "Happy Birthday $name"}
    val ucapan1 = ucapanUltah("Reno")
    println(ucapan1)
}

fun ContohHigherOrderFun() {
    //HOF : function yang ada didalam parameter funtion
}

//jika kita tidak menggunakan HOF
fun tambah(a:Int,b: Int):Int{
    return a+b
}
fun kurang(a:Int,b: Int):Int{
return a-b
}
