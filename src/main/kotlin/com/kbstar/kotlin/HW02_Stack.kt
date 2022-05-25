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
                    var flag = 0
                    while(flag == 0) {
                        print("Insert number to Push : ")
                        try {
                            var push = readln()!!.toInt()
                            stack = stack.plus(push)
                            flag = 1
                        } catch (e: Exception) {
                            println("Invalid number, please try again.")
                        }
                    }
                }
            }
            "2" -> {
                if(stack.isEmpty()) {
                    println("Stack is Empty.")
                } else {
                    stack = stack.sliceArray(0 until stack.size-1)
                }
            }
            "3" -> {
                if(stack.isEmpty()) {
                    println("Stack is Empty.")
                } else {
                    for (i in stack.size - 1 downTo 0) {
                        println(stack[i])
                    }
                }
            }
            else -> println("Invalid menu, please try again.")
        }
    }
}