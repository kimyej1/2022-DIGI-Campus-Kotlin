package com.kbstar.kotlin

open class Base {           // 최상위 클래스에서는 protected 사용 불가
    protected  var age = 1
    protected fun protectedFunc() {
        age ++
    }

    fun access() {
        protectedFunc()     // 같은 클래스 내에서는 허용
    }

    // inner class, nested class
    protected class NestedClass() {

    }
}

class Derived : Base() {
    fun test() : Int {
        protectedFunc()
        return 1
    }
}

fun main() {
    var base = Base()
//    println(base.age)     // not visible
//    base.protectedFun()   // not visible
    base.access()
}