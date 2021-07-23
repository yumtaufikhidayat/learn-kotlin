package com.yumtaufik.learnkotlinbasic.function

fun main() {

    //Call function with random parameter
    fullName(
        lastName = "Khannedy",
        firstName = "Eko",
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