package SOLID

fun main() {
    open class bagasiMobil(){
        open fun platNomor(plat : String):String{
            return plat
        }
    }
    class lampuLed : bagasiMobil(){
        fun getlampuPlat(){

        }
    }
}