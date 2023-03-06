package classobcectfunction

import javax.management.relation.RelationNotification

class Rumah {
    //deklarasi attribut - properti
    var panjangRumah : Int = 190
    var lebarRumah : Int = 50
    var luasTanah = 100
    var namaPemilik : String = "Reno"
    var warnaRumah : String = "Kuning"

    //deklarasi function
    fun hidupkanTv():String{
        return "Rumah bisa menghidupkan TV"
    }

    fun matikanTv():String{
        return "Rumah bisa mematikan TV"
    }

    fun AsistenAi():String{
        return "Rumah mempunyai Asisten Ai"
    }
}