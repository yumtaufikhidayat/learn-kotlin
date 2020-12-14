package function

fun main() {

    //Method to calculate n factorial using for loop
    fun factorialLoop(value: Int): Int {
        var result = 1
        for (i in value downTo 1) {
            result *= i
        }

        return result
    }

    println("Hasil factorial dengan loop: " + factorialLoop(10))

    //Method to calculate n factorial using recursive function
    fun factorialRecursive(value: Int): Int {
        return when (value) {
            1 -> 1
            else -> value * factorialRecursive(value - 1)
        }
    }

    println("Hasil factorial dengan recursive function: " + factorialRecursive(10))
}