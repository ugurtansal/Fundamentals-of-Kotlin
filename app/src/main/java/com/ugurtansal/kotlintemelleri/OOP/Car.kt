package com.ugurtansal.kotlintemelleri.OOP

data class Car(val brand: String, var model: String, val year: Int) {
    //If a property is declared as `val`, it means it is immutable (read-only) and cannot be changed after initialization.
    //If a property is declared as `var`, it means it is mutable and can be changed after initialization.
    //Data classes parameters must be declared as `val` or `var` to be used in the primary constructor.
    //But in clasess, can be declared without `val` or `var` in the primary constructor. But in that case, they are not properties of the class, they are just parameters of the constructor.
                    //we only can use in initializer block or in methods of the class.


    //Eğer parametreyi val olarak tanımlarsak , bu read-only olur ve sonradan değiştirilemez.
    //Eğer parametreyi var olarak tanımlarsak, bu mutable olur ve sonradan değiştirilebilir.
    //Data classlarda parametreler val veya var olarak tanımlanmalıdır. Aksi takdirde hata alırız.
    //Ama normal classlarda, parametreleri val veya var olarak tanımlamadan da tanımlayabiliriz. Ama bu durumda, bu parametreler classın özellikleri olmaz, sadece constructorın parametreleri olur.
                             //Ama bu durumda, sadece initializer blockta veya classın metodlarında kullanabiliriz.

    init{
        println("Car object created: $brand $model, Year: $year")
        start()
    }

    fun getCarInfo(): String {
        return "Brand: $brand, Model: $model, Year: $year"
    }

    fun start() {
        println("The car is starting.")
    }

    fun stop() {
        println("The car is stopping.")
    }
}
