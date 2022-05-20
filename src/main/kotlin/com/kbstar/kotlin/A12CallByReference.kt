package com.kbstar.kotlin

// Call By Reference : 참조에 의한 호출, 포인터로 호출
/*
    ::  사용하면 인자소괄호, 인자를 생략할 수 있다.
        함수 포인터처럼 사용할 수 있다.
 */

fun main() {
    var result = funcParam(3, 2, ::starSum)
    println("result = ${result}")
}

fun funcParam(a:Int, b:Int, c:(Int, Int) -> Int) : Int  {
    return c(a,b)
}

fun starSum(a:Int, b:Int) = a + b