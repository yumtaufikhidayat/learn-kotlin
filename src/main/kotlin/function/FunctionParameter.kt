package function

fun main() {
    sayHello("Eko", null)
    sayHello("Taufik", "Hidayat")
    sayHello("Rizki", null)
    sayHello("Aldo", "Bimantara")
}

//Function with parameter
fun sayHello(firstName: String, lastName: String?) {
    if (lastName == null) {
        println("Hello $firstName")
    } else {
        println("Hello $firstName $lastName")
    }
}