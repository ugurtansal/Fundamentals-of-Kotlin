package com.ugurtansal.kotlintemelleri.employeeTask

fun main() {
    val employee1 = Employee("John Doe", 32, 50000.0, "Software")
    val employee2 = Employee("Jane Smith", 28, 60000.0, "Marketing")
    val employee3 = Employee("Alice Johnson", 35, 70000.0, "HR")
    val employee4 = Employee("Bob Brown", 22, 45000.0, "Finance")
    val employee5 = Employee("Eve Green", 31, 65000.0, "Sales")
    val employee6 = Employee("Charlie Black", 35, 55000.0, "Software")
    val employee7 = Employee("Diana White", 27, 62000.0, "Marketing")
    val employee8 = Employee("Frank Blue", 33, 72000.0, "HR")
    val employee9 = Employee("Grace Yellow", 24, 48000.0, "Finance")
    val employee10 = Employee("Hank Red", 26, 53000.0, "Sales")


    val employees = listOf(employee1, employee2, employee3, employee4, employee5,
        employee6, employee7, employee8, employee9, employee10)

    val listOfSoftwareEmployeesGreterThan30 = employees.filter { it.departmant == "Software" && it.age > 30 }.also {
        it.forEach {
            println(it.getSalary());
        }
    }

    val nameOfSmallerThan25=employees.filter { it.age<25 }.map { it.name }


    nameOfSmallerThan25.forEach{
        println(it);
    }

}