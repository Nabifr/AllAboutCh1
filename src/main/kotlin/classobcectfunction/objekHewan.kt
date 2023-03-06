package classobcectfunction

fun main() {
    //deklarasi objek
    val hewan1 = Hewan()
    println("Nama Hewan : ${hewan1.namaHewan}")
    println("Jumlah Kaki : ${hewan1.jumlahKaki}")
    println("Hewan dapat ${hewan1.berjalan()}")
    println("")

    //objek2
    val hewan2 = Hewan()
    hewan2.namaHewan = "Bayu"
    println("Nama Hewan : ${hewan2.namaHewan}")
    println("Jenis Makanan : ${hewan2.jenisMakanan}")
    println("Hewan dapat ${hewan2.terbang()}")
    println("")

    //objek3
    val hewan3 = Hewan()
    hewan2.namaHewan = "Jono"
    hewan2.jumlahKaki = 0
    println("Nama Hewan : ${hewan3.namaHewan}")
    println("Jumlah Kaki : ${hewan3.jumlahKaki}")
    println("Hewan dapat ${hewan3.berenang()}")
    println("")

}