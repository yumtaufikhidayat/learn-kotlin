package com.yumtaufik.learnkotlinbasic.function

fun main() {

    /**
     * Make some variables and convert to lambda expression
     * The variable that converted as lambda expression will be using as parameter
    */
    val toUpperCase = {value: String -> value.toUpperCase()}
    val toLowerCase = {value: String -> value.toLowerCase()}

    println(hello("Taufik", toUpperCase))
    println(hello("Taufik", toLowerCase))

    /**
     * Trailing lambda
     * It makes easy to read
     * But it must be placed at the end where lambda expression placed
    */
    val result1 = hello("Taufik") { value: String ->
        value.toUpperCase()
    }

    val result2 = hello("Hidayat") { value: String ->
        value.toLowerCase()
    }

    val result3 = hello("Taufik Hidayat") {
        it.toUpperCase()
    }

    val result4 = hello("Hidayat Taufik") {
        it.toLowerCase()
    }

    println(result1)
    println(result2)
    println(result3)
    println(result4)
}

/**
 * This method will convert lambda expression as parameter
 * Lambda expression not only as function, but also as parameter
 */
fun hello(name: String, transformer: (String) -> String): String {
    return "Hello, ${transformer(name)}"
}