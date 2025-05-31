package com.ugurtansal.kotlintemelleri.OOP.Inheritance

class Dog : Animal() {

    override fun makeSound() {
        println("Woof Woof")
    }

//    override fun info(){  //We can override methods from the parent class, because they are not open.
//        "Dog: ${super.info()}"
//    }
}