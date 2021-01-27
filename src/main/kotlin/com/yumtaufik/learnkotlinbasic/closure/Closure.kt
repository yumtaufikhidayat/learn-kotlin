package com.yumtaufik.learnkotlinbasic.closure

/**
 * The function(s)/variable(s) inside main function has access to data (any functions or variable(s))
 * within the scope. This called as Closure
 * But please be wise to use closure, because data can changed
*/
fun main() {
    var counter = 0
    val lambdaIncrement: () -> Unit = {
        println("Increment ke $counter")
        counter++
    }

    val anonymousIncrement = fun (){
        println("Anonymous function increment")
        counter++
    }

    fun increment() {
        println("Function increment")
        counter++
    }

    lambdaIncrement()
    anonymousIncrement()
    increment()
    lambdaIncrement()
    anonymousIncrement()
    increment()

    println("Data ke $counter")
}