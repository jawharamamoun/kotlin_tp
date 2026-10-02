fun main(){
    var p1=Eleve("hiba","ts",27)
    var p2=Employe("jawhara","chef d'equipe")
    var p3=Personne("douae")
    p1.afficherDetails()
    p2.afficherDetails()
    p3.afficherDetails()
}
open class Personne(var nom:String, var age:Int=24 ){
    open fun afficherDetails(){
        println("$nom, $age")
    }

}

class Eleve(nom:String,var niveau: String, age:Int=24):Personne(nom,age){ //sabe9na niveau 3la age bach mni nbghiw ndiro objet b age par defaullt declaer maytrach lina mochkile f execution
    override fun afficherDetails(){
        println("$nom, $age,$niveau")
    }
}
class Employe(nom:String,var poste:String, age:Int=24):Personne(nom,age){
    override fun afficherDetails(){
        println("$nom, $age,$poste")
    }
}