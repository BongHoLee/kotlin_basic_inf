package com.basic.kotlin.sec3.lec10

open class Base(
    open var number: Int = 100
) {
    init {
        println("Base Class")
        println(number)
        number = 200
        println(number)
    }
}

class Derived(
    override var number: Int
) : Base(number) {

    init {
        println("Derived Class")
        println(number)
    }
}

fun main() {
    Derived(10)
}

