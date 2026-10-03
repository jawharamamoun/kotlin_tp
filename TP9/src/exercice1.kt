fun resultats(a:Int,b:Int){
    if(b==0){
        throw Exception("divison par zero impossible")
    }else{
        println("${a}/${b} = ${a/b}")
    }

    println("${a}+${b} = ${a+b}")
    println("${a}-${b} = ${a-b}")
    println("${a}*${b} = ${a*b}")

    if(b<a){
        println("${a} supérieur ${b}")
    }else if(b==a){
        println("${b} = ${a}")
    } else{
        println("${b} supérieur ${a}")
    }

    if((a+b)%2==0){
        println(" la somme de ${a}+${b} est paire")
    }else{
        println(" la somme de ${a}+${b} est impaire")
    }


}


fun main(){

    println("entrer deux nombre")

    var nbr1:Int = readln()!!.toInt()
    var nbr2:Int = readln()!!.toInt()

    try {
        resultats(nbr1,nbr2)

    }catch ( e:Exception){
        println(e)
    }

}