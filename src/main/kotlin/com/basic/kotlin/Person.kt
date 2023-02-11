package com.basic.kotlin

fun main() {
    val person = Person("lee", 100)

    person.age = 10
    println(person.name)
}

class Person {
    var age: Int

    constructor(name: String, age: Int) {
        this.age = age
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
        this.name = name
    }

    constructor(name: String) : this(name, 10)

    val isAdult: Boolean
        get() = this.age >= 20

    // custom getter backing field - get() 무한 재귀 방지
    val name: String
        get() = field.uppercase()
}
