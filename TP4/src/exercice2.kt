fun main(){
    val animal1= Dog()
    val animal2= Cat()
    animal1.makeSound()
    animal2.makeSound()
}
interface Animal{
    var name: String
    fun makeSound()
}
class Dog : Animal{
    override var name:String = "Dog"
    override fun makeSound(){
        println("$name Sound")
    }
}
class Cat : Animal{
    override var name:String = "Cat"
    override fun makeSound(){
        println("$name Sound")
    }
}
