package com.ugurtansal.kotlintemelleri.conditions

fun main() {
    // For loop
    for (i in 1..5) {
        println("Iteration: $i")
    }

    for(i in 10..20 step 5){  // i+=5
        println("Step Iteration: $i")

    }

    for (i in 20 downTo 10 step 2){ // i-=2
        println("Iteration $i");
    }

    val arrInt= intArrayOf(1,5,8,789,525);

    for(i in arrInt){
        println(i);
    }

    // While loop
    var j = 1
    while (j <= 5) {
        println("While Iteration: $j")
        j++
    }

    // Do-while loop
    var k = 1
    do {
        println("Do-While Iteration: $k")
        k++
    } while (k <= 5)
}

