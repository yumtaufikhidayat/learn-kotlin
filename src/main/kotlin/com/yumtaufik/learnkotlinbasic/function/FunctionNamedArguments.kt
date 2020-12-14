package com.yumtaufik.learnkotlinbasic.function

fun main() {

    //Call com.yumtaufik.learnkotlinbasic.function with random parameter
    fullName(
        firstName = "Eko",
        lastName = "Khannedy",
        middleName = "Kurniawan"
    )
}

fun fullName(
    firstName: String,
    middleName: String,
    lastName: String
) {
    println("Hello, $firstName $middleName $lastName")
}