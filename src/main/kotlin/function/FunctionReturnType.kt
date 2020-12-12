package function

fun main() {
    sum(2,4)
    divided(5.0, 0.0)
    divided(4.0, 7.0)
}

fun sum(firstNumb: Int, secondNumb: Int): Int {

    val sumResult = firstNumb + secondNumb
    println("Nilai penjumlahan adalah: $sumResult")
    return sumResult
}

fun divided(firstNumb: Double, secondNumb: Double): Double {

    if (secondNumb == 0.0) {
        return 0.0
    } else {
        val dividedResult = firstNumb / secondNumb
        println("Nilai pembagian adalah: $dividedResult")
        return dividedResult
    }
}