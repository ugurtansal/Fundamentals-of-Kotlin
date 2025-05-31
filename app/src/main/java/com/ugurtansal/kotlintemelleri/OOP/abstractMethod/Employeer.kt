package com.ugurtansal.kotlintemelleri.OOP.abstractMethod

abstract class Employeer {

    abstract fun work()

    open fun takeVacation() {
        println("Taking vacation")
    }

    fun getSalary(): Int {
        return 5000
    }
}