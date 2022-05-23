package com.kbstar.kotlin

// 사용자 예외 클래스 만들기
class TestException(messages : String) : java.lang.Exception(messages)

fun main() {
    // 이름에 숫자 들어갔는지 체크하기
    var name = "Kdhong111"

    try {
        validateName(name)
    } catch (e:java.lang.Exception) {
        println("예외발생 : " + e.message)
    }

    // mobile 입력받아서 010-1111-2222 형식인지 체크하기
    var mobile = "010-1111-1111"

    try {
        validateMobile(mobile)
    } catch (e:java.lang.Exception) {
        println("예외발생 : " + e.message)
    }

    // 한글이름 검증
    var koName = "김예지"

    try {
        validateKorean(koName)
    } catch(e:java.lang.Exception) {
        println("예외발생 : " + e.message)
    }

}

fun validateName(name : String) {
    if(name.matches(Regex("[a-zA-Z]{1,10}"))) {    // matches : regex 사용해서 검사
        println("정상이름")
    } else {
        throw TestException("Name has Number!")
    }
}

fun validateMobile(mobile : String) {
    if(mobile.matches(Regex("^01[01]-[0-9]{4}-\\d{4}$"))) {
        println("정상번호")
    } else {
        throw TestException("Invalid mobile number!")
    }
}

fun validateKorean(name : String) {
    if(name.matches(Regex("^[가-힣]{2,4}$"))) {
        println("정상한글이름")
    } else {
        throw TestException("Invalid Korean Name!")
    }
}