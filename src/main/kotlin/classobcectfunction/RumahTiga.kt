package classobcectfunction

class RumahTiga {
    //deklarasi attribut - properti
    var panjangRumah : Int = 190
    var lebarRumah : Int = 50
    var luasTanah = 100
    var namaPemilik : String = "Reno"
    var warnaRumah : String = "Kuning"

    constructor(_panjangRumah:Int, _lebarRumah:Int, _namaPemilik:String){
        this.panjangRumah = _panjangRumah
        this.lebarRumah = _lebarRumah
        this.namaPemilik = _namaPemilik
    }

    constructor(_luasTanah:Int, _warnaRumah:String){
        this.luasTanah = _luasTanah
        this.warnaRumah = _warnaRumah
    }



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