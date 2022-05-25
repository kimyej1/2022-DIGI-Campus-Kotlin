package com.kbstar.kotlin

fun main() {
    var stack = emptyArray<Int>()

    while(true) {
        print("Choose the menu - [1] Push [2] Pop [3] Dump [0] Exit : ")
        var menu = readln()

        when(menu) {
            "0" -> {
                println("Exit...")
                break
            }
            "1" -> {
                if(stack.size == 5) {
                    println("Stack is already Full.")
                } else {
                    print("Insert number to Push : ")
                    var push = readln()!!.toInt()
                    stack = stack.plus(push)
                }
            }
            "2" -> {
                if(stack.isEmpty()) {
                    println("Stack is Empty.")
                } else {
                    stack = stack.sliceArray(0..stack.size-2)
                }
            }
            "3" -> {
                for(i in stack.size-1 downTo 0) {
                    println(stack[i])
                }
            }
        }
    }
}