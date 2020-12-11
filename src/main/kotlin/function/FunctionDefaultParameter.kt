package function

fun main() {
    hello("Taufik")
    hello("Taufik", "Hidayat")
}

//Function with nullable variable and default parameter
fun hello(firstName: String, lastName: String? = null) {
    if (lastName == null) {
        println("Hello, $firstName")
    } else {
        println("Hello, $firstName $lastName")
    }
}