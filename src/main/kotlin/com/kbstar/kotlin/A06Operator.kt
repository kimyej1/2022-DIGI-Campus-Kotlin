package com.kbstar.kotlin

fun main() {
    /*
        Operator
            1. 산술연산자 : + - * / %
            2. 대입(치환)연산자 : = += -= *= /= %=
            3. 증감연산자 : ++ --
                a = 3
                                출력      a값
                println(a++)     3        4
                println(a)       4        4
                println(--a)     3        3
                println(a)       3        3
     */

    var num1 = 10
    var num2 = 10
    var result1 = ++num1
    var result2 = num2--

    println("result1 = ${result1}, ${num1}")
    println("result2 = ${result2}, ${num2}")

    /*
            4. 비교연산자
                > < >= <= == === != !==
            5. 논리연산자
                && || !
            6. 비트연산자
                & | (T:1, F:0)
                5.shr(2) : 5>>2 : 두자리 없애(2^2 나누기)            101 -> 1 (2)
                5.shl(2) : 5<<2 : 끝에 0두개 더붙이기(2^2 곱하기)      101 -> 10100 (20)

                53 & 37
                    32 + 16 + 4 + 1 -> 110101
                    32 + 4 + 1      -> 100101
                                       ------
                                       100101 = 37
                54 | 40
                    32 + 16 + 4 + 2 -> 110110
                    32 + 8          -> 101000
                                       ------
                                       111110 = 62
                72 & 47
                   64 + 8           -> 1001000
                   32 + 8 + 4 + 2+ 1->  101111
                                       -------
                                       0001000 = 8
     */

    var x = 4       // 2진법 : 100
    var y = 0b0000_1010 // 10진법 : 10
    var z = 0x0F    // 0000 1111

    println("x shl 2 = ${x shl 2}") // 16
    println("x.inv() = ${x.inv()}") // -5
    // 0000 0000    0000 0000   0000 0000   0000 0100 -> 4Byte 메모리를 쓰는 4를 전체 뒤집기
    // 1111 1111    1111 1111   1111 1111   1111 1011 = -5

    println("y shr 2 = ${y shr 2} or ${y/4}")   // 연산속도는 /4보다 shr 2가 더 빠르다
    println("y shl 4 = ${y shl 4} or ${y*16}")

    var k = x.shl(3) // 4 * 8
    println("k = $k")

    num1 = 12
    num2 = 25
    var result : Int

    result = num1 or num2   // num1 | num2 = 01100 | 11001 = 11101 = 29
    println("result = ${result}")

}