package com.kbstar.kotlin

// Alias : 이름에 nickname 짓겠다.(as) -- DB와 비슷함
import com.kbstar.kotlin.A02Car as Car

fun main() {
    val taxi = Car("alias taxi", 1)  // A02Car 대신 Car
    var bus = Car("alias bus", 2)
    val truck = com.kbstar.kotlin.A02Car("truck", 3)    // package 원래 쓰는 원칙

    print("taxi.name = ${taxi.name}")

    /*
        C : ip 주소 1.2.3.4
        unsigned int serverIP = 12345

        IP serverIP = 1233
        IP clientIP = 223343

        typedef unsigned int IP_t
     */
}