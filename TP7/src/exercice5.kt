import java.util.Collections
import kotlin.collections.mutableListOf

fun main(){
    val addnbr = listOf(11,12,13,14,15,16,17,18,19)
    objets.addAll(addnbr)
    val listimmuable:List<Int>  = objets.toList()
    objets.shuffle()
    objets.sort()

    println(listimmuable)
    println(objets)

}
val objets = mutableListOf(1,2,3,4,5,6,7,8,9,10)