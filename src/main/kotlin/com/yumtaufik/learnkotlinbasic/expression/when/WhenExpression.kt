package com.yumtaufik.learnkotlinbasic.expression.`when`

fun main() {

    //When
    val finalExam = 'A'
    when (finalExam) {
        'A' -> println("Amazing!")
        'B' -> println("Good!")
        'C' -> println("Not bad!")
        'D' -> println("Bad!")
        else -> println("Try again next year!")
    }

    //When using multiple options
    when (finalExam) {
        'A', 'B', 'C' -> println("You passed!")
        else -> println("Not passed!")
    }

    //When using In com.yumtaufik.learnkotlinbasic.expression
    val passValue = arrayOf('A', 'B', 'C')
    when (finalExam) {
        in passValue -> println("Amazing!")
        !in passValue -> println("Try again next year!")
    }

    //When using Is com.yumtaufik.learnkotlinbasic.expression
    when (finalExam) {
        is Char -> println("Final exam is Char!")
        !is Char -> println("Final exam not Char!")
    }

    //When as variable
    val nilaiLulus = 90
    when {
        nilaiLulus > 90 -> println("Great!")
        nilaiLulus > 80 -> println("Good job!")
        nilaiLulus > 70 -> println("Not bad!")
        nilaiLulus > 60 -> println("Bad!")
        else -> println("Try again next year")
    }
}