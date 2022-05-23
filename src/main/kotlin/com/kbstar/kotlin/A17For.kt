package com.kbstar.kotlin

// 반복문 : for, while(), do~while()

fun main() {
    var sum = 0

    for(x in 1..10)
        println(x)

    for(x in 1..10 step 2)
        println(x)

    println("down")
    for(x in 10 downTo 1 step 2)    // step 에는 +/- 개념이 없다
        println(x)


    /*
        사용자로부터 구구단의 단(table)을 입력받아서,
        해당하는 단을 출력하시오.
     */
    print("Insert Table : ")
    var table = readln()!!.toInt()

    for(x in 1..9)
        println("${table} * $x = ${table * x}")

    // 1 ~ 9단 다 출력하기
    for(x in 1 .. 9) {
        println("--------- $x 단 시작 ----------")
        for (y in 1..9)
            println("$x * $y = ${x * y}")
    }

    // 별트리 만들기
    for(x in 1..5)
        println(" ".repeat(5-x) + "*".repeat(2*x-1))
    for(x in 1..10 step 2)
        println(" ".repeat((10-x-1)/2) + "*".repeat(x))  // 이거 내가한거,, 0/2가 되는 문제 있음




    // 1 ~ 100
    sum = 0

    for(x in 1 .. 100 step 1)
        sum += x
    println("1+2+...+100 = ${sum}")

}