package com.kbstar.kotlin

// (Kotlin) Companion = (Java) Static

class Static
{
    var id: Int = 0
    var name: String = "no name"

    companion object {
        var lang:String = "Korean"
        fun work() {
            println("working..")
        }
    }
}

fun main() {
    // 원칙: 객체를 생성한 후(인스턴스화) 사용
    println(Static.lang)    // 인스턴스를 생성하지 않고, 기본값을 사용
//    println(Static.name)    // Companion Object 안에 있는것만 사용 가능
    Static.lang = "English"
    println(Static.lang)    // Class가 공유하는 lang (자바에서도 Car의 Static변수는 taxi.var보다 Car.var로 쓰는것이 더 좋음)
    Static.work()

    var share1 = Static()
    var share2 = Static()
//    println("share1.lang = ${share1.lang}")   // 코틀린에서는 자바처럼 taxi.var로 쓰면 오류남
    println("share1.lang = ${Static.lang}")

    Static.lang = "Kotlin"
    println("share1.lang = ${Static.lang}")
}