package com.kbstar.kotlin

class MyBird {
    // Field(Java), Property(Kotlin)
    var name : String = "myBird"
    var wing : Int = 2
    var beak : String = "short"
    var color : String = "blue"

    // Method
    fun fly() = println("Fly wing : ${wing}")
    fun sing(vol:Int) = println("Sing volumn : ${vol}")
}

fun main() {
    var eagle = Bird()  // eagle --------- (HEAP) -----------> Object
    eagle.color = "black"
    eagle.name = "eagle"
    eagle.wing = 2

    println("eagle.name = ${eagle.name}, eagle.color = ${eagle.color}, eagle.wing = " + eagle.wing)

    eagle.fly()
    eagle.sing(4)

    // 생성자 : 초기화 메소드

}