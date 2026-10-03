abstract class Vehicule(
    var immatriculation: String,
    var marque: String,
    var modele: String,
    var kilometrage: Int,
    var disponible: Boolean = true
) {

    open fun afficherDetails() {
        println("Immatriculation : $immatriculation")
        println("Marque : $marque")
        println("Modèle : $modele")
        println("Kilométrage : $kilometrage")
        println("Disponible : $disponible")
    }

    fun estDisponible(): Boolean {
        return disponible
    }

    fun marquerIndisponible() {
        disponible = false
    }

    fun marquerDisponible() {
        disponible = true
    }

    fun mettreAJourKilometrage(km: Int) {
        kilometrage = km
    }
}



class Voiture(
    immatriculation: String,
    marque: String,
    modele: String,
    kilometrage: Int,
    var nombrePortes: Int,
    var typeCarburant: String) : Vehicule(immatriculation, marque, modele, kilometrage) {

    override fun afficherDetails() {

        println("----- VOITURE -----")
        println("Immatriculation : $immatriculation")
        println("Marque : $marque")
        println("Modèle : $modele")
        println("Kilométrage : $kilometrage")
        println("Nombre de portes : $nombrePortes")
        println("Type carburant : $typeCarburant")
        println("Disponible : $disponible")
    }
}


class Moto(
    immatriculation: String,
    marque: String,
    modele: String,
    kilometrage: Int,
    var cylindree: Int) : Vehicule(immatriculation, marque, modele, kilometrage) {

    override fun afficherDetails() {

        println("----- MOTO -----")
        println("Immatriculation : $immatriculation")
        println("Marque : $marque")
        println("Modèle : $modele")
        println("Kilométrage : $kilometrage")
        println("Cylindrée : $cylindree cm3")
        println("Disponible : $disponible")
    }
}


class Conducteur(
    var nom: String,
    var prenom: String,
    var numeroPermis: String) {

    fun afficherDetails() {
        println("----- CONDUCTEUR -----")
        println("Nom : $nom")
        println("Prénom : $prenom")
        println("Numéro permis : $numeroPermis")
    }
}



class Reservation(
    var vehicule: Vehicule,
    var conducteur: Conducteur,
    var dateDebut: String,
    var dateFin: String,
    var kilometrageDebut: Int,
    var kilometrageFin: Int? = null) {

    fun cloturerReservation(kilometrageRetour: Int) {

        kilometrageFin = kilometrageRetour
        vehicule.mettreAJourKilometrage(kilometrageRetour)
        vehicule.marquerDisponible()
        println("Réservation clôturée.")
    }


    fun afficherDetails() {

        println("----- RESERVATION -----")
        println("Véhicule : ${vehicule.marque} ${vehicule.modele}")
        println("Immatriculation : ${vehicule.immatriculation}")
        println("Conducteur : ${conducteur.prenom} ${conducteur.nom}")
        println("Date début : $dateDebut")
        println("Date fin : $dateFin")
        println("Kilométrage début : $kilometrageDebut")
        println("Kilométrage fin : $kilometrageFin")
    }
}



class VehiculeIndisponibleException :
    Exception("Le véhicule n'est pas disponible.")

class VehiculeNonTrouveException :
    Exception("Le vehicule n'a pas été trouvé.")

class ParcAutomobile {
    var vehicules = mutableListOf<Vehicule>()
    var reservations = mutableListOf<Reservation>()

    fun ajouterVehicule(vehicule: Vehicule) {
        vehicules.add(vehicule)
        println("Vehicule ajoute.") }

    fun supprimerVehicule(immatriculation: String) {

        val vehicule = vehicules.find {
            it.immatriculation == immatriculation
        }
        if (vehicule == null) {
            throw VehiculeNonTrouveException() }
        vehicules.remove(vehicule)
        println("Vehicule supprime.")
    }


    fun reserverVehicule(
        immatriculation: String,
        conducteur: Conducteur,
        dateDebut: String,
        dateFin: String) {
        val vehicule = vehicules.find {
            it.immatriculation == immatriculation
        }


        if (vehicule == null) {
            throw VehiculeNonTrouveException()
        }


        if (!vehicule.estDisponible()) {
            throw VehiculeIndisponibleException()
        }

        val reservation = Reservation(vehicule, conducteur, dateDebut, dateFin, vehicule.kilometrage)
        reservations.add(reservation)
        reservations.add(reservation)
        vehicule.marquerIndisponible()
        println("Réservation effectuée.")
    }

    fun afficherVehiculesDisponibles() {
        println("===== VEHICULES DISPONIBLES =====")
        for (vehicule in vehicules) {
            if (vehicule.estDisponible()) {
                vehicule.afficherDetails()
            }
        }
    }

    fun afficherReservations() {
        println("===== RESERVATIONS =====")
        for (reservation in reservations) {
            reservation.afficherDetails()
        }
    }
}
fun main() {
    val parc = ParcAutomobile()
    val voiture1 = Voiture("123-A-1", "Dacia", "Logan", 50000, 4, "Diesel")
    val voiture2 = Voiture("456-B-2", "Renault", "Clio", 30000, 4, "Essence")
    val moto1 = Moto("789-C-3", "Yamaha", "MT-07", 15000, 689)
    val moto2 = Moto("111-D-4", "Honda", "CBR", 10000, 600)

    parc.ajouterVehicule(voiture1)
    parc.ajouterVehicule(voiture2)
    parc.ajouterVehicule(moto1)
    parc.ajouterVehicule(moto2)

    val conducteur1 = Conducteur("Mamoun", "Jawhara", "P12345")

    val conducteur2 = Conducteur("Alami", "Sara", "P67890")

    try {
        parc.reserverVehicule("123-A-1", conducteur1, "03/10/2026", "05/10/2026")
    } catch (e: Exception) {
        println(e.message)
    }

    try {
        parc.reserverVehicule("789-C-3", conducteur2, "04/10/2026", "06/10/2026")
    } catch (e: Exception) {
        println(e.message)
    }
    parc.afficherVehiculesDisponibles()
    println("===== TEST VEHICULE INDISPONIBLE =====")

    try {
        parc.reserverVehicule("123-A-1", conducteur2, "07/10/2026", "09/10/2026")

    } catch (e: VehiculeIndisponibleException) {
        println(e.message)
    } catch (e: VehiculeNonTrouveException) {
        println(e.message)
    }
    println("===== TEST VEHICULE INEXISTANT =====")

    try {
        parc.reserverVehicule("999-X-9", conducteur1, "10/10/2026", "12/10/2026")
    } catch (e: VehiculeIndisponibleException) {
        println(e.message)
    } catch (e: VehiculeNonTrouveException) {
        println(e.message)
    }
    println("===== RETOUR DU VEHICULE =====")
    val reservation = parc.reservations[0]
    reservation.cloturerReservation(50500)
    parc.afficherVehiculesDisponibles()
}