import java.lang.Thread.sleep
import kotlin.concurrent.thread

class Car(var model:String):Runnable{

    override fun run() {
        for (i in 1..20) {
            println(" Thread  $i s")
            Thread.sleep(0)
        }
    }

}

fun main(){
    var car1 = Car("DACIA")
    var car2 = Car("FERRARI")
    var car3 = Car("GARDEN")

    val thread1 = Thread(car1)
    val thread2 = Thread(car2)
    val thread3 = Thread(car3)

    thread1.start()
    thread2.start()
    thread3.start()

    thread1.join()
    thread2.join()
    thread3.join()

    println("tread terminer")

}