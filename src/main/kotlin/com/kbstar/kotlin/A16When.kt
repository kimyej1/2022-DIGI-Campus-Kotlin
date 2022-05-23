package com.kbstar.kotlin

fun main() {
    // Number, Any -> When
    cases(1)
    cases("hello")
    cases(123L)
    cases(123)
    cases('A')
    cases(true)
    cases(2.45)

}

fun cases(obj : Any) {
    when(obj)
    {
        1 -> println("Int : ${obj}")
        "hello" -> println("String : ${obj}")
        is Long -> println("Long : ${obj}")
        is Int -> println("Int : ${obj}")
        !is String -> println("Not a String")
        is Double -> println("Double : ${obj}")
        is Float -> println("Float : ${obj}")
        is Boolean -> println("Boolean : ${obj}")
        else -> println("Unknown")
    }
}