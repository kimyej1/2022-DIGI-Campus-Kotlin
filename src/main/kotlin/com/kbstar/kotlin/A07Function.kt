package com.kbstar.kotlin

/*
    Java : 리턴타입 함수이름(파라미터)
        result = add(1,2);
        a = 1;
        b = 2;

        int add(int a, int b) {
            // 함수 안에서의 a, b는 a=1, b=2와 이름은 같지만 다른 메모리임 (따로 만들어서 값 복사해옴)
            return a + b;
        }
 */

// 함수 정의
fun add(a : Int, b : Int) : Int  // Kotlin : 함수이름(파라미터) : 리턴타입
{
    var total = a + b
    return total;
}

fun max(a:Int, b:Int) = if(a > b) a else b
fun sum(a:Int, b:Int) = a + b
fun product(a:Int, b:Int, c:Int) = a * b * c
fun addString(a:String, b:String) = a + b

fun printSum(a:Int, b:Int) : Unit
{
    println("param a = $a, b = $b, sum = ${sum(a, b)}")
}

fun printSayHello() : Unit
{
    println("안녕하세요")
}

fun main() {
    val result1 = add(1,2)
    var result2 = add(3, 4)

    // Function Call
    println("result1 = ${result1}")
    println("result2 = ${result2}")
    println("result3 = " + add(5,6))

    var result4 = sum(1,2)
    println("sum = ${result4}")
    println("max = " + max(5,15))
    println("product = " + product(3,5,8))
    println("addString = " + addString("abc", "def"))

    var myString : String = addString("Hello", "World")
    println(myString)

    // 다른 언어 : Void
    // Kotlin : Unit

    // 람다식
    // 매개변수(파라미터)가 없는 함수는 바로 사용!
    val greet : () -> Unit = { println("Hello!")}
    println("greet = ${greet}")

    addUser("kdhong", "kdhong@kbstar.com")
    addUser("sslee")    // email엔 디폴트값 들어감

    defaultArgs(10,20)
    defaultArgs(10)
    defaultArgs()
    // Named Parameter
    defaultArgs(b=100)
    defaultArgs(b = 7, a = 3)

    /*
        가변길이 매개변수(파라미터) : 몇개가 올지 모르는..
            System.out.printf("a = %d, b = %d, c = %d, a, b, c, d)
            test(a, b, ....)
    */
    var x = 0;
    x = variableArgs(1,2,3)
    println("x = $x")
    x = variableArgs(1,2,3,4,5,6,7,8,9,10)
    println("x = $x")
}

// addWord(a, b="hello", c="kbstar)  입력 안했을때 대비해서 디폴트값 지정 (a, b만 입력하면 c = kbstar)
fun addUser(name:String, email:String = "user@test.com") : Unit
{
    println("I am addUser()")
    println("name : ${name}, email : ${email}")
}

fun defaultArgs(a:Int = 1, b:Int = 2)    // : Unit 은 생략이 가능하다
{
    println("a = ${a}, b = ${b}")
}

fun variableArgs(vararg counts:Int) : Int  // vararg : variable args
{
    // for (i=1; i<10; i++)
    // for (value : lotto)
    var total = 0

    for(num in counts)
        // println(num)
        total += num

    return total
}
