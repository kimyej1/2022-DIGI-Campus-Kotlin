fun main() {
    println("Hello Kotlin World")
    println("Hello Kotlin World");
    println("Hello Kotlin World 한글 테스트")

    var age = 10;
    println("age = ${age}")

    // JSP custom action
    println("age = $age")               // php 문법이랑도 유사함
    println("age = ${age + 3}")         // print 안에서 연산하는건 코틀린밖에 안됨!

    // Java 문법
    println(age)
    println("age = " + age);

    age = 33
    // php 문법
    println("age PHP = $age");
    println("age PHP = $age + 5");      // print 안에선 보통 다른언어는 요렇게됨, ${age}로 쓰는 습관을 들일 것!

    age = age + 10;                     // type : int 임을 알아서 판단해서 연산해줌
    println("new age = ${age}");

    val salary = 1000                   // val : constant = read only variable (final)
    println("salary = ${salary}")
    println("salary = " + salary)
//    println("salary = " + ${salary})  // print 밖에서는 변수 이름만 쓰기 ($ X)
//    salary = 2000;                    // val 재정의 불가


    var name = "kim";
    println("name = ${name}")

    name = name + "kildong";
    println("name = ${name}")

//    name = 12;                        // ********** 처음 선언할 때 타입이 고정됨 **********
}