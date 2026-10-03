fun main(){
    val lion = Terrestre("lion","lion",Animaux.TERRESTRE)
    val oiseau = VolantAnimal("oiseau","oiseau",Animaux.VOLANT)
    val shark = AquatiqueAnimal("shark","shark",Animaux.AQUATIQUE)
    ajouteranimal(lion)
    ajouteranimal(oiseau)
    ajouteranimal(shark)
    println(oiseau.voler())
    println(shark.nager())


}
enum class Animaux{
    TERRESTRE,VOLANT,AQUATIQUE
}

interface Volant{
    fun voler(): String
}

interface Aquatique{
    fun  nager(): String
}

sealed class Animal(var nom:String,
                    var espece: String,
                    var type:Animaux)


data class Terrestre(
    var nomAnimal: String,
    var especeAnimal: String,
    var typeAnimal: Animaux
) : Animal(nomAnimal, especeAnimal, typeAnimal)

data class VolantAnimal(
    var nomAnimal: String,
    var especeAnimal: String,
    var typeAnimal: Animaux
) : Animal(nomAnimal, especeAnimal, typeAnimal), Volant {

    override fun voler(): String {
        return "$nomAnimal est un animal qui vole."
    }
}


data class AquatiqueAnimal(
    var nomAnimal: String,
    var especeAnimal: String,
    var typeAnimal: Animaux
) : Animal(nomAnimal, especeAnimal, typeAnimal), Aquatique {

    override fun nager(): String {
        return "$nomAnimal est un animal qui nage."
    }
}

val parcanimaux = mutableListOf<Animal>()

fun ajouteranimal(obj:Animal){
    parcanimaux.add(obj)
}