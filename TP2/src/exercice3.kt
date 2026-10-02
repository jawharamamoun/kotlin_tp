fun main(){
    var car1 = Car("fiat",2026,"blanc",20000)
    car1.affiche()
    car1.updatemarque()
    car1.updatecouleur()
    car1.updatemodele()
    car1.updatekilometrs()
    car1.affiche()
}
class Car(var marque: String,
          var modele: Int,
          var couleur: String,
          var kilometrage: Int){
    fun updatemarque():String{
        println("changer la marque:")
        marque = readln()
        return  marque
    }
    fun  updatemodele():Int{
        println("changer modele :")
        modele = readln().toInt()
        return modele
    }
    fun updatecouleur(): String{
        println("changer couleur : ")
        couleur = readln()
        return couleur
    }
    fun updatekilometrs(): Int{
        println("changer kilometrs : ")
        kilometrage = readln().toInt()
        return kilometrage
    }
    fun affiche(){
        println("voici votre voiture:")
        println("marque: $marque")
        println("modele: $modele")
        println("couleur: $couleur")
        println("kilometrage: $kilometrage Km")

    }


}