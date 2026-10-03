fun main(){
    var box1 = Box(10.3)
    var item1 = box1.Item("caree")
    item1.printDetails()


}
class Box(var size:Double){

    inner class Item(val name:String){
        fun printDetails(){
            println("Name: $name")
            println("size: $size ")
        }
    }
}