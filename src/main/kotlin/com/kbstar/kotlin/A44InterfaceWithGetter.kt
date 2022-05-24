package com.kbstar.kotlin

interface PetOne {
    var category:String
    val msg:String
        get() = "PetOne Message"    // interface getter 쓰려면 var(X) val(O)

    fun feed()
    fun eat() {
        println("PetOne -> eat()")
    }
}

class CatOne(override var category: String) : PetOne {
    override fun feed() {
        println("CatOne -> feed()")
    }
}

fun main() {
    var obj = CatOne("Lion")
    println("Category = ${obj.category}")
    println("")
}