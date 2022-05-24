package com.kbstar.kotlin

abstract class Printer {
    abstract fun print();   // Printer 상속받으려면 print() 꼭 Override 해야함!
    fun test() {
        println("i am test()")
    }
}

val myPrinter = object :Printer() {
    override fun print() {
        println("i am myPrinter()")
    }
}

fun main() {
    myPrinter.print()
    myPrinter.test()

//    var print = Printer()     // abstract 객체를 만들 수는 없음
}