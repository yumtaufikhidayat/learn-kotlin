package datatype.array

fun main() {

    //Array
    //Only for same data type
    val stringName: Array<String> = arrayOf("Taufik", "Hidayat")
    val intNumber: Array<Int> = arrayOf(1, 2, 3)

    //Print by index
    println(stringName[0])
    println(intNumber[2])

    //Change data by index
    stringName[1] = "H"
    intNumber[2] = 7

    //Print by last changed value of index
    println(stringName[1])
    println(intNumber[2])

    //Nullable array
    val name: Array<String?> = arrayOfNulls(5)
    name.set(0, "Taufik")
    name.set(1, null)
    name.set(2, "Hidayat")
    name.set(3, null)
    name.set(4, null)

    //For nullable array
    println(name[0])
    println(name[1])
    println(name[2])
    println(name[3])
    println(name[4])

}