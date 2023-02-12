package com.basic.kotlin.sec3.lec10.temp
open class BaseClass(open var name: String) {
    init {
        println("BaseClass init block, name: $name")
    }
}

class SubClass(override var name: String, val age: Int) : BaseClass(name) {
    init {
        println("SubClass init block, name: $name, age: $age")
    }
}

fun main() {
    val instance = SubClass("John", 30)
}