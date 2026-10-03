var check = fun (x:Int): Boolean{
    if (x%2==0){
        return true
    }else{
        return false
    }
}
fun main(){
    for (i in Numbers){
        if (check(i)){
            println("$i paire")
        }else{
            println("$i impaire")
        }
    }
}