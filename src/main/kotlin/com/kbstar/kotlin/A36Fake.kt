package com.kbstar.kotlin

class FakeAge
{
    var age:Int = 0
        set(value) {
            field = when {
                value < 18 -> 18
                value in 18..30 -> value
                else -> value - 3
            }
        }
}

fun main() {
    val kim = FakeAge()
    kim.age = 15
    println("real age = 15, fake age = ${kim.age}")

    kim.age = 25
    println("real age = 25, fake age = ${kim.age}")

    kim.age = 46
    println("real age = 46, fake age = ${kim.age}")

}