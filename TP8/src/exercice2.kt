
enum class TypeVehicule {
    VOITURE, MOTO, BATEAU
}

sealed class Vehicule(
    var nom: String,
    var marque: String,
    var type: TypeVehicule
)

data class Voiture(
    var nom1: String,
    var marque1: String,
    var type1: TypeVehicule = TypeVehicule.VOITURE
) : Vehicule(nom1, marque1, type1)

data class Moto(
    var nom1: String,
    var marque1: String,
    var type1: TypeVehicule = TypeVehicule.MOTO
) : Vehicule(nom1, marque1, type1)

data class Bateau(
    var nom1: String,
    var marque1: String,
    var type1: TypeVehicule = TypeVehicule.BATEAU
) : Vehicule(nom1, marque1, type1), Navigable {

    override fun naviguer() {
        println("$nom1 $marque1 $type1 navigue.")
    }
}

interface Navigable {
    fun naviguer()
}

val dispoVehicule = mutableListOf<Vehicule>()

fun ajoutervehicule(obj: Vehicule) {
    println("Véhicule ajouté avec succès")
    dispoVehicule.add(obj)
}

fun afficherInformationsVehicule() {
    for (vehicle in dispoVehicule) {
        println("${vehicle.nom} ${vehicle.marque} ${vehicle.type}")

        if (vehicle is Navigable) {
            vehicle.naviguer()
        }
    }
}
fun main() {
    val voiture = Voiture("dacia", "sandero", TypeVehicule.VOITURE)
    val moto = Moto("ninja h2 r", "kawasaki", TypeVehicule.MOTO)
    val bateau = Bateau("yacht", "kawasaki", TypeVehicule.BATEAU)

    ajoutervehicule(voiture)
    ajoutervehicule(moto)
    ajoutervehicule(bateau)

    afficherInformationsVehicule()
}
