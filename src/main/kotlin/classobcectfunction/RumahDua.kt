package classobcectfunction

class RumahDua(var panjangRumah:Int=120,
               var lebarRumah:Int,
               var luasTanah:Int,
               var namaPemilik : String,
               var warnaRumah:String) {


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
