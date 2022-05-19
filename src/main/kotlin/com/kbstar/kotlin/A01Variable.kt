package com.kbstar.kotlin

import java.lang.Math.PI
import java.lang.Math.abs

fun main() {
    val intro : String = "Hello";        // Java : final String intro = "Hello";
    val age : Int = 12

    // intro = Hello, age = 12
    println("intro = ${intro}, age = ${age}")
    println("intro = " + intro + ", age" + age)

    println(PI)
    println(abs(-1.234))

    val taxi = A02Car("taxi", 3);   // Java : Car taxi = new Car("taxi", 3);
    println(taxi.name)
    println(taxi.color)

    // taxi.name = taxi
    println("taxi.name = ${taxi.name}")
//    taxi = A02Car("new taxi", 1)              // val 재정의 불가

    var bus = A02Car("bus", 1)
    bus = A02Car("new bus", 7)

    var truck : A02Car = A02Car("truck", 4) // 이게 원래 원칙 : type = A02Car 니까! (안쓰면 알아서 추정한거고)
}