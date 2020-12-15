package com.yumtaufik.learnkotlinbasic.function

fun main() {

    fun hello(name: String, transformer: (String) -> String): String {
        return "Hello, ${transformer(name)}"
    }

    val upper = fun(value: String): String {
        return if (value == "") {
            "UPS!"
        } else {
            value.toUpperCase()
        }
    }

    println(hello("Taufik Hidayat", upper))
    println(hello("", upper))

    //We can input anonymous function as parameter
    println(hello("Hidayat", fun(value: String): String {
        return value.toLowerCase()
    }))
}