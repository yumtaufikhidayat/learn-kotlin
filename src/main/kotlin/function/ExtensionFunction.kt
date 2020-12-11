package function

fun main() {
    val name = "Taufik"
    println(name.hello())

    name.printHello()

    "Hidayat".printHello()
}

//$this means to access data of function. It returns String type
fun String.hello():String = "Hello, $this"

//$this means to access data of function. It doesn't returns any return type
fun String.printHello(): Unit = println("Hello, $this")