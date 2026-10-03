class Banque{

    class CompteBancaire(var numeroCompte: String,var solde: Double){
        fun deposer(montant: Double):Double{
            solde += montant
            return solde
        }
        fun retirer(montant: Double): Double{
            solde -= montant
            return solde
        }
    }

    fun creerCompte(numeroCompte: String,solde: Double):CompteBancaire{
        var compte = CompteBancaire(numeroCompte,solde)
        return compte

    }
}

fun main() {
    var cih = Banque()
    var cpt1=cih.creerCompte("14523656",150.0)
    cpt1.retirer(50.0)
    cpt1.deposer(200.0)
    cpt1.retirer(200.0)
    println(cpt1.solde)

}