fun main() {
    var pers1 = Personne("mamoun","jawhara","wefaq",19)
    pers1.UpdateNom()
    pers1.UpdatePrenom()
    pers1.UpdateAdresse()
    pers1.UpdateAge()
    pers1.affiche()

}

class Personne(var nom:String,
               var prenom:String,
               var adresse:String,
               var age:Int){

    fun UpdateNom():String{
        println("changer votre nom")
        var nv_nom = readLine()!!
        nom = nv_nom
        println("votre nom est changer avec succee")
        return nom
    }

    fun UpdatePrenom():String{
        println("changer votre prenom")
        var nv_prenom:String = readLine()!!
        prenom = nv_prenom
        println("votre prenom est changer avec succee")
        return prenom
    }

    fun UpdateAge():Int{
        println("changer votre age")
        var nv_age = readLine()!!.toInt()
        age = nv_age
        println("votre age est changer avec succee")
        return age
    }

    fun UpdateAdresse():String{
        println("changer votre adresse")
        var nv_adresse = readLine()!!
        adresse = nv_adresse
        println("votre adresse est changer avec succee")
        return adresse
    }

    fun affiche(){
        println("Voici votre nom: $nom")
        println("Voici votre prenom: $prenom")
        println("Voici votre age: $age")
        println("Voici votre adresse: $adresse")
    }
}
