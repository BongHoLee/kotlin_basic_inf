package com.basic.kotlin.sec3

fun main() {
    val person = Person("lee", 100)

    person.age = 10
    println(person.name)
}

class Person(
    name: String,
    var age: Int
) {
    // 생성자가 호출되는 시점(객체 생성 시점)에 한 번 호출되는 init block
    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
    }

    constructor(name: String) : this(name, 10)

    val isAdult: Boolean
        get() = this.age >= 20

    // custom getter backing field - get() 무한 재귀 방지
    val name: String = name
        get() = field.uppercase()
}
