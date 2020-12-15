package com.yumtaufik.learnkotlinbasic.expression.returns

fun main() {

    //This function using return if
    fun sayHelloIf(name: String = ""): String {
        return if (name == "") {
            "Hello bro!"
        } else {
            "Hi, $name"
        }
    }

    println(sayHelloIf())
    println(sayHelloIf("Taufik"))

    //This function using return when
    fun sayHelloWhen(name: String = ""): String {
        return when (name) {
            ""-> "Hello bro!"
            else -> "Hi, $name"
        }
    }

    println(sayHelloWhen())
    println(sayHelloWhen("Hidayat"))
}