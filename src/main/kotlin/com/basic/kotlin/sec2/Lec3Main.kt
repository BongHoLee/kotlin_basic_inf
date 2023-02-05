package com.basic.kotlin.sec2

fun main() {
    rangeCalc(1, 10, 2)
}

private fun convFor() {
    val numbers = listOf(1L, 2L, 3L)
    for (number in numbers) {
        println(number)
    }

    for (i in 1..3) {
        println(i)
    }

    for (i in 3 downTo 1) {
        println(i)
    }

    for (i in 1..5 step 2) {
        println(i)
    }

    for (i in 3 downTo 1 step 2) {
        println(i)
    }
}

fun rangeCalc(start: Int, last: Int, _step: Int) {
    val range = IntRange(start, last)
    val progression = range.step(_step)

    for (i in progression) {
        println(progression)
    }
}
