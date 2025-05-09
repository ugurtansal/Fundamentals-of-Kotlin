package com.ugurtansal.kotlintemelleri.functionalProgramming

fun main() {
    //Lambda Expressions

    val multiplyLambda = { a: Int, b: Int -> a * b }
    val result = multiplyLambda(5, 10)

    val secondMultiply: (Int, Int) -> Int = { a, b -> a * b };
    val result2 = secondMultiply(5, 10)


    println("Higher Order Function --------------------------------")

    //Filter
    val myList=arrayListOf(1,3,5,7,9,11,13,15,17,19);

    val smallerTen= myList.filter { it<10 };

    //Second way
    //val smallerTen2=myList.filter { number-> number<10 };


    //Map
    val powList= myList.map { it*it };
    //Second way
    //val powList2=myList.map { number-> number*number };


    //Filter and Map
    val filterAndMap= myList.filter { it<10 }.map { it*it }; //Firstly filter the numbers which smaller than 10 then map
    filterAndMap.forEach{
        println(it);
    }

    //Filter and Map in class
    val artists= arrayListOf<Artist>(
        Artist("Ali", 25, "Guitar"),
        Artist("Veli", 35, "Piano"),
        Artist("Ayşe", 22, "Drums"),
        Artist("Fatma", 28, "Violin")
    )


    val insturmentOfGreatedThan30= artists.filter { it.age>30 }.map { it.instrument };

    insturmentOfGreatedThan30.forEach{
        println(it);
    }

    val nameOfSmallerThan32=artists.filter { it.age<32 }.map { it.name }

    nameOfSmallerThan32.forEach{
        println(it);
    }


    //Scope functions
    //let
    val myInt: Int? = null
    myInt?.let { //Eğer null değilse çalışır
        println("The value is $it")
    }

    val myInt2=myInt?.let {
        it*2
    } ?: 0 //Eğer null ise 0 döner

    //also =>Artı olarak şunu da yap

    artists.filter { it.age<30 }.also {
        it.forEach{
            println(it.name);
        }
    }




}