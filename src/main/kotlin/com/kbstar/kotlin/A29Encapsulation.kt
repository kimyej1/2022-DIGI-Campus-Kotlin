package com.kbstar.kotlin

private class PrivateClass {
    private var i = 1

    private fun privateFunction() {
        i += 1   // 같은 private class 안에서는 접근 가능
    }

    fun access() {
        privateFunction()
    }
}

class OtherClass {
//    var otherPrivateClass = PrivateClass()    // private class 라서 허용 X
    fun access() {
        var privateClass = PrivateClass()       // 얘는 허용 ! -> 함수에서는 private class의 객체를 생성할 수 있다.
    }
}

fun topFunction() {
    var tpc = PrivateClass()
}

fun main() {
    var pc = PrivateClass()           // 얘도 허용 ! -> main 도 함수,
                                      // 객체 생성은 가능하지만, getter/setter 없으면 호출 안됨

    pc.access()                       // access() 를 통해 접근 가능
//    pc.privateFunction()            // 바로는 불가능 -> not visible
}