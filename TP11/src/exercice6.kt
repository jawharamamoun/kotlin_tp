fun convertToInt(string: String): Int {
    try {
        val nbr = string.toInt()
        if (nbr < 0) {
            throw NegativeNumberException("ERROR entier est négatif")
        }
        return nbr
    } catch (e:Exception) {
        println(e.message)
        return 0
    }
}

class NegativeNumberException(message: String): Exception(message)


fun main() {

    val valeurs = listOf(
        "25",
        "0",
        "-10",
        "abc",
        "12.5", "100")

    for (i in valeurs) {
        try {
            val resultat = convertToInt(i)
            println("Conversion réussie : $i -> $resultat")

        } catch (e: NegativeNumberException) {
            println("Erreur : ${e.message}")
        }

        println("--------------------")
    }
}