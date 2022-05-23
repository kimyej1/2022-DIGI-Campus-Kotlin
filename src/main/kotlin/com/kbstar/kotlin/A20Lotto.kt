package com.kbstar.kotlin

import java.util.*

/*
    무한루프를 돈다.
    사용자에게 게임수를 입력받는다. (1~5 에러검사 없음) : readln()
    0 입력 시 프로그램 종료
    3 입력 시 3게임의 로또번호 생성
        중복 제거, 오름차순 정렬
 */
fun main() {
    var a = 2
    var b = 5

    println("a = %02d, b = %05d".format(a, b))

    print("Insert Games (1 ~ 5, 0 to Exit) : ")
    var game = readln()!!.toInt()

    if(game == 0)
        println("Exit..")
    else {
        for(g in 1..game) {
            println("$g 번째 로또 ----------------")

            // Generate
            var random = Random();
            var lotto = ArrayList<Int>(6);

            while(lotto.size < 6) {
                var rand = random.nextInt(45) + 1

                if(lotto.contains(rand))
                    continue;
                else
                    lotto.add(rand)
            }

            // Sort
            for (x in 0..lotto.size - 1) {
                for(y in 0..x-1) {
                    if(lotto[x] < lotto[y]) {
                        var temp = lotto[x]
                        lotto[x] = lotto[y]
                        lotto[y] = temp
                    }
                }
            }

            // Format

            println(lotto)
        }
    }
}