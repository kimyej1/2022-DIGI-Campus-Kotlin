fun main() {
    val a : Int = 1
//    val b : Double = a  // 자바에서는 자동으로 큰쪽으로 TypeCasting 되었었는데, 코틀린은 오류남
//    val c : Int = 1.1

    // AllType Casting
    val b : Double = a.toDouble(); // 자바는 double(a) 이런식으로 괄호 씌워서 했었음
    println("b = ${b}")

    val d = 1L + 3  // Long + Int 허용 -> d type : Long
    println("d = ${d}")

    /*
        형변환 관련 메소드
            toByte(), toLong(), toShort(), toInt()
            toFloat(), toDouble()
            toChar()
     */

    // Smart Cast : Number (JS에만 number 타입 있음)
    var no : Number = 123   // Int 이런걸로 쓰면 나중에 Float로 바꾸거나 할 수 없으니까 -> 지금은 Integer 라고 추론!
    println("no = ${no}")

    no = 1.23   // number 타입으로 하면 오류 안남! -> Double 추론
    println("no = ${no}")

    no = 1234L  // Long 추론
    println("no = ${no}")

    no = no + 1.23F // Long + Float -> Float로 가야 소수점 이하를 유지할 수 있음 -> Float 추론
    println("no = ${no}")

    // 자료형(Data Type) 검사
    val age = 12    // Int

    if(age is Int)
        println(age)
    else if(age !is Int)    // !is = is not
        println("Not an Int")

    // Any Type
    var any : Any = "Hello World"   // PHP처럼 아무 타입이나 다 넣을 수 있음 (like Python의 mutable : 매번 메모리를 새로 잡음)
    println("any = ${any}")
    any = 123
    any = "Kotlin World"

    if(any is Int)
        println("any is an Int : ${any}")
    else if(any is String)
        println("any is a String, length = ${any.length}")

    // any = 123
    val myValue : String = any as String
    println("myValue = ${myValue}")

    println("type of myValue = ${myValue.javaClass}")
    any = 123
    println("type of any = ${any.javaClass}")
    any = 123L
    println("type of any = ${any.javaClass}")
    any = 123.4
    println("type of any = ${any.javaClass}")

    test(3,4)
}

fun test(a: Any, b: Any)
{
    println("I am test()")
    var sum = 0

    if(a is Int && b is Int)
        sum = a + b
        println("sum = ${sum}")
}