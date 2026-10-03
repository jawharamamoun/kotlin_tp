import javax.print.DocFlavor

fun main(){
    val pay1 =   CashPayment(20023.0)
    val pay2 = CardPayment(9010.0,"15412654546545685")
    val pay3 = DigitalPayment(200.0,"1654546545685")

    pay(pay1)
    println("------------------")
    pay(pay2)
    println("--------------------")
    pay(pay3)
}

sealed class Payment
class CashPayment(val amount: Double):Payment()
class CardPayment(val amount: Double,var cardnumber:String):Payment()
class DigitalPayment(val amount: Double,var cardnumber:String):Payment()

fun pay(p: Payment){
    when (p){
        is CashPayment -> {
            println("Payment is CashPayment")
            println("amount ${p.amount}")
        }
        is CardPayment -> {
            println("Payment is CardPayment")
            println("amount ${p.amount}")
            println("cardnumber ${p.cardnumber}")
        }
        is DigitalPayment -> {
            println("Payment is DigitalPayment")
            println("amount ${p.amount}")
            println("cardnumber ${p.cardnumber}")
        }
    }
}
