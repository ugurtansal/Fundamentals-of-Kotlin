package com.ugurtansal.kotlintemelleri.OOP.Inheritance

open class Animal {
    //Miras alınan sınıflar için open anahtar kelimesi kullanılır.
    //For Inheritance, the open keyword is used in Kotlin to allow a class to be inherited from.

    //Miras alınan fonksiyonlar için de open anahtar kelimesi kullanılır.
    //For Inheritance, the open keyword is used in Kotlin to allow a function to be overridden in a subclass.
    open fun makeSound() {
        println("I have no sound!")
    }

    open fun eat() {
        println("I am eating!")
    }

    open fun sleep() {
        println("I am sleeping!")
    }

    fun info() {
        println("I am an animal.")
    }
}