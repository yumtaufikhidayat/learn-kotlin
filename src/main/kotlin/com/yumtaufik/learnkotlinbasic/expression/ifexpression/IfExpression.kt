package com.yumtaufik.learnkotlinbasic.expression.ifexpression

fun main() {

    //If com.yumtaufik.learnkotlinbasic.expression
    val value = 80

    if (value > 75) {
        println("Good job!")
    }

    //If Else com.yumtaufik.learnkotlinbasic.expression
    if (value > 85) {
        println("Good Job!")
    } else {
        println("Try again next year")
    }

    //Else If com.yumtaufik.learnkotlinbasic.expression
    if (value > 85) {
        println("Good Job!")
    } else if (value > 75) {
        println("Not bad")
    } else {
        println("Try again next year")
    }
}