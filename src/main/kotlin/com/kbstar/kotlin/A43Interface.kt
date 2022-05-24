package com.kbstar.kotlin

// Kotlin Interface : 일반 메소드가 포함된다.
//      자바에서는 모든 메소드가 abstract 인게 Interface인데, 코틀린에서는 보통 abstract와 다를 바 없음

interface Pet {     // 인터페이스가 원래 상속 목적이라, 'Open' 키워드는 생략 가능
    var category : String
    fun feed()      // 꼭 구현해야하는 abstract method
    fun eat() {     // 일반 메소드
        println("Pet -> eat()")
    }
}

class Cat(override var category: String) : Pet {
    override fun feed() {
        println("Cat -> feed()")
    }
}

fun main() {
    var obj = Cat("tiger")
    println("obj category = ${obj.category}")
    obj.feed()  // implemented method
    obj.eat()   // 일반 메소드
}