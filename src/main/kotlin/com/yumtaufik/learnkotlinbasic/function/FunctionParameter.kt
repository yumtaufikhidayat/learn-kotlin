package com.yumtaufik.learnkotlinbasic.function

fun main() {
    sayHello("Eko", null)
    sayHello("Taufik", "Hidayat")
    sayHello("Rizki", null)
    sayHello("Aldo", "Bimantara")
    helloName("Taufik Hidayat", 17)
}

//Function with parameter
fun sayHello(firstName: String, lastName: String?) {
    if (lastName == null) {
        println("Hello $firstName")
    } else {
        println("Hello $firstName $lastName")
    }
}

fun helloName(name: String, age: Int) {
    println("Hello $name, my age is $age")
}