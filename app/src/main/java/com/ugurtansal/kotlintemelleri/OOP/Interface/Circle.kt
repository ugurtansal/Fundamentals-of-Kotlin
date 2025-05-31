package com.ugurtansal.kotlintemelleri.OOP.Interface

class Circle: Shape {
    override fun area(): Double {
        return 3.0
    }

    override fun perimeter(): Double {
       return 2.0
    }

    //We can not override display method , but we can use it



}