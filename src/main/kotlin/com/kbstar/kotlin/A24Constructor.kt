package com.kbstar.kotlin

class MyBird {
    // Field(Java), Property(Kotlin)
    var name: String = "myBird"
    var wing: Int = 2            // 부생성자가 여러개일 때는 초기화 해주지 않으면 에러가 난다.
    var beak: String = "short"
    var color: String = "blue"

    constructor(name: String, wing: Int, beak: String, color: String) {
        this.name = name
        this.wing = wing
        this.beak = beak
        this.color = color
    }

    // 부 생성자 : 매개변수를 통해서 초기화할 프로퍼티를 지정
    constructor(name: String, color: String) {
        this.name = name
        this.color = color

    }

    constructor()
    {

    }


    // 오른쪽 마우스 -> Generate -> Secondary Constructor -> 항목선택


    // Method
    fun fly() = println("Fly wing : ${wing}")
    fun sing(vol: Int) = println("Sing Volume : ${vol}")
}

// 주생성자
class YourBird(var name:String, var wing:Int, var beak:String, var color:String)
{
    // 프로퍼티는 매개변수 안에 var를 선언하면, 본문에서 생략이 가능
    fun fly() = println("Fly wing : ${wing}")
    fun sing(vol: Int) = println("Sing Volume : ${vol}")

    override fun toString(): String {
        return "YourBird(name='$name', wing=$wing, beak='$beak', color='$color')"
    }


}

class FirstBird(var name:String, var wing:Int, var beak:String, var color:String)
{
    // Init Properties (초기화 블럭을 가진 주생성자)
    init {
        println("start init FirstBird")
        println("name = ${name}, color = ${color}")
        this.fly()
        this.sing(0)
    }

    fun fly() = println("Fly wing : ${wing}")
    fun sing(vol: Int) = println("Sing Volume : ${vol}")
}

// 프로퍼티의 기본값 정하기
class SecondBird(var name:String = "noname", var wing:Int=2, var beak:String="short", var color:String)
{
    // Init Properties (초기화 블럭을 가진 주생성자)
    init {
        println("start init SecondBird")
        println("name = ${name}, color = ${color}")
        this.fly();
        this.sing(0)
    }

    fun fly() = println("Fly wing : ${wing}")
    fun sing(vol: Int) = println("Sing Volume : ${vol}")
}
fun main() {
    val eagle = MyBird("Eagles", 2, "Middle", "White")
    var dove = MyBird("Dove", "Green")
    //var crow = MyBird()

    eagle.color = "black"
    eagle.name = "eagle"
    eagle.wing = 2

    dove.wing=2
    dove.beak = "Short"
    dove.sing(1)


    println("eagle.name = ${eagle.name}, eagle.color = ${eagle.color} , eagle.wing = " + eagle.wing)

    eagle.fly()
    eagle.sing(4)

    // 생성자 : 초기화 메소드

    var canary = YourBird("Canary", 2, "Short", "Yellow")
    canary.beak = "Middle"
    println("canary = ${canary} ")
    canary.fly()

    val first = FirstBird("First", 2, "short", "black")
    first.sing(5)

    val second = SecondBird(color="red")
    val second2 = SecondBird(name="Second", color="Yellow")
}