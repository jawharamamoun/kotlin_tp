fun main() {
    val oiseau = Oiseau("Tweety")
    val chien = Chien("Rex")
    val poisson = Poisson("Nemo")

    oiseau.parler()
    oiseau.seDeplacer()
    oiseau.voler()

    chien.parler()
    chien.seDeplacer()

    poisson.parler()
    poisson.seDeplacer()
}

interface Animale {
    var nom: String

    fun parler()
    fun seDeplacer()
}

interface Volant {
    fun voler()
}

class Oiseau(override var nom: String) : Animale, Volant {

    override fun parler() {
        println("L'oiseau chante.")
    }

    override fun seDeplacer() {
        println("L'oiseau se déplace")
    }

    override fun voler() {
        println("L'oiseau vole")
    }
}

class Chien(override var nom: String) : Animale {

    override fun parler() {
        println("Le chien aboie.")
    }

    override fun seDeplacer() {
        println("Le chien marche")
    }
}

class Poisson(override var nom: String) : Animale {

    override fun parler() {
        println("Le poisson ne fait pas de bruit.")
    }

    override fun seDeplacer() {
        println("Le poisson nage")
    }
}