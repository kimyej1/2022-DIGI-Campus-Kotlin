package com.kbstar.kotlin

import java.util.*

fun main() {
    var lotto = Array(6, {0})
    var game = 0
    var random = Random()

    while(true) {
        print("Insert Game Count (0 to Exit) : ")
        game = readln()!!.toInt()

        if(game == 0) {
            println("Bye~~")
            break;
        }

        for(i in 1..game) {
            println("$i 번째 게임을 시작합니다.")

            for(j in 0..lotto.size-1) {

                while(true) {
                    var flag = false
                    lotto[j] = random.nextInt(1, 46)

                    for (k in 0..j - 1) {
                        if (lotto[k] == lotto[j]) {
                            flag = true
                            break;
                        }
                    }

                    if(flag == false) {
                        break;
                    }
                }
            }

            // Sorting
            for(j in 0..lotto.size-1) {
                for(k in 0..j-1) {
                    if(lotto[j] < lotto[k]) {
                        var tmp = lotto[j]
                        lotto[j] = lotto[k]
                        lotto[k] = tmp
                    }
                }
            }

            println(Arrays.toString(lotto))
        }
    }
}