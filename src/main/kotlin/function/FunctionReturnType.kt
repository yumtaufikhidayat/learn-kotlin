package function

fun main() {
    sum(2,4)
    divided(5.0, 0.0)
    divided(4.0, 7.0)
}

fun sum(firstNumb: Int, secondNumb: Int): Int {

    val total = firstNumb + secondNumb
    println("Nilai total adalah: $total")
    return total
}

fun divided(firstNumb: Double, secondNumb: Double): Double {

    return if (secondNumb == 0.0) {
        0.0
    } else {
        val result = firstNumb / secondNumb
        println("Hasilnya adalah: $result")
        result
    }
}