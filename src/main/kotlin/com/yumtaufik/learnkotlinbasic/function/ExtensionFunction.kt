package com.yumtaufik.learnkotlinbasic.function

fun main() {
    val name = "Taufik"
    println(name.hello())

    name.printHello()

    "Hidayat".printHello()
}

//$this means to access data of com.yumtaufik.learnkotlinbasic.function. This method returns String type
fun String.hello():String = "Hello, $this"

//$this means to access data of com.yumtaufik.learnkotlinbasic.function. This method doesn't returns any return type
fun String.printHello(): Unit = println("Hello, $this")