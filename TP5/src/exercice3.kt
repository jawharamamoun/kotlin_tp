fun main(){
    val users = listOf(
        User(1, "Ahmed", "ahmed@gmail.com"),
        User(2, "Sara", "sara@hotmail.com"),
        User(3, "Youssef", "youssef@gmail.com"),
        User(4, "Fatima", "fatima@hotmail.com"),
        User(5, "Omar", "omar@gml.com")
    )

    filter(users)

    println(filter(users))

}
data class User(var id:Int,var name:String,var email:String)



fun filter(user:List<User>):List<String>{
    return user.filter{"@gmail.com" in it.email}.map{it.name}
    

}