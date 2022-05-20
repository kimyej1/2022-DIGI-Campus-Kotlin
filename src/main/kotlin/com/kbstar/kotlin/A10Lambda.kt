package com.kbstar.kotlin

// Call by Value
/*
    void printArray()
    {

    }

    main()
    {
        int[] lotto = new int[6];
        printArray(lotto)
    }
 */

fun test2(value:Int)
{
    println("param value = ${value}")
}

fun callByValue(b: Boolean) : Boolean
{
    println("I am callByValue")
    return b                    // true 라고 부르면 true 리턴, false 라고 부르면 false 리턴
}

val myTest : () -> Boolean = {
    println("I am myTest()")
    true                // function은 return ___ 이렇게 써야하는데, 변수로 쓸때는 return 안씀
}

fun main() {
    test2(12)

    val result = callByValue( myTest() )
}