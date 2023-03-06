package classobcectfunction
data class Book(val name: String, val title: String, val quantity: Int, val price: Int, val payment: Int)

fun main() {
    val book = inputBookInfo()
    val totalPrice = book.price * book.quantity
    val change = book.quantity * book.price - book.payment
    printReceipt(book.name.uppercase(), book.title, book.quantity, book.price, totalPrice, change)
}

fun inputBookInfo(): Book {
    println("========================================")
    println("INPUT TRANSAKSI PENJUALAN TOKO BUKU AND5")
    println("----------------------------------------")
    print("Masukkan Nama Pembeli: ")
    val name = readLine() ?: ""
    print("Masukkan Judul Buku: ")
    val title = readLine() ?: ""
    print("Masukkan Jumlah Buku: ")
    val quantity = readLine()?.toInt() ?: 0
    print("Masukkan Harga Satuan: ")
    val price = readLine()?.toInt() ?: 0
    print("Masukkan Uang Bayar: ")
    val payment = readLine()?.toInt() ?: 0
    return Book(name, title, quantity, price, payment)
}

fun printReceipt(name: String, title: String, quantity: Int, price: Int, totalPrice: Int, change: Int) {
    println("==============================")
    println("STRUK PEMBELIAN BUKU TOKO AND5")
    println("------------------------------")
    println("Nama Pembeli: $name")
    println("Buku yg dibeli: $title")
    println("Jumlah : $quantity")
    println("Harga Satuan: Rp.$price")
    println("Total Harga: Rp.$totalPrice")
    if (totalPrice in 150000..200000) {
        println("Bonus: 1 Pena Kecil")
    } else if (totalPrice in 200000..300000) {
        println("Bonus: 1 Buku Catatan")
    } else if (totalPrice > 300000) {
        val discount = 50000
        val finalPrice = if (totalPrice - discount < 0) 0 else totalPrice - discount
        println("Diskon: Rp.$discount")
        println("Harga Setelah Diskon: Rp.$finalPrice")
    } else {
        println("Bonus: 0")
    }
    println("Uang Bayar: Rp.${totalPrice}")
    println("Kembalian: Rp.$change")
    println("---------TERIMA KASIH---------")
    println("        TOKO BUKU AND5        ")
    println("==============================")
}