package com.kbstar.kotlin

import java.util.*

fun main() {

    while(true)
    {
        print("Insert Game (0 to exit) : ")
        var game = readln()!!.toInt()

        if (game == 0) {
            println("Exit...")
            break;
        } else {
            for (i in 1..game) {
                print("Game count $i : ")

                var lotto = Array(45, { i -> i + 1 })
                lotto.shuffle()
                lotto = lotto.sliceArray(0..5)
                lotto = lotto.sortedArray()

                println(Arrays.toString(lotto))
            }
        }
    }
}