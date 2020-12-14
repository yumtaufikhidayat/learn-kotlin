package com.yumtaufik.learnkotlinbasic.function

fun main() {

    fun contohHelloWorld() {
        println("Hello World")
    }

    //The contohHelloWorld com.yumtaufik.learnkotlinbasic.function can accessed from inner main com.yumtaufik.learnkotlinbasic.function
    contohHelloWorld()
}

fun satu() {

    //It will gives an error because contohHelloWorld com.yumtaufik.learnkotlinbasic.function is private com.yumtaufik.learnkotlinbasic.function
    //It can be accessed only by main com.yumtaufik.learnkotlinbasic.function
//    contohHelloWorld()
}

fun dua() {

    //It will gives an error because contohHelloWorld com.yumtaufik.learnkotlinbasic.function is private com.yumtaufik.learnkotlinbasic.function
    //It can be accessed only by main com.yumtaufik.learnkotlinbasic.function
//    contohHelloWorld()
}