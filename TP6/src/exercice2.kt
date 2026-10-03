fun main(){
    var a=Addition(8.0,10.3)
    var b=Subtraction(5.0,10.5)
    var c=Division(5.0,0.0)
    var d=Multiplication(6.0,10.5)

    println(calculer(a))
    println(calculer(b))
    println(calculer(c))
    println(calculer(d))



}
sealed class Operation
class Addition(var a: Double,var b: Double): Operation()
class Subtraction(var a: Double,var b: Double): Operation()
class Multiplication(var a: Double,var b: Double): Operation()
class Division(var a: Double,var b: Double): Operation()
fun calculer(op: Operation): Double{
    when(op){
        is Addition -> return op.a + op.b
        is Multiplication -> return op.a * op.b
        is Subtraction -> return op.a - op.b
        is Division -> {
            if (op.b==0.0) { throw Exception("Erreur : Division par zéro impossible !")
            }
            else return op.a / op.b
        }
    }
}