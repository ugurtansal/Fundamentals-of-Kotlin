package com.ugurtansal.kotlintemelleri.employeeTask

data class Employee (val name: String, var age: Int, private val salary: Double, val departmant: String) {

        fun getSalary(): Double {
            return salary
        }
}