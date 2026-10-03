fun divide(x: Int, y: Int): Int {
    return x / y
}
fun main(){
    try {
        val division= divide(1, 0)
        println(division)
    }catch(e:Exception){
        println("divide impossible : ${e.message}")
    }
}