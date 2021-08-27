import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {

    runBlocking {
        launch {
            delay(100)
            println("Coroutines")
        }
        println("Hi ")
        delay(300)
    }
    println("hello")
}