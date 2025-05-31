package com.ugurtansal.kotlintemelleri.OOP.Interface

interface Shape {
    fun area(): Double

    fun perimeter(): Double

    fun display() {
        println("Area: ${area()}")
        println("Perimeter: ${perimeter()}")
    }
}