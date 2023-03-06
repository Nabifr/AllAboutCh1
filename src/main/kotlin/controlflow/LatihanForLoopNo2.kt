package controlflow
fun main() {
    val n = 8 // jumlah baris

    for (i in 0 until n) {
        for (j in 0 until n-i-1) {
            print("  ") // cetak spasi
        }
        for (k in 0 until 2*i+1) {
            print("* ") // cetak bintang
        }
        println() // baris baru
    }
}





