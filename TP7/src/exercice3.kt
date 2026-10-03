fun main(){
    val listnbr = listOf(6,7,8,9,10,11,12,13,14,15,16)
    val removed_nbr = listOf(2,3,1,4)
    Set.addAll(listnbr)
    println(Set)
    Set.remove(0)
    Set.removeAll(removed_nbr)
    println(Set.contains(9))
    println(Set)
}
var Set= mutableSetOf(0,1,2,3,4,5)