open class Personne(
    var nom: String,
    var prenom: String,
    var email: String
) {

    fun afficherInfos() {
        println("Nom : $nom")
        println("Prénom : $prenom")
        println("Email : $email")
    }
}

class Utilisateur(
    nom: String,
    prenom: String,
    email: String,
    var idUtilisateur: Int) : Personne(nom, prenom, email) {

    var emprunts = mutableListOf<Emprunt>()

    fun emprunterLivre(livre: Livre, dateEmprunt: String) {

        if (livre.disponiblePourEmprunt()) {
            livre.nombreExemplaires
            val emprunt = Emprunt(this, livre, dateEmprunt)
            emprunts.add(emprunt)
            println("Livre emprunté !")

        } else {
            println("Livre non disponible.") }
    }

    fun afficherEmprunts() {

        for (emprunt in emprunts) {
            emprunt.afficherDetails() }
    }
}

class Livre(
    var titre: String,
    var auteur: String,
    var isbn: String,
    var nombreExemplaires: Int
) {

    fun afficherDetails() {
        println("Titre : $titre")
        println("Auteur : $auteur")
        println("ISBN : $isbn")
        println("Exemplaires : $nombreExemplaires")
    }

    fun disponiblePourEmprunt(): Boolean {
        return nombreExemplaires > 0
    }

    fun mettreAJourStock(nouveauStock: Int) {
        nombreExemplaires = nouveauStock
    }
}


class Emprunt(
    var utilisateur: Utilisateur,
    var livre: Livre,
    var dateEmprunt: String,
    var dateRetour: String? = null
) {

    fun afficherDetails() {

        println("Livre : ${livre.titre}")
        println("Utilisateur : ${utilisateur.nom} ${utilisateur.prenom}")
        println("Date d'emprunt : $dateEmprunt")

        if (dateRetour == null) {
            println("Date de retour : Pas encore retourné")
        } else {
            println("Date de retour : $dateRetour")
        }
    }


    fun retournerLivre() {

        if (dateRetour == null) {
            dateRetour = "02/10/2026"

            livre.mettreAJourStock(livre.nombreExemplaires + 1)

            println("Le livre ${livre.titre} a été retourné.")

        } else {
            println("Ce livre a déjà été retourné.") }
    }
}




abstract class GestionBibliotheque {

    var utilisateurs: MutableList<Utilisateur> = mutableListOf()
    var livres: MutableList<Livre> = mutableListOf()

    fun ajouterUtilisateur(utilisateur: Utilisateur) {
        utilisateurs.add(utilisateur)
        println("Utilisateur ${utilisateur.prenom} ${utilisateur.nom} ajouté.")
    }

    fun ajouterLivre(livre: Livre) {
        livres.add(livre)
        println("Livre ${livre.titre} ajouté.")
    }


    fun afficherTousLesLivres() {
        println(" TOUS LES LIVRES")

        for (livre in livres) {
            livre.afficherDetails()
            println("-------------------------")
        }
    }
}




class Bibliotheque : GestionBibliotheque() {

    fun rechercherLivreParTitre(titre: String): Livre? {

        for (livre in livres) {

            if (livre.titre.equals(titre, ignoreCase = true)) {
                return livre }
        }

        return null
    }
}
fun main() {

    println("GESTION DE BIBLIOTHÈQUE")
    println("---------------------------")

    val livre1 = Livre("Le Petit Prince", "Antoine de Saint-Exupéry", "9782070612758", 4)
    val livre2 = Livre("Harry Potter", "J.K. Rowling", "9782070541270", 2)
    println("---------------------------")

    val utilisateur1 = Utilisateur("Mamoun", "Jawhara", "jawhara@gmail.com", 1)
    val utilisateur2 = Utilisateur("Alami", "Sara", "sara@gmail.com", 2)
    println("---------------------------")

    val bibliotheque = Bibliotheque()
    bibliotheque.ajouterLivre(livre1)
    bibliotheque.ajouterLivre(livre2)
    println("---------------------------")

    bibliotheque.ajouterUtilisateur(utilisateur1)
    bibliotheque.ajouterUtilisateur(utilisateur2)
    println("---------------------------")

    bibliotheque.afficherTousLesLivres()

    println("---------------------------")
    println("===== INFORMATIONS UTILISATEUR =====")
    utilisateur1.afficherInfos()

    println("---------------------------")
    println("===== EMPRUNTS =====")

    utilisateur1.emprunterLivre(livre1, "01/10/2026")
    utilisateur2.emprunterLivre(livre2, "02/10/2026")
    println("---------------------------")

    utilisateur1.afficherEmprunts()
    utilisateur2.afficherEmprunts()

    println("---------------------------")
    println("===== RECHERCHE D'UN LIVRE =====")
    val livreRecherche = bibliotheque.rechercherLivreParTitre("Harry Potter")
    if (livreRecherche != null) {
        println("Livre trouvé :")
        livreRecherche.afficherDetails()
    } else {
        println("Livre non trouvé.") }
}