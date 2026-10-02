fun main(){
    val cercle1 = Cercle("Cercle",1.5)
    cercle1.afficher_details()

    val caree = Carre("Carre",3.4)
    caree.afficher_details()

    val Rectangle = Rectangle("Rectangle",3.5,10.1)
    Rectangle.afficher_details()
}
open class Forme( var nom: String){
    open fun surface(): Double{
        return 0.0
    }
    open fun perimetre(): Double{
        return 0.0
    }
    fun afficher_details(){
        println("le nom du forme: $nom")
        println("la surface de ce $nom : est ${surface()}")
        println("le perimetre de ce $nom : est ${perimetre()}")
    }
}
class Carre( nom: String ,var cote: Double) : Forme(nom){
    override fun surface(): Double{
        return cote*cote
    }
    override fun perimetre(): Double{
        return cote*4
    }
}
class Rectangle(nom: String,
                var longueur: Double,
                var largeur:Double):Forme(nom){
    override fun surface(): Double{
        var surface:Double = longueur*largeur
        return surface
    }
    override fun perimetre(): Double{
        var perimetre: Double = 2*(longueur+largeur)
        return perimetre
    }
}
class Cercle(nom: String,
             var rayon: Double,):Forme(nom){
    val pi : Double = 3.14
    override fun surface(): Double{
        var surface:Double = pi*rayon*rayon
        return surface
    }
    override fun perimetre(): Double{
        var perimetre: Double = 2*pi*rayon
        return perimetre
    }
}