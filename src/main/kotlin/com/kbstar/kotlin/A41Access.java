package com.kbstar.kotlin;

public class A41Access {
    public static void main(String[] args) {

        // 코틀린 클래스의 컴패니언 객체 접근
        System.out.println(A40KotlinUser.LEVEL);
        A40KotlinUser.login();               // Annotation을 사용할 때 접근
        A40KotlinUser.Companion.login();     // Annotation을 사용하지 않는 접근
    }
}
