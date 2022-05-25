package com.kbstar.kotlin

import java.util.*

fun main() {
    var num1 = arrayOf(1,2,3,4,5,6,7,8,9,10)
    var names = arrayOf("kim", "lee", "park", "choi")

    println("names = " + names)
    println("names = " + Arrays.toString(names))
    println("names = ${Arrays.toString(names)}")

    /*
        (Java) Advanced For
            lotto[6]
            for(int value : lotto)
     */
    for(element in names)
        println(element)

    println()

    for(x in 0..names.size-1)
        println("$x : ${names[x]}")

    println("sum = ${num1.sum()}")
    num1.shuffle()
    println("num1 shuffle = ${Arrays.toString(num1)}")

//    var intOnlyArray = arrayOf<Int>(1,2,3,"Hello",4)  // 얘는 타입을 지정해놨기때문에 hello 오류남
    var intArray = intArrayOf(1,2,3,4)                  // arrayOf<int> 같은 표현

    intArray[2] = 77
    intArray.set(2,77)  // 위랑 같은 표현
    println("intArray = ${Arrays.toString(intArray)}")

    var multiArray = arrayOf(1, "hello", arrayOf(1,2,3,4), arrayOf("one", "two", "three"))  // array 속 array

    println(Arrays.toString(multiArray))
//    println(Arrays.toString(multiArray[2]))   // 얘는 안됨
    println(Arrays.deepToString(multiArray))

    var array1 = Array(5,{1})
    println("array1 = ${Arrays.toString(array1)}")

    var array2 = Array(5,{ i -> (i + 1) * 3 })
    println("array2 = ${Arrays.toString(array2)}")

    var array3 = Array(5,{})                    // 초기화 안하고 비워두면 그냥 '객체 자리'라고 표시만 해줌 (null 아님)
    println("array3 = ${Arrays.toString(array3)}")

    var nullInitArray = arrayOfNulls<Int>(10)   // null로 만들어주려면.. arrayOfNulls
    println("nullInitArray = ${Arrays.toString(nullInitArray)}")

    println()

    // API
    println("first = ${array2.first()}")
    println("average = ${array2.average()}")
    println("count = ${array2.count()}")

    array2 = array2.plus(5)     // add '5' to the array
    println("array2 = ${Arrays.toString(array2)}")

    var array4 = array2.sliceArray(1..4)    // 잘라서 새로운 배열 만들기
    println("array4 = ${Arrays.toString(array4)}")

    println()

    // Iterator : 반복자(e)(it)
    var array5 = intArrayOf(1,2,3,11,22,33,111,222,333)
    var it : Iterator<Int> = array5.iterator()
    while(it.hasNext()) {
        val e = it.next()
        print("$e ")
    }

    println()

    var array6 = Array(45, { i -> i + 1 })
    array6.shuffle()
    println("array6 = ${Arrays.toString(array6)}")
    var lotto = array6.sliceArray(0..5)
    lotto.sort()                            // 오름차순 asc
    lotto = lotto.sortedArrayDescending()   // 내림차순 desc
    println("lotto = ${Arrays.toString(lotto)}")

    println()

    // Filter
    var fruit = arrayOf("apple", "banana", "grape", "mango", "avocado", "kiwi", "strawberry", "blackberry", "applemango")
    val x = fruit
        .filter { it.startsWith("a")}     // filtering
        .filter { it.contains("apple")}   // .contains('a') 하면 위랑 똑같음
        .sortedBy { it }                        // alphabetical order
        .map { it.uppercase() }
    println(x.toString())
}