package com.basic.kotlin.sec3.lec10

abstract class Animal(
    protected val species: String,
    protected open val legCount: Int
) {
    abstract fun move()
}

