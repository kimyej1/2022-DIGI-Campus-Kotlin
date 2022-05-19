package com.kbstar.kotlin

fun main() {
    // 변수 선언
    // val 변수이름 : 타입 = "값"

    /*
        자료형 추론
            var age = 12 -> Int 라고 추론함
     */

//    var age : Int;    // 코틀린은 null 값을 허용하지 않는다(디폴트 not null)
//    println("age = ${age}")

    val num = 12        // constant, Int 추론
    var lang = "Kotlin" // String 추론
    lang = "Korean";
//    num = 34;         // impossible : read only variable(constant, final)

    /*
        변수 선언할 때 규칙
            1. 불가 : 키워드 (val, var, class, Int, if, for, ...)
                     숫자로 시작 (123test,..)    * _test 이런건 되는데, 시스템에서 쓸수도있어서 안쓰는게 좋음
            2. 표기법 : 카멜표기법

        데이터 타입
            1. 정수형 : Int : 4Byte : -20억 ~ 20억
                      Long : 8Byte : -2^63 ~ 2^63-1
                      Short : 2Byte : -32000 ~ 32000 (65,536가지) ex) port #  -> 자바에는 없음!
                      Byte : 1Byte : -128 ~ 127 (256가지)
                          ** age : unsigned 로 쓰면 -값 없이 0~255 로 쓸 수 있음!
                            UInt, UShort, ULong, UByte,...
            2.
     */

    var numByte : Byte = 127;
    println("numByte = ${numByte}, next = ${numByte + 1}");

//    numByte = numByte + 1;    // overflow 허용 안함
    println("numByte = ${numByte}");

    var numLong = 123L;         // L 안붙이면 Int로 추정, L 쓰면 Long으로 추정
    var numHexa = 0x0F;         // or 0x0FF
    var numBinary = 0b001010;   // B : Byte, b : bit

    val uint : UInt = 123u;     // u : unsigned
    val ushort : UShort = 65535u;
    val ulong : ULong = 123uL;  // u + L

    /*
        UnderScore
            1,234,567
            1_234_567
     */
    val million = 1_000_000
    val cardNum = 1234_5678_9012_3456L;
    val hexa = 0xAB_CD_EF_12;
    val bytes = 0b1010_1100

    println("hexa = ${hexa}")

    /*
        부동소수점 : Float(4Byte, 10^38), Double(8Byte, 10^308)
     */

    val num01 = 3.14; // Double
    val num02 = 3.14F; // Float
    println("num02 = ${num02}")
    val num03 = 3.14E-2;    // 10^-2
    val num04 = 3.14e2;     // 10^2
    println("num03 = ${num03}")
    println("num04 = ${num04}")

    // 반복문 미리보기
    var sum: Double = 0.1
    for(x in 1..100)    // 1..100 하면 알아서 해줌
    {
        println(x)
        sum += 0.1            // 10.0999...98  소수점 정밀도가 떨어짐..
    }
    println("sum = ${sum}")

    println("Max Int = " + Int.MAX_VALUE)
    println("min Byte = " + Byte.MIN_VALUE)
    println("Max UInt = " + UInt.MAX_VALUE)
    println("Max Double = " + Double.MAX_VALUE)

    /*
        논리형 : Boolean true/false
     */
    val isOn = false;
    val isOff = true;

    val isOK : Boolean  // null 안되는데, 사용만 안하면 괜찮음. 사용하면 오류남(메모리까지만 잡는건 가능)
    println("isOn = ${isOn}")

    /*
        문자형 : Char
     */
    val initial = 'K'
    var myChar : Char

    myChar = 'M'
    myChar = '\uAC00'   // 유니코드도 쓸 수 있다
    println("myChar = ${myChar}")

    var code : Int = 65;    // 0x41, A
    var codeChar : Char = code.toChar();
    println("codeChar = ${codeChar}")

    for(x in codeChar .. codeChar + 25)
    {
        println(x)
    }

    for(x in 65..90)
    {
        println(x.toChar())
    }
    /*
        == : 값이 같냐?
        === : 메모리가 같냐?
     */

    var str1 : String = "Kotlin";
    var str2 : String = "Java";
    var str3 : String = "Kotlin"

    println("str1 == str2 : ${str1 == str2}")
    println("str1 == str3 : ${str1 == str3}")
    println("str1 === str2 : ${str1 === str2}")
    println("str1 === str3 : ${str1 === str3}")

    str3 = "World"  // false
    str3 = "Kotlin" // true
    println("str1 === str3 : ${str1 === str3}")

    var degree = 77
    val testString1 = "degree = ${degree}"
    val testString2 = "degree = ${degree + 5}"

    println("testString2 = ${testString2}")

    val myDocument = """
        abc
        def
        123
    """//.trimIndent()  // 들여쓰기 무시~

    println(myDocument)

    // Class Alias
    // DataType Alias

    // C Long
    //      typedef unsigned int IP

    // typealias IP = UInt

    // 코틀린은 null 허용하지 않는 것이 원칙!
    // null을 허용하도록 메모리를 만들어주면 가능하다(Nullable Variable : type?)
    // null = 0x0 = \0

    var str5 : String = "Hello World"
    // str5 = null  // unprivileged

    var str6 : String? = "Hello World"
    var len1 = str6?.length  // null 아닐때만 길이를 재라
    println("len = ${len1}")

    str6 = null
    println("str6 = ${str6}")
    println("length1 = ${str6?.length}")

    var len2 : Int = if(str6 != null) str6.length else -1 // null 이면 -1 반환해줘~
//    var len3 : Int = str6?.length   // null은 Int가 아니니까 오류남 -> 그래서 len2처럼 강제로 Int 만들어주는게 편해
    println("length2 = ${len2}")
}