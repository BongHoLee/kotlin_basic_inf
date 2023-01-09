package com.basic.kotlin

class Lecture1_Kotlin

fun main() {
    var number1: Long = 10L
    var number3 = 1_000L

    val person = Person("lee")

    val temp = Temp(null)
    println(temp.name?.name ?: "hi")
}

class Person(val name: String)

class Temp (person: Person?) {
    val name = person
}