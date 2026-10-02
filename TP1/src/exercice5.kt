import kotlin.math.max

fun main(){
    fun carre(x:Int): Int{
        var res : Int = x*x
        return res
    }
    println("Saisie un nombre ")
    var nbr = readln().toInt()
    println(carre(nbr))

    println("Saisie deux nombre pour voire leur somme")
    var nbr1 = readln().toInt()
    var nbr2 = readln().toInt()

    fun addition (x:Int,y:Int):Int{
        return x+y
    }
    println("la somme de  $nbr1+$nbr2 et ${addition(nbr1,nbr2)}")


    fun maximum(x:Int,y:Int): Int{
        return maxOf(x,y)
    }
    println("${maximum(nbr1,nbr2)} est le plus grande")

    println("Saisie un nombre pour voire cest une nombre pair ou non")
    var nbr3 = readln().toInt()

    fun estpair(x:Int):Boolean{
        if((x%2)==0){
            return true
        }else{
            return false
        }
    }
    println("${maximum(nbr1,nbr2)} est pair")
}