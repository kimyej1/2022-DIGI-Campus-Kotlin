package com.kbstar.kotlin


// Overloading : 중복정의
// signature가 다르며 중복해서 메소드를 정의할 수 있다.

class Calculator
{
    /*
        Signature : 구분할 수 있는 특성
            - Method name    함수 이름
            - args           파라미터 갯수/순서/타입
            - return(X)      리턴타입은 달라도 구분 안됨
     */

    fun add(a:Int, b:Int) : Int = a + b
//    fun add(a:Int, b:Int) : Double = (a + b).toDouble()   --> 이건 구분이 안됨
    fun add(a:Double, b:Double) : Double = a + b
    fun add(a:Double, b:Int) : Double = a + b.toDouble()
    fun add(a:Int, b:Int, c:Int) : Int = a + b + c
    fun add(a:Long, b:Long) :Long = a + b

    // 이런거 만들땐 순서 바꿔진것도 만들어야 편함.. 나중에 Int가 앞인지 Long이 앞인지 기억 안남
    fun add(a:Long, b:Int) : Long = a + b  // 자동 확장(casting) -> Long 되긴하는데, b.toLong()으로 써야 더 확실
    fun add(a:Int, b:Long) = a.toLong() + b

    fun add(a:String, b:String) : String = a + b
    fun add(a:String, b:Int) : String = a + b.toString()    // .toString() 안해도 됨


    fun multi(a:String, b:Int) : String = a.repeat(b)
}

fun main() {
    var calc = Calculator()
    var result = calc.add(1,2)

    println(calc.add(1,2))
    println(calc.add(1.2,2))
    println(calc.add(5.1,4.2))
    println(calc.add(1L, 2L)) // Long
    println(calc.add(1,2,3))

    var str = calc.multi("Hello", 10)
    println("str = $str")
}