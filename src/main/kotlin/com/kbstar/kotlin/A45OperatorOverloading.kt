package com.kbstar.kotlin

// 연산자 새로 정의하기
/*
    항의 갯수를 바꿀 수는 없음 (이항 -> 이항, 삼항 -> 삼항)

    a + b   <-------->  a.plus(b)
    a - b   <-------->  a.minus(b)
    a * b   <-------->  a.times(b)
    a / b   <-------->  a.div(b)
    .
    .
    cf) 책 page 343 ~ 346
 */

class Point(var x:Int = 0, var y:Int = 0) {
    operator fun plus(p:Point) : Point {        // plus, minus, times 이런 이름은 내가 정하는게 아니고
        return Point(x + p.x, y + p.y)    // Operator Overloading 에 정해져있는 이름!
    }
    operator fun minus(p:Point) : Point {
        return Point(x - p.x, y - p.y)
    }
    operator fun times(p:Point) : Point {
        return Point(x * p.x, y * p.y)
    }
    override fun toString(): String {
        return "Point(x=$x, y=$y)"
    }
}

fun main() {
    val p1 = Point(1,2)
    val p2 = Point(10,20)

    var point = Point()
    point = p1 + p2     // operator plus 때문에 +가 동작한다..!
    println(point)

    point = p1.plus(p2) // same expression
    println(point)

    point = p1 - p2
    println(point)

    point = p1 * p2
    println(point)
}