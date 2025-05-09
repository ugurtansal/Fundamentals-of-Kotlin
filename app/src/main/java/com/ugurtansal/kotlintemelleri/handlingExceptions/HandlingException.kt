package com.ugurtansal.kotlintemelleri.handlingExceptions

fun main() {

    // Try-Catch
    try {
        val result = 10 / 0
        println("Result: $result")
    } catch (e: ArithmeticException) { //We can write e:Exception as well
        println("Error: ${e.message}")
    } finally {
        println("This block always executes.")
    }

    // Throwing an exception
    fun checkAge(age: Int) {
        if (age < 18) {
            throw IllegalArgumentException("Age must be at least 18.")
        }
    }

    try {
        checkAge(15)
    } catch (e: IllegalArgumentException) {
        println("Caught exception: ${e.message}")
    }
}