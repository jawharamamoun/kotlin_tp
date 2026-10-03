class Configuration{
    fun simulation(){
        println("configuration is running...")
    }
}
class App{
    val config by lazy {
        println("configuration loading")
        Configuration()
    }
}

fun main(){
    var app = App()
    app.config.simulation()
}
