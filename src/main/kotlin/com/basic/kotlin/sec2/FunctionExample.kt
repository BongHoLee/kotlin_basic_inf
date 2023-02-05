package com.basic.kotlin.sec2

fun max(a: Int, b: Int) = if (a > b) a else b

fun repeat(str: String, count: Int, useNewLine: Boolean = true) {
    for (i in 1..count) {
        when {
            useNewLine -> println(str)
            else -> print(str)
        }
    }
}
