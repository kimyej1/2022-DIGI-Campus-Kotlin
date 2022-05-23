package com.kbstar.kotlin

open class ThirdBird(var name:String = "noname", var wing:Int=2, var beak:String="short", var color:String)
{
    fun fly() = println("Fly wing : ${wing}")
    fun sing(vol: Int) = println("Sing Volume : ${vol}")
}

// 주 생성자를 사용하는 상속
class Lark(name:String, wing:Int, beak:String, color:String) : ThirdBird(name, wing, beak, color)
{
    fun eat() = println("Eat...")
}

// 부생성자르 사용하는  상속
class Parrot: ThirdBird
{
    var lang: String

    constructor(name: String, wing: Int, beak: String, color: String, lang: String) : super(name, wing, beak, color) {
        this.lang = lang
    }

    fun speak() = println("Speak : ${lang}")

}

fun main() {
    var eagle = ThirdBird("eagle", 2, "short", "black")
    var lark = Lark("lark", 2, "Middle", "red")
    var parrot = Parrot("Parrot", 2, "Short", "Yellow", "Korean")

    println("parrot : ${parrot.name}, ${parrot.color}, ${parrot.lang}")
    lark.eat()
    parrot.speak()
    parrot.fly()

}

// override : 재정의
// overloading : 중복정의
//  operator overloading