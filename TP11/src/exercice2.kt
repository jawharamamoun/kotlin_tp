import java.util.Collections.list
import kotlin.collections.listOf
import kotlin.collections.mutableListOf

val TABLE_entier = listOf<Int>(10,28,55,0,6,4,58,3,78,2,78)

var nbrpairs = mutableListOf<Int>()
var nbrimpairs = mutableListOf<Int>()
var superieurnbrs = mutableListOf<Int>()

val filtrnbr: (List<Int>)-> Unit ={list : List<Int> ->for(i in list){

    if (i%2==0){
        nbrpairs.add(i)
    }else{
        nbrimpairs.add(i)
    }
}
}
val superieur:(List<Int>)->Unit ={list:List<Int> ->for(i in list){
    if (i>10){
        superieurnbrs.add(i)
    }
}}

fun main(){
    filtrnbr(TABLE_entier)
    superieur(TABLE_entier)

    println("voila la liste des nombres pairs \n"+nbrpairs)
    println("voila la liste des nombres impairs \n"+nbrimpairs)
    println("voila la liste des nombres superieurnbrs a 10 \n"+superieurnbrs)

}