fun main() {
    val car = Car()
    val bike = Bike()

    car.start()
    car.stop()

    bike.start()
    bike.stop()
}

interface Vehicle {
    fun start()
    fun stop()
}

class Car : Vehicle {

    override fun start() {
        println("Car starting")
    }

    override fun stop() {
        println("Car stopping")
    }
}

class Bike : Vehicle {

    override fun start() {
        println("Bike starting")
    }

    override fun stop() {
        println("Bike stopping")
    }
}