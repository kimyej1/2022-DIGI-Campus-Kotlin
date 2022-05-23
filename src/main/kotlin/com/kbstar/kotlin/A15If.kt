package com.kbstar.kotlin

fun main() {

    // console 사용자 입력값 받기
    print("Insert Number (Int) : ")
    val num = readLine()!!.toInt()

    println("num = ${num}")

    var grade : Char = 'F'

    if(num >= 90)
        grade = 'A'
    else if(num >= 80)
        grade = 'B'
    else
        grade = 'F'

    println("your grade = ${grade}")

    print("Insert Number (Double) : ")
    val num2 = readLine()!!.toDouble()
    grade = 'F'

    if(num2 >= 90.0)
        grade = 'A'
    else if(num2 in 80.0 .. 89.9)
        grade = 'B'
    else if(num2 in 70.0 .. 79.9)
        grade = 'C'
    else
        grade = 'F'

    println("num2 = ${num2}, grade = ${grade}")

    print("Insert Score (Double) : ")
    var score = readLine()!!.toDouble()

    when(score)     // 약간 switch문 같은..?
    {
        in 90.0..100.0 -> grade = 'A'
        in 80.0..89.9 -> grade = 'B'
        in 70.0..79.9 -> grade = 'C'
        !in 70.0..100.0 -> grade = 'F'
    }
    println("score = ${score}, grade = ${grade}")

    print("Insert Score (Double) : ")
    score = readLine()!!.toDouble()

    when
    {
        score >= 90.0 -> grade = 'A'
        score in 80.0..89.9 -> grade = 'B'
        score in 70.0..79.9 -> grade = 'C'
        score < 70.0 -> grade = 'F'
    }

    println("score = ${score}, grade = ${grade}")
}