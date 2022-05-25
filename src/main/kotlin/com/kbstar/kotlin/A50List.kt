package com.kbstar.kotlin

fun main() {

    var langs : ArrayList<String> = arrayListOf("C", "C++", "Java", "HTML", "Kotlin", "Python", "JS")
    langs[1] = "JavaScript"
    println("langs = $langs")

    var names : List<String> = listOf("kim", "lee", "park", "choi")
//    names[1] = "aaa"             //  langs는 되는데(mutable), names는 안됨(immutable)
//    names.add()

    var mutableList : MutableList<String> = mutableListOf<String>("aaa", "bbb", "ccc")
    mutableList[0] = "AAA"
    mutableList.add("ddd")
    mutableList.remove("xxx")   // 없는 요소 지우면 에러 없이 무시
    println("mutableList = ${mutableList}")

    var list = names.toMutableList()
    list.add("kkk")
    println("list = $list")

    names = names.toMutableList()   // 같은이름의 list를 mutable <-> immutable 전환 가능
    names[1] = "AAAA"
    names.add("mmm")
    names.add("nnn")
    println("names = $names")
}