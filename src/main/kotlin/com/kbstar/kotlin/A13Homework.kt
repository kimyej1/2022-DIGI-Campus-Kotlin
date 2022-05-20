package com.kbstar.kotlin

fun main() {
    val kbgreet : () -> Unit = { println("Hello!") }
    val kbheight : (Int) -> Double = { h: Int -> h.toDouble()/100}
    val kbweight = { w: Double -> w.toInt() }

    var kbBMI : (Double, Int) -> Unit = { h, w -> println("My BMI is ${(w.toDouble() / (h * h))}.\n") }

    kbgreet()
    println(kbIntroduce("Hong","Kildong"))
    var h = kbheight(181)
    var w = kbweight(75.3)

    println("I am $h m tall, and weigh $w kg.")
    kbBMI(h, w)

    val kbTriArea : (Int, Int) -> Double = { base : Int, height : Int -> (base * height).toDouble() / 2 }
    val kbSqrArea = { base : Int, height : Int -> (base * height).toDouble() }

    var kbArea = kbTriArea
    println("Triangle Area = " + kbArea(3, 5))
    kbArea = kbSqrArea
    println("Square Area = " + kbArea(3, 5))
}

fun kbIntroduce(fname: String, lname:String) : String
{
    return "I'm ${fname} ${lname}.\n";
}

/*
Hello!
I'm Hong Kildong.

I am 1.81 m tall, and weigh 75 kg.
My BMI is 22.89307408198773.

Triangle Area = 7.5
Square Area = 15.0
 */