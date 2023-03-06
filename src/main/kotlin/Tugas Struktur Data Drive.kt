fun main(){
    var namaaa : String
    namaaa = "John Doe"
    println(namaaa)

    var umur : Int
    umur = 25
    println(umur)

    var gaji : Double
    gaji = 5000.0
    println(gaji)

    var status : Boolean = true
    println(status)

    var nilaiii : Float = 7.5f
    println(nilaiii)

    var angka1 : Long = 123456789L
    println(angka1)

    var angka2 : Short = 100
    println(angka2)

    var huruf1 : Char = 'A'
    println(huruf1)

    var nilaiString : String = "10"
    println(nilaiString)

    var angka3 : Byte = 25
    println(angka3)

    var angkaaa = intArrayOf(1,2,3,4,5)
    println(angkaaa.contentToString())

    var hurufff = charArrayOf('a','b','c','d','e')
    println(hurufff.contentToString())

    var nilai1 = doubleArrayOf(3.5,4.0,2.5,3.0)
    println(nilai1.contentToString())

    val nama1: Array<String> = arrayOf("John", "Doe", "Jane", "Doe")
    println(nama1.contentToString())

    val bulannn = Array(12){""}
    bulannn[0] = "Januari"
    bulannn[1] = "Februari"
    bulannn[2] = "Maret"
    bulannn[3] = "April"
    bulannn[4] = "Mei"
    bulannn[5] = "Juni"
    bulannn[6] = "Juli"
    bulannn[7] = "Agustus"
    bulannn[8] = "September"
    bulannn[9] = "Oktober"
    bulannn[10] = "November"
    bulannn[11] = "Desember"
    println(bulannn.contentToString())

    val nilaiFloatt = floatArrayOf(2.5f,3.0f,2.0f)
    println(nilaiFloatt.contentToString())

    val angka = listOf(1, 2, 3, 4, 5)
    println(angka)

    val huruf = listOf('a', 'b', 'c', 'd', 'e')
    println(huruf)

    val nilai: List<Double> = listOf(3.5, 4.0, 2.5, 3.0)
    println(nilai)

    val nama: List<String> = listOf("John", "Doe", "Jane", "Doe")
    println(nama)

    val bulan: List<String> = listOf("Januari", "Februari", "Maret", "April",
        "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember")
    println(bulan)

    val nilaiFloat: List<Float> = listOf(2.5f, 3.0f, 2.0f)
    println(nilaiFloat)

    val angkaa = mutableListOf(1, 2, 3, 4, 5)
    angkaa[2] = 10
    println(angkaa)

    val huruff = mutableListOf('a', 'b', 'c', 'd', 'e')
    huruff[2] = 'f'
    println(huruff)

    val nilaii = mutableListOf(3.5, 4.0, 2.5, 3.0)
    nilaii.add(4.5)
    println(nilaii)

    val namaa = mutableListOf("John", "Doe", "Jane", "Doe")
    namaa.removeAt(2)
    println(namaa)

    val bulann = listOf("Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus",
        "September", "Oktober", "November", "Desember")
    val bulanBaru = bulann.toMutableList()
    bulanBaru.add(0, "Januari")
    println(bulanBaru)








}