package com.ugurtansal.kotlintemelleri.Extension

fun main() {
//    Extension, Kotlin’de bir sınıfa sonradan yeni bir özellik veya fonksiyon eklememizi sağlar, ama o sınıfın asıl tanımına dokunmadan.
//
//    Yani mevcut bir sınıfı yeniden yazmadan ona yeni yetenekler kazandırabilirsin.

//    infix, bir fonksiyonu noktasız ve parantezsiz şekilde çağırmamıza olanak sağlar.
//    Fakat bu fonksiyonun infix olarak tanımlanmış olması gerekir. Ayrıca sadece bir parametre alabilir.



    println(5.mult(2)) // Extension Function Kullanımı

    var ahmet= Person("Ahmet");

    ahmet says "Merhaba" //Infıx Function Kullanımı

    ahmet goodbye "Güle güle" // Infix Function Kullanımı

    5 double 2 // Infix Function Kullanımı





}

fun Int.mult(sayi: Int): Int {
    return this * sayi
}

infix fun Person.goodbye(message: String) {
    println("$name says: $message")
}

infix fun Int.double(sayi: Int): Int {
    return this * sayi
}