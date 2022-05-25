package com.kbstar.kotlin

/*
    Collection :
        (C++) STL Standard Template Library
        Data Structure 를 일반화 시켜놓은 Data Set
        List, Stack, Queue, Tree, Set, Map,...

        1. 성능이 최적화되어있다.
        2. 시간 복잡도와 공간 복잡도가 공표되어있다.

        o o o o o o o o o o o   ->  n/2 ->  O(n)

                  o
                o   o
              o o   o o
          o o o o   o o o o     ->  O(log n)

        A - B - C - D
 */

fun main() {
    var nums : List<Int> = listOf(1,2,3,4,5)
    var names : List<String> = listOf("kim", "lee", "park", "choi")

    println("names = ${names.toString()}")
    for(name in names)
        print("${name} - ")

    println()
    println("nums = $nums") // 리스트는 .toString() 해도되고 안해도됨

    for(x in names.indices)
        println("names[$x] = ${names[x]}")

    println()
    for(idx in 0..names.size-1)
        println("names[$idx] = ${names[idx]}")

    println()
    var idx = 0
    while(idx < names.size) {
        println("$idx : ${names[idx]}")
        var tmp = names.get(idx)
        idx ++
    }
    var emptyList : List<String> = emptyList<String>()
    var emptyList2 : List<String> = listOf()
    println("emptyList = ${emptyList.toString()}")
    println("emptyList2 = ${emptyList2.toString()}")

    emptyList.plus("one")
    emptyList.plus("two")
    println(emptyList)

    println(names)
    // get(index)
    var total = names.size  // 먼저 사이즈 파악이 중요!
    println("${names[2]}")
    var pos = names.indexOf("park")
    println("pos = $pos")
    pos = names.indexOf("hong")
    println("pos = $pos")   // 없으면 -1

    println("contains lee = ${names.contains("ee")}")   // 여기의 contains = 포함 아니고 같은지 보는거!
    println("contains lee = ${names.contains("lee")}")

    // List, ArrayList
    var langs : ArrayList<String> = arrayListOf("C", "C++", "Java", "HTML", "Kotlin", "Python", "JS")
    println("langs = $langs")
}