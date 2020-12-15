package com.yumtaufik.learnkotlinbasic.operation.mathematics

fun main() {

    //Using int type
    val resultInt = 10 / 2
    println(resultInt)

    //Using double type
    val resultDouble = 10.0 / 3.0
    println(resultDouble)

    //Using scientific operator
    val result = 10 + 10 / 2
    println(result)

    //Augmented assignments
    var total = 0

    val barang1 = 100
    total += barang1

    val barang2 = 200
    total -= barang2

    val barang3 = 300
    total *= barang3

    val barang4 = 400
    total /=barang4

    println("Total: $total")

    //Unary operator
    total++ //total = total + 1
    total-- //total = total - 1
    println(total)

    val sehat = true
    println(!sehat)

}