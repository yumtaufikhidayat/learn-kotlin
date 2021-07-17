package com.yumtaufik.learnkotlinbasic.loops

fun main() {

    //Break
    var i = 0

    while (true) {
        println("Perulangan ke: $i")
        i++

        if (i > 10) {
            println("Perulangan berhenti")
            break
        }
    }

    //Continue
    for (j in 1..1000) {
        if (j % 2 == 0) {
            continue
        }

        println("Nilai j saat ini adalah $j")
    }
}