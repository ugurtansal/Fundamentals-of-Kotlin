package com.ugurtansal.kotlintemelleri.OOP.abstractMethod

class CEO : Employeer()  {
    override fun work() {
        println("CEO is working")
    }

    override fun takeVacation() {
        println("CEO is taking vacation")
    }

//    override fun getSalary(): Int {
//        return 10000
//    }  //We can not override this method because it is final in the parent class

}