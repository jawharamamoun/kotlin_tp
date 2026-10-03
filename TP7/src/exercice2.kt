fun main(){
    var list = mutableListOf("jawhara","douae","maria")

    list.add("reda")
    list.removeAt(1)
    list.remove("maria")
    println(list.contains("reda" ))
    println(list.size)
    println(list)

}