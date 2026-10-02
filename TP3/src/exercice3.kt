fun main(){
    val v1=Vehicule("voiture")
    val v2=Voiture("DACIA")
    val v3=Camion("scania",1000)

}
open class Vehicule(var marque:String){
    init{
        println("$marque eco vehicule hybrid")
    }
}
class Voiture(marque:String,var nombrePortes:Int=4):Vehicule(marque){
    init{
        println("$marque, $nombrePortes")
    }
}
class Camion(marque:String,var capaciteCharge: Int):Vehicule(marque){
    init {
        println("$marque, $capaciteCharge kg")
    }
}