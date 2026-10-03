val Numbers = listOf<Int>(0,28,55,0,6,4,58,3,78,2,78)

val somme = fun(nombres: List<Int>): Int{
    var res = 0
    for (i in nombres){
        res += i
    }
    return res
}
fun main(){

    println(somme(Numbers))
}