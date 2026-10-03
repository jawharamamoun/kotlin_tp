fun main(){
    var c1=Camion("scania","fe2155d",2005,50000)
    var v1=Voiture("dacia","sandero",2020,4)
    v1.klaxonner()
    v1.start()
    v1.stop()
    c1.charger()
    c1.stop()
    c1.start()
}
interface Vehicule {
    var model: String
    var marque: String
    var anne: Int
    fun start()
    fun stop()
}
open class VehiculeBase(override var marque: String,
                        override var model: String,
                        override var anne: Int
): Vehicule {
    override fun start() {println("start") }
    override fun stop() {println("stop")}

}

class Voiture(marque: String,
              model: String,
              anne: Int,var nombrePortes: Int)
    :VehiculeBase(marque,model,anne){
    override fun start() {println("Voiture start") }
    override fun stop() {println("Voiture stop") }
    fun klaxonner(){
        println("voiture klaxonner")
    }
}

class Camion(marque: String,
             model: String,
             anne: Int,var capaciteChargement: Int)
    :VehiculeBase(marque,model,anne){
    override fun start() {println("Camion start") }
    override fun stop() {println("Camion stop") }
    fun charger(){
        println("Camion charger")
    }
}