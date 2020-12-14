package com.yumtaufik.learnkotlinbasic.function

fun main() {
    println("Nilai dikali dua adalah: " + multipleByTwo(4))
    println("Hello, " + greetings("Taufik"))
    hello("Taufik")
}

fun multipleByTwo(firstNumb: Int): Int = firstNumb * 2

fun greetings(name: String): String = name

fun hello(name: String): Unit = println("Hello, $name")
