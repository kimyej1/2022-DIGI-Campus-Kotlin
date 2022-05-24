package com.kbstar.kotlin

class MyUser(_id: Int, _name:String, _age:Int) {
    val id: Int = _id           // val -> read only
    var name:String = _name
    var age:Int = _age
}

// exactly the same expression
class MyUser2(val id:Int, var name:String, var age:Int) {}

class MyUser3(_id: Int, _name:String, _age:Int) {
    val id: Int = _id
        get() = field           // val -> no setter

    var name:String = _name
        get() = field
        set(value) {
            field = value.uppercase()   // 이런 면에서는 setter 필요! (사용자 셋팅값을 한번 변경 거쳐서 등록하고싶을 때)
        }

    var age:Int = _age
        get() = field
        set(value) {
            field = value
        }
    /*
        왜 field 라는 키워드를 쓸까?
        set(age) {_age = age} 이렇게 안하고..

        age = age 이렇게 쓸까봐,,!
        getter/setter 별로 의미 없다.
     */
}

fun main() {
    var hong = MyUser(1, "kdHong", 12)
    var kim = MyUser2(2, "kim", 23)

    hong.age = 11           // change value
    var name = hong.name    // make variable

    println("name = $name, ${hong.name}, age = ${hong.age}")

    var user = MyUser3(3,"Lee", 31)
    user.age = 33               // setter
    user.name = "hongkildong"   // setter
    println("user.name = ${user.name}, age = ${user.age}")

}