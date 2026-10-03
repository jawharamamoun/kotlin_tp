class DatabaseConnection{
    fun connect(){
        println("Connecting...")
    }
}
class DatabaseManager{
    lateinit var  connection : DatabaseConnection

    fun connecter(){
        connection = DatabaseConnection()
    }
    fun etat(){

        fun etat() {
            if (::connection.isInitialized) {
                connection.connect()
            } else {
                println("Connection not initialized")
            }
        }
    }
}

fun main(){
    val manager = DatabaseManager()

    manager.etat()
}