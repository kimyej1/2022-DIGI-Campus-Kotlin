package com.kbstar.kotlin

// Property Override : Getter/Setter 기능 바꿀 때!
open class First
{
    open val x:Int = 0
        get(){
            println("i am first getter()")
            return field
        }
    val y:Int = 0
}

class Second : First()
{
    override val x: Int = 0
        get() {
            println("Second get x")
            return field * 10
        }
    // y getter/setter override X (not open)
}

fun main() {
    val second = Second()
    println(second.x)
    println(second.y)
}