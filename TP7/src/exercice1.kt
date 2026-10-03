fun String. containsSubstring(substring: String): Boolean{
    return this.contains(substring)
}

fun main(){
    val jawhara = "jawhara"
    jawhara.containsSubstring("an")
    println(jawhara.containsSubstring("or"))
}
