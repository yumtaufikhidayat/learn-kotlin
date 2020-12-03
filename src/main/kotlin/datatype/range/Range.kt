package datatype.range

fun main() {

    //Range
    val range = 1..1000

    //For range
    println(range)

    //Print kinds of range method
    println(range.count()) //Getting total data in range
    println(range.contains(50)) //Checking any of the that value, eg: 50? answer is return true or false value
    println(range.first) //Getting first value
    println(range.last) //Getting last value
    println(range.step) //Getting value of each step

    //Range down
    val rangeDownToN = 100 downTo 1 step 2

    //Print range down to N
    println(rangeDownToN.count()) //Getting total data in range
    println(rangeDownToN.contains(50)) //Checking any of the that value, eg: 50? answer is return true or false value
    println(rangeDownToN.first) //Getting first value
    println(rangeDownToN.last) //Getting last value
    println(rangeDownToN.step) //Getting value of each step
}