package function

fun main() {

    fun contohHelloWorld() {
        println("Hello World")
    }

    //The contohHelloWorld function can accessed from inner main function
    contohHelloWorld()
}

fun satu() {

    //It will gives an error because contohHelloWorld function is private function
    //It can be accessed only by main function
//    contohHelloWorld()
}

fun dua() {

    //It will gives an error because contohHelloWorld function is private function
    //It can be accessed only by main function
//    contohHelloWorld()
}