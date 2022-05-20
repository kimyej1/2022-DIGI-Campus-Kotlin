package com.kbstar.kotlin

fun main() {
    // 변수에 람다식을 활용
    // (타입1, 타입2 ... ) -> 리턴타입 = { 변수1, 변수2, ... -> 동작(리턴) }

    var result : Int

    // 생략되는 원래 전체 표현
    var sum1 : (Int, Int) -> Int = {a:Int , b:Int -> a + b}
    var greet : () -> Unit = { println("Hello") }   // 0 parameter
    var square : (Int) -> Int = { a:Int -> a * a }  // 1 parameter

    // 선언 자료형 생략
    var sum2 = { a:Int, b:Int -> a + b }

    // 매개변수 자료형 생략
    var sum3 : (Int, Int) -> Int = {a, b -> a + b}

    var total = add3(10,20)

    result = test( { a, b -> a + b }, 2, 3)
    println("result = ${result}")

    val greeting : () -> Unit = { println("Hello") }
    println("greeting = ${greeting}")
    greeting()

    val testOutput : () -> Unit = { println("function pointer test") }  // testOutput 은 함수!
    val testInput : () -> Unit = { println("function pointer input test") }
    testOutput()

    // *** Function Pointer
    //      : function call 처럼 바로 함수를 "수행"하는게 아니라, 변수를 함수 가리키라고 "할당"만 하는거(call X)
    var functionPointer = testOutput
    functionPointer()

    functionPointer = testInput   // 여기저기 가리킬 수 있음 (대상을 바꿔가면서 변수처럼 지정 가능)
    functionPointer()

    val adder : (Int, Int) -> Int = { a:Int, b:Int -> a + b }
    val subtracter : (Int, Int) -> Int = { a:Int, b:Int -> a - b }
    val multiplier : (Int, Int) -> Int = { a:Int, b:Int -> a * b }
    val divider : (Int, Int) -> Int = { a:Int, b:Int -> a / b }

    var operator = adder            // 변수 하나로 무슨함수인지 그때그때 바꿔가면서 쓸 수 있음
    println(" + : " + operator(4,2))
    operator = subtracter
    println(" - : " + operator(4,2))
    operator = multiplier
    println(" * : " + operator(4,2))
    operator = divider
    println(" / : " + operator(4,2))

}
fun add3(a:Int, b:Int) = a + b
fun myAdd(a:Int, b:Int) = a + b + 1
fun test(func : (Int, Int) -> Int, a:Int, b:Int) : Int   // 파라미터 총 세개 (sum함수, a, b)
{
    println("func = " + func(a,b))
    return myAdd(a + 7, b) + a + b
}