package com.ugurtansal.kotlintemelleri.nullSafety

fun main() {
    var nameF= "John" // Non-nullable String
    // nameF = null // This will cause a compilation error because nameF is non-nullable
    var name: String? = "John" // Nullable String
   // name = null // It can be null

    val length = name?.length  // If name is not null, get its length; otherwise, length will be null

    val length2 = name?.length ?: 0 // If name is null, return 0 instead of null => Elvis operator

    val length3 = name?.length ?: throw IllegalArgumentException("Name cannot be null") // If name is null, throw an exception

    //val length4=name!!.length // If you are sure it is not null

    name?.let { //If name is not null, execute the block
        println("Name length: ${it.length}")
    }





}