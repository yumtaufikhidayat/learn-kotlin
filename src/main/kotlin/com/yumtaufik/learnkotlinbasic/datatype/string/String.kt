package com.yumtaufik.learnkotlinbasic.datatype.string

import java.util.*

fun main() {

    //String with quotation mark
    var firstName: String = "Taufik"
    var lastName: String = "Hidayat"
    var fullName: String = "Taufik Hidayat"

    //For quotation mark
    println(firstName)
    println(lastName)
    println(fullName)

    //String with triple quotation mark for more than one line
    var address1: String = """
        Jakarta Pusat,
        DKI Jakarta,
        Indonesia
    """

    //For triple quotation mark
    print("Your address: $address1")

    /**
     * String with triple quotation mark using trim margin
     * "|" this called is pipe mark (READ: pipe mark)
    */
    var address2: String = """
        |Jakarta Pusat,
        |DKI Jakarta,
        |Indonesia
    """.trimMargin()

    //Print using pipe mark
    println(address2)

    /**
     * String with triple quotation mark using trim margin
     * ">" this called is more than mark
     */
    var address3: String = """
        >Jakarta Pusat,
        >DKI Jakarta,
        >Indonesia
    """.trimMargin(">")

    //Print using more than mark
    println(address3)

    //String with triple quotation mark using trim indent
    var address4: String = """
        Jakarta Pusat,
        DKI Jakarta,
        Indonesia
    """.trimIndent()

    //Print using more than mark
    println("Alamat 4: $address4")

    //Merge strings
    var fullNames:String = "Nama lengkap: $firstName $lastName"
    println(fullNames)

    //Strings with complex String Template
    var charOfFullName = "Total char pada $fullName adalah ${fullName.length} char"
    println(charOfFullName)

    //In Java for Strings Template
    var myName = firstName
    println(String.format(Locale.getDefault(), "%s", myName.length))
}