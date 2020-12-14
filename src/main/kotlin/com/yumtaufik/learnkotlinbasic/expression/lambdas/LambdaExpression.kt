package com.yumtaufik.learnkotlinbasic.expression.lambdas

fun main() {

    //With lambda, we are not required to type return as return type
    //The lambda's body is automatically convert as return

    //Variable with lambda com.yumtaufik.learnkotlinbasic.expression using two parameters
    //(String, String) -> They are two as input but also parameters with String data type.
    //String -> It is return as String type
    val contohLambda: (String, String) -> String = { firstName: String, lastName: String ->
        val result = "Hello $firstName $lastName" //This body is converted automatically as return
        result
    }

    println(contohLambda("Taufik", "Hidayat"))

    //variable with lambda com.yumtaufik.learnkotlinbasic.expression using it as single parameter
    val sayHelloIt: (String) -> String = {
        "Hello, $it"
    }

    println(sayHelloIt("Taufik"))

    //Or we can use lambda com.yumtaufik.learnkotlinbasic.expression without using it but using parameter name
    val sayHello: (String) -> String = {value: String ->
        "Hello, $value"
    }

    println(sayHello("Hidayat"))

    //Making lambda com.yumtaufik.learnkotlinbasic.expression from existing com.yumtaufik.learnkotlinbasic.function was called as method reference
    val toUpperCase: (String) -> String = ::toUpper
    println(toUpperCase("Taufik Hidayat"))
}

fun toUpper(value: String): String = value.toUpperCase()