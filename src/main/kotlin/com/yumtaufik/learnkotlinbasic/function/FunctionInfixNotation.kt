package com.yumtaufik.learnkotlinbasic.function

fun main() {

    //Access infix function wihout . (dot) mark
    val result = "Taufik" to "UP"
    println(result)

    //Access infix function using . (dot) mark
    val result2 = "Taufik".to("LOW")
    println(result2)
}

/**
 * This infix function must be using one parameter, neither empty or more than one
 * If we want to access this function, it is not required to use . (dot) mark
 */
infix fun String.to(type: String): String {
    if (type == "UP") {
        return this.toUpperCase()
    } else {
        return this.toLowerCase()
    }
}