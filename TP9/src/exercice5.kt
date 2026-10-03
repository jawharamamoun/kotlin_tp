fun calculecouteux(): Int {
    return 1200
}

val resultat by lazy{
    println("Calculating resultat")
    calculecouteux()
}

fun main(){
    println("Calcule is running...")

    println("${resultat}DH")
}