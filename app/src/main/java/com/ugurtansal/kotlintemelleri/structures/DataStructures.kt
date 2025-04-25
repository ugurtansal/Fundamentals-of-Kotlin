package com.ugurtansal.kotlintemelleri.structures

fun main() {
    //Diziler
    //Eğer farklı yapıları barındırmak istersek veya sadece string ifadeleri saklamak istersek arrayOf()

    val firstArray= arrayOf("Fstih",23, 23.5, true);

    println(firstArray.last());
    println(firstArray.first())

    //Eğer sadece tek bir türü saklamak istiyorsak tür ismini yazmalıyız

    val  intArrar= intArrayOf(1,2,3,4,5);


    //ArrayList

    val arrList=arrayListOf("Ali", 2, "Ayşe", "Fatma");

    arrList.add("Mehmet");
    arrList.get(2);
    arrList.add(3, "Zeynep");
    arrList.removeAt(2);
    arrList[0]="Ahmet";

    val numArrList=arrayListOf<Int>(1,2,3,4,5);
    val stringArrList=arrayListOf<String>("Ali", "Veli", "Ayşe");

    val emptyMixArrList= arrayListOf<Any>();


    //Set
    //Set, tekrarlı elemanları barındırmaz. Tekrar eden elemanları siler.İndex yoktur.

    var exSet= setOf(1,1,2,"str",3.5, true, 1);
    println(exSet.size); // 5
    println(exSet.contains(1)); // true

    println(exSet.contains(4)); // false
    println(exSet.elementAt(0)); // 1

    exSet.forEach{
        println(it);
    }

    //Normal Set içerisinde değişiklik yapamayız.
    val ex2Set=HashSet<Int>();
    ex2Set.add(1);
    ex2Set.add(2);
    ex2Set.add(3);
    ex2Set.add(4);
    ex2Set.add(5);

    ex2Set.remove(3);
    ex2Set.forEach{
        println(it);
    }

    //Seti Hashset e çevirmek
    exSet= exSet.toHashSet();


    //Map
    //Key-Value şeklinde veri saklar. Key'ler benzersizdir. Value'ler tekrar edebilir.
    //Map içerisinde değişiklik yapabiliriz.

    val exMap= mapOf(1 to "Ali", 2 to "Ayşe", 3 to "Fatma", 4 to "Mehmet");

    val yemekKaloriMap=HashMap<String, Int>();
    yemekKaloriMap.put("Elma", 52);
    yemekKaloriMap.put("Muz", 96);
    yemekKaloriMap.put("Portakal", 47);
    println(yemekKaloriMap.get("Muz"));
    println(yemekKaloriMap.get("Elma"));

    yemekKaloriMap.put("Elma", 90); //Değer güncellenir




}