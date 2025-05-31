package com.ugurtansal.kotlintemelleri.Extension

class Person(val name: String) {

    fun greet() {
        println("Hello, my name is $name")
    }

    infix fun says(message: String) {
        println("$name says: $message")
    }
}