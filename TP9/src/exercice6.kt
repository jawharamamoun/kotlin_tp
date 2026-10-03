class UtilisateurService{

    fun simulation(){
        println("service avec une initialisation \n" +
                "tardive")
    }

}
class Application{
    lateinit var userService:UtilisateurService

    fun initialize(){
        userService = UtilisateurService()
    }
    fun service(){
        userService.simulation()
    }
}
fun main(){
    val app = Application()
    app.initialize()
    app.service()
}