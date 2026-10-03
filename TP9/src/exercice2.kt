fun main() {

    print("Entrez la note du premier examen /20 : ")
    val note1 = readln()!!.toDouble()

    print("Entrez la note du deuxième examen /20 : ")
    val note2 = readln()!!.toDouble()

    print("Entrez la note du troisième examen /20 : ")
    val note3 = readln()!!.toDouble()


    val moyenne = (note1 + note2 + note3) / 3


    val pourcentage = (moyenne / 20) * 100

    println("La moyenne est : $moyenne / 20")
    println("Le pourcentage est : $pourcentage%")


    if (pourcentage >= 80) {
        println("Réussi avec mention excellente")
    } else if (pourcentage >= 50) {
        println("Réussi")
    } else {
        println("Échoué")
    }
}