package com.ugurtansal.kotlintemelleri.degiskenler

fun main() {

    //Var ile tanımlanan değişkenlerin değerleri değiştirilebilir
    //Val ile tanımlanan değişkenlerin değerleri değiştirilemez

    var id=1
    var name="Mont"
    var picture="https://example.com/mont.jpg"
    var rate=4.5
    var price=99.99
    var isStore=true

    println("Id: $id")


    //Constants-Sabit Değişkenler

    var number=50
    number=30

    val number2=50
    //number2=30 => hata verir


    //Tür dönüşümleri
    //1-Sayısaldan sayısala dönüşüm

    val d=89.56
    val f=d.toInt()
    println(f) //Sonuç: 89 => Riskli dönüşüm , veri kaybı olabilir

    //2-Sayısaldan metine dönüşüm
    var x=85
    var y=x.toString()
    println(y) //Sonuç: 85


    //3-Metinden sayıya dönüşüm
    var z="85A"
    //var t1=z.toInt() // =>Hata alırsınız

    //Hata almamak için şunu kullanmalıyız , double vb diğerleri için de geçerli
    var t2=z.toIntOrNull()
    if (t2==null){
        println("Dönüşüm yapılamadı")
    }else{
        println("Dönüşüm başarılı")
    }
    println(t2) //Sonuç: 85

}