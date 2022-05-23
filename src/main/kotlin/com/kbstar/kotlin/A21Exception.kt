package com.kbstar.kotlin

fun main() {
    var a = 6
    var b = 0
    var result : Int

    try {
        result = a / b
        println("result = $result")
    } catch (e: java.lang.Exception) {
        println("Exception : ${e.message}")
    } finally {
        println("Finally..")
    }

    // Throw
    try {
        divide()
    } catch (e:java.lang.Exception) {
        println("예외 발생 : ${e.message}")
    }
}

fun divide() {
    var x = 3
    var y = 0

    if(y == 0) {
        throw java.lang.Exception("zero Operation!!!")
    }
}