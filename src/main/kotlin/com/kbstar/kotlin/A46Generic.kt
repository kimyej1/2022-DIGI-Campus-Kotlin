package com.kbstar.kotlin

class Car<T> (_t : T) {  // T : Template, T말고 다른걸로 써도됨
    var speed = _t
}

fun main() {
    var intCar : Car<Int> = Car<Int>(30)
    var doubleCar : Car<Double> = Car<Double>(15.23)
    var stringCar : Car<String> = Car<String>("thirty-one")

    println("intCar : ${intCar.speed}")
    println("doubleCar : ${doubleCar.speed}")
    println("stringCar : ${stringCar.speed}")
}