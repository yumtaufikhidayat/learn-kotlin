package com.yumtaufik.learnkotlinbasic.expression.lambdas

/**
 * With lambda, we are not required to type return as return type
 * The lambda's end body is automatically convert as return
 */
fun main() {

    /**
     * Variable with lambda expression using two parameters
     * (String, String) -> They are two as input but also parameters with String data type.
     * String -> It is return as String type
    */
    val contohLambda: (String, String) -> String = { firstName: String, lastName: String ->
        val result = "Hello $firstName $lastName" //This body is converted automatically as return
        result
    }

    println(contohLambda("Taufik", "Hidayat"))

    val contohLambdaInt: (Int, Int) -> Int = { firstName: Int, lastName: Int ->
        val result = firstName + lastName
        result
    }

    println(contohLambdaInt(1, 2))

    //variable with lambda expression using it as single parameter
    val sayHelloIt: (String) -> String = {
        "Hello, $it"
    }

    println(sayHelloIt("Taufik"))

    //Or we can use lambda expression without using it but using parameter name
    val sayHello: (String) -> String = {value: String ->
        "Hello, $value"
    }

    println(sayHello("Hidayat"))

    val helloName:(String) -> String = {
        "Halo, $it"
    }

    println(helloName("Wafiq"))

    //Making lambda expression from existing function was called as method reference
    val toUpperCase: (String) -> String = ::toUpper
    println(toUpperCase("Taufik Hidayat"))
}

fun toUpper(value: String): String = value.toUpperCase()