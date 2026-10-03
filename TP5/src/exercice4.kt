fun main(){
    var product1 = Product("Laptop", 800.0, 5)
    var product2 = Product("Souris", 20.0, 10)
    var product3 = Product("Clavier", 50.0, 7)
    var product4 = Product("Écran", 250.0, 3)


    totale(product1)
    totale(product2)
    totale(product3)
    totale(product4)
    println("--------")
    details(product1)
    details(product2)
    details(product3)
    details(product4)
    

}
data class Product(var name: String, var price: Double, var quantity:Int)

fun totale(p:Product):Double{
    return p.quantity*p.price
}
fun details(p:Product){
    println("nome du produit: ${p.name}")
    println("prix de produit: ${p.price}")
    println("quantity de produit: ${p.quantity}")

}