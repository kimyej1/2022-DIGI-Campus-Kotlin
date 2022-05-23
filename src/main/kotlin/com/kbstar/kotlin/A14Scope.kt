package com.kbstar.kotlin

// 최상위 함수
//  : 함수를 어떤 클래스에 위치하기 애매할 때, 그냥 소스파일의 최상위인 모든 클래스 바깥에 이렇게 놓아도 됨
fun a() = println("I am 'a'.")
/*
    fun b(){ println("I am 'b'.") }
    fun c() : () -> Unit = { println("I am 'c'.") }
 */

fun b() = a()
fun c() {
    println("I am 'c'.")

    // Nested Function
    fun c1() = println("I am 'c1'.")
}

var globalVar = 10  // 전역변수
fun main() {
    a();
    b();

//    c1()    -- c1은 호출할 수 없다(같은 레벨에 있지 않음)
    c()

    var localVar1 = 11
    var localVar2 = 22

    println("global Var = ${globalVar}")    // 전역변수라 여기서도 보임

    fun nestedFun() {
        globalVar ++    // globalVar = 11
        var localVar1 = 33  // var 쓰면 point 1은 33, point 2는 11 나옴, var 안쓰면 둘다 33
        println("local Var 1 = ${localVar1}, local Var 2 = ${localVar2}")   // ""point 1""
    }

    nestedFun()
    println("local Var 1 = ${localVar1}, local Var 2 = ${localVar2}, global Var = ${globalVar}")   // ""point 2""

    outsideFun()
    println("local Var 1 = ${localVar1}, local Var 2 = ${localVar2}, global Var = ${globalVar}")    // ""point 3""
}

fun outsideFun() {
    var localVar1 = 111
    var localVar2 = 222
    globalVar = 333

    println("I am outsideFun.")
    println("local Var 1 = ${localVar1}, local Var 2 = ${localVar2}, global Var = ${globalVar}")    // ""point 4""
}