package com.basic.kotlin.sec3.lec10

open class Base(
    open val number: Int
) {
    init {
        println("Base Class")
        println(number)
    }
}

class Derived(
    number: Int
) : Base(number) {

    init {
        println("Derived Class")
        println(number)
    }
}

fun main() {
    Derived(10)
}

