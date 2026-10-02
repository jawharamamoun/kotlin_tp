fun main(){
    voitures.forEach {
        it.Afficher_details()
        it.se_deplacer()
    }

    avions.forEach {
        it.Afficher_details()
        it.se_deplacer()
    }
    velos.forEach {
        it.Afficher_details()
        it.se_deplacer()
    }
}
open class Vehicule(var marque : String, var modele: String){

    fun Afficher_details(){
        println("marque: $marque")
        println("modele: $modele")
    }
    open fun se_deplacer(){
        println("$marque se déplace en")
    }
}
class  Avion(marque : String,modele: String,
             var ailes:Int,
             var nbrRoues:Int):Vehicule(marque,modele){
    override fun se_deplacer(){
        println("$marque se déplace en voler")
    }

}

class  Voiture(marque : String,modele: String,
               var annee:Int,
               var nbrRoues:Int):Vehicule(marque,modele){
    override fun se_deplacer(){
        println("$marque se déplace en rouler")
    }

}

class  Velo(marque : String,modele: String,
            var nbrRoues:Int):Vehicule(marque,modele){
    override fun se_deplacer(){
        println("$marque se déplace en rouler")
    }

}
val voitures = listOf(
    Voiture("Toyota", "Corolla", 2020, 4),

)
val avions = listOf(
    Avion("Boeing", "737", 2, 6),

)
val velos = listOf(
    Velo("Btwin", "Riverside 500", 2))

