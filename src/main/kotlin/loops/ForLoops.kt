package loops

fun main() {

    //For loop using Array
    val arrayOfName = arrayOf("Daya", "Pangestu", "Taufik", "Hidayat", "Aulia", "Rifqi", "Nurahman")
    var totalLooping = 0

    for (name in arrayOfName) {
        println(name)
        totalLooping++
    }
    println("Total perulangan: $totalLooping")

    //For loop using range incrementally
    //Basic
    for (value in 0..100) {
        println("ValueInc: $value")
    }

    //Using step
    for (value in 0..100 step 5) {
        println("ValueIncStep: $value")
    }

    //For loop using range decremental
    //Basic
    for (value in 1000 downTo 0) {
        println("ValueDec: $value")
    }

    //Using step
    for (value in 1000 downTo 0 step 5) {
        println("ValueDecStep: $value")
    }
}