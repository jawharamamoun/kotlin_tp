enum class EtatCommande{
    EN_COURS,EXPEDIEE,LIVREE,ANNULEE,
}
fun message(etat: EtatCommande) {
    when (etat) {
        EtatCommande.EN_COURS -> println("Et cours")
        EtatCommande.LIVREE -> println("Livrees")
        EtatCommande.EXPEDIEE -> println("Et expedIEE")
        EtatCommande.ANNULEE -> println("AnnulER")

    }
}
class Commande(var numeroCommande: String,var etat: EtatCommande){
    fun changerEtat(){
        when(etat){
            EtatCommande.EN_COURS -> {
                println("chnager etat a LIVREE/ANNULEE/ANNULEE")
                var typettat = readln()!!.uppercase()
                etat = EtatCommande.valueOf(typettat)
                println("etat de commande changer avec succee")
            }
            EtatCommande.LIVREE -> {
                println("chnager etat a EXPEDIEE/ANNULEE/EN_COURS")
                var typettat = readln()!!.uppercase()
                etat = EtatCommande.valueOf(typettat)
                println("etat de commande changer avec succee")
            }
            EtatCommande.EXPEDIEE -> {
                println("chnager etat a LIVREE/ANNULEE/EN_COURS")
                var typettat = readln()!!.uppercase()
                etat = EtatCommande.valueOf(typettat)
                println("etat de commande changer avec succee")

            }
            EtatCommande.ANNULEE -> {
                println("chnager etat a ANNULEE/EN_COURS")
                var typettat = readln()!!.uppercase()
                etat = EtatCommande.valueOf(typettat)
                println("etat de commande changer avec succee")
            }
        }

    }
}

fun main(){
    var commande1 = Commande("1205",EtatCommande.EN_COURS)
    println(commande1.etat)
    commande1.changerEtat()
    println(commande1.etat)

}