package com.basic.kotlin

fun main() {
    val number1 = 3
    val number2: Long = 3 + number1.toLong()

    val n1: Int? = 3
    val n2: Long = n1?.toLong() ?: 0L
}

fun printAgeIfPerson(obj: Any) {
    if (obj is Person) {
        println(obj.name)
    }
}

fun printAgeIfPerson2(obj: Any?) {
    val person = obj as? Person
    println(person?.name)
}

fun interpolation() {

}