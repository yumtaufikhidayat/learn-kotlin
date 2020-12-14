package com.yumtaufik.learnkotlinbasic.function

fun main() {

    //Make some variables and convert to lambda com.yumtaufik.learnkotlinbasic.expression
    //The variable that converted as lambda com.yumtaufik.learnkotlinbasic.expression will be using as parameter
    val toUpperCase = {value:String -> value.toUpperCase()}
    val toLowerCase = {value:String -> value.toLowerCase()}

    println(hello("Taufik", toUpperCase))
    println(hello("Taufik", toLowerCase))

    //Trailing lambda
    //It makes easy to read
    //But it must be placed at the end where lambda com.yumtaufik.learnkotlinbasic.expression placed
    val result1 = hello("Taufik") {
            value:String -> value.toUpperCase()
    }

    val result2 = hello("Hidayat") {
            value:String -> value.toLowerCase()
    }

    println(result1)
    println(result2)
}

//This method will convert lambda com.yumtaufik.learnkotlinbasic.expression as parameter
//Lambda com.yumtaufik.learnkotlinbasic.expression not only as com.yumtaufik.learnkotlinbasic.function, but also as parameter
fun hello(name: String, transformer: (String) -> String): String {
    return "Hello, ${transformer(name)}"
}