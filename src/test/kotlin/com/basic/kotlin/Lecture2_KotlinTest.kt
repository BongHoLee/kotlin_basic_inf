package com.basic.kotlin

internal class Lecture2_KotlinTest

fun main() {
    val str: String? = "ABC"
    str?.length
}

fun startsWithA1(str: String?): Boolean = str?.startsWith("A") ?: throw IllegalArgumentException("null!")


fun startsWithA2(str: String?): Boolean? = str?.startsWith("ABC")

fun startsWithA3(str: String?): Boolean  = str?.startsWith("ABC") ?: false