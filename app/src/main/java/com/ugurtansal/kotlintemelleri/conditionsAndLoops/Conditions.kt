package com.ugurtansal.kotlintemelleri.conditionsAndLoops

fun main() {
    // If
    val a = 5
    val b = 10

    if (a > b) {
        println("a is greater than b")
    } else if (a < b) {
        println("a is less than b")
    } else {
        println("a is equal to b")
    }

    // When
    val x = 2

    when (x) {
        1 -> println("x is 1")
        2 -> println("x is 2")
        3 -> println("x is 3")
        else -> println("x is not 1, 2, or 3")
    }

    // When with ranges
    val y = 15

    when (y) {
        in 1..10 -> println("y is between 1 and 10")
        in 11..20 -> println("y is between 11 and 20")
        else -> println("y is not in the range")
    }


    when(y){
        1, 2, 3 -> println("y is 1, 2 or 3")
        in 4..10 -> println("y is between 4 and 10")
        25 -> println("y is 25")
        !in 11..20 -> println("y is not in the range of 11 to 20")
        else -> println("y is something else")

    }

    val number=1;

    when(number){
        1-> {
            print("One")
            println("Another line for One")
        }
        2-> println("Two")
        else-> println("Unknown")
    }
}