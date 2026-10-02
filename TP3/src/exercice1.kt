fun main(){
    val C1=Cercl("blanc",10.5)
    val r1 = Rectangle("noire",10.0,12.5)
    C1.afficherInfo()
    r1.afficherInfo()
}

open class Form(var coleur:String){
    open fun afficherInfo(){
        println("couleur de cett fome est $coleur")
    }
}

class Cercl(coleur: String,var rayon: Double):Form(coleur){
    override fun afficherInfo(){
        println("couleur de ce Cercle est $coleur et leur rayon = $rayon")
    }

}

class Rectangle(coleur: String,var largeur:Double,var longueur:Double):Form(coleur){
    override fun afficherInfo(){
        println("couleur de ce Rectangle est $coleur et leur largeur x  longueur = $largeur x $longueur")
    }
}