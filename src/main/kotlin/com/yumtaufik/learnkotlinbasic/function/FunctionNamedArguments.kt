package com.yumtaufik.learnkotlinbasic.function

fun main() {

    //Call function with random parameter
    fullName(
        lastName = "Khannedy",
        firstName = "Eko",
        middleName = null
    )
}

fun fullName(
    firstName: String,
    middleName: String?,
    lastName: String
) {
    when (middleName) {
        null -> {
            println("Hello, $firstName $lastName")
        }
        else -> {
            println("Hello, $firstName $middleName $lastName")
        }
    }
}