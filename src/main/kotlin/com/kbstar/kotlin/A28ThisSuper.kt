package com.kbstar.kotlin

open class PersonOne
{
    // 부 생성자
    constructor(name : String) {
        println("Person name = ${name}")
    }
    constructor(name : String, age:Int) {
        println("Person name = ${name}, age = ${age}")
    }
}

class Banker: PersonOne {
    constructor(name:String): this(name, 10) {  // this(name) 만 있으면 자기자신을 또부르는거니까...계속 무한루프...
        println("Banker name = ${name}")
    }

    constructor(name:String, age:Int): super(name, age) {
        println("Banker name = ${name}, age = ${age}")
    }
}

class PersonTwo(name:String, out:Unit = println("0. [Main Constructor]")) {
    var name = println("1. [Property] PersonTwo name = ${name}")
    init {
        println("2. [init] PersonTwo init()")
    }
    constructor(name:String, age:Int, out:Unit=println("3. [Secondary Constructor]")) : this(name) {
        println("4. name = ${name}, age = ${age}")
    }
}

fun main() {
    var kim = Banker("Kim")
    /*
        1. call Banker constructor(name)
        2. this(name, 10) -> call Banker constructor(name, age)
        3. super(name, age) -> call PersonOne constructor(name, age)
        4. print 3 -> 2 -> 1
     */
    println("")
    var lee = PersonTwo("Lee", 11)
    // 3 -> 0 -> 1 -> 2 -> 4
}

/*
    Constructor : 초기화 메소드
        1. Class name = Constructor name
        2. Constructor is also a method -> Overloading(O)
        3. No return type
        4. 프로그래머의 의지 반영

    class Car() {
        name,
        age
        public Car() {

        }
        public Car(name) {
            this.name = name
        }
        public Car(name, age) {
            this.name = name
            this.age = age
        }
    }

    class SportsCar extends Car {
        // turbo
        public SportsCar() {}
        public SportsCar("bmw", 1) { super("bmw", 1) 이렇게 지정하지 않으면, 파라미터가 있더라고 디폴트생성자를 호출함 }
        public SportsCar("bmw", 2, true) {}
    }

    // main
    Car taxi = new Car()
    SportsCar bmw = new SportsCar("bmw", 1)
 */

/*
    자바의 접근 권한

    public
    protected
    private
    _______ : package

    Kotlin : public, private, protected, internal
    internal : 같은 정의에 모듈 내부에서 접근 가능
    private : Information Hiding, Data Encapsulation
 */