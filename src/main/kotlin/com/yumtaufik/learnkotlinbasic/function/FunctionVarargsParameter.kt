package com.yumtaufik.learnkotlinbasic.function

fun main() {

    //Data for hitungTotal com.yumtaufik.learnkotlinbasic.function
    val values = arrayOf(10, 10, 10, 10)
    val result = hitungTotal(values)
    println("Hasilnya adalah $result")

    //Data for hitungTotalVarargs com.yumtaufik.learnkotlinbasic.function
    val resultVarArgs = hitungTotalVarargs("Taufik", 10, 10, 10, 10, 10, 10)
    println("Hasil varargs-nya adalah $resultVarArgs")

    //Data for hitungTotalVarargs com.yumtaufik.learnkotlinbasic.function with empty input for varargs
    val resultEmptyVarArgs = hitungTotalVarargs("Taufik")
    println("Hasil empty varargs-nya adalah $resultEmptyVarArgs")
}

//Common com.yumtaufik.learnkotlinbasic.function with array as parameter and Int as return type
fun hitungTotal(values: Array<Int>): Int {

    var total = 0

    for (value in values) {
        total += value
    }

    return total
}

//Function with vararg as parameter
//Vararg must be placed in last parameter, neither in first parameter nor in middle parameter
//If using vararg, it would be converted to array automatically
//We can also use an empty input for vararg parameter
fun hitungTotalVarargs(name: String, vararg values: Int): Int {

    var total = 0

    for (value in values) {
        total += value
    }

    return total
}