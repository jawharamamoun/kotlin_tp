fun main(){
    var res1 = Success("jawhara","Success")
    var res2 = Failure("reda","Failure")
    var res3 = Loading("habiba","Loading")

    printresult(res1)
    printresult(res2)
    printresult(res3)

}
sealed class OperationResult
class Success(var data: String,var errorMessage: String): OperationResult()
class Failure(var data: String,var errorMessage: String) : OperationResult()
class Loading(var data: String,var errorMessage: String) : OperationResult()

fun printresult(res:OperationResult){
    when(res){
        is Loading -> {
            println("Loading...")
            println(res.data)

        }
        is Success -> {
            println("Success")
        }
        is Failure -> {
            println("Failure")
        }
    }
}