
data class Produit(var nom: String,
                   var prix: Double,
                   var quantity: Int,
                   var description: String)
fun main(){
    var tele = Produit("samsung",2000.0,5,"samsung ultra 21 16gb ram 1tb")
    println(tele.toString())
    var tele2=tele.copy(prix=300.0, quantity = 10)
    println(tele2.toString())
    println(tele == tele2)
}
