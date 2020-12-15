package com.yumtaufik.learnkotlinbasic.parameter

/**
 * By default, there is no output printed
 * But we can configure to print out data
 * Just access Run/Debug Configuration -> Edit Configurations -> Fill Program Arguments
 * We can input anything there as we want
*/
fun main(args: Array<String>) {
    for (value in args) {
        println(value)
    }
}