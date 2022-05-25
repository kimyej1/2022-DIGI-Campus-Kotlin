package com.kbstar.kotlin

/*
    Map :
        대용량 데이터 처리할 때 유용하다.
        key : value 의 쌍으로 처리
        Dictionary Type
        배열(연관배열, Associative Array)
 */

fun main() {
    var langMap : Map<Int, String> = mapOf(1 to "Java", 2 to "Kotlin", 3 to "Python")
    println("langMap = $langMap")
    println(langMap[2])

    for( (key,value) in langMap )
        println("key : $key, value = $value")

    var protocol : Map<String, String> = mapOf("tcp" to "Transmission Control Protocol",
                                                "udp" to "User Datagram Protocol",
                                                "http" to "Hyper-Text Transfer Protocol")
    println("udp = ${protocol["udp"]}")

    // Mutable Map
    var capitalMap : MutableMap<String, String> = mutableMapOf("Korea" to "Seoul")
    capitalMap.put("Japan","Tokyo")
    capitalMap.put("USA","Washington DC")
    capitalMap.put("Korea", "Busan")    // 두개의 쌍이 있을 순 없음 -> 서울을 부산으로 "덮어쓰기"
    capitalMap.remove("Japan")
    capitalMap.put("France", "Paris")
    println("capitalMap = $capitalMap")

    print("Insert Nation : ")
    var nation = readln()
    println("${nation} -> ${capitalMap[nation]}")

    val list = listOf(1,2,3,4,5,6,7)
    println("Odd number = " + list.filter { it % 2 == 1 })

    var nums : Sequence<Int> = generateSequence(100) { it + 1 } // seed부터 시작 (mariaDB : auto_increment)
    println(nums.take(10).toList())
    println(nums.take(10).toList())
}