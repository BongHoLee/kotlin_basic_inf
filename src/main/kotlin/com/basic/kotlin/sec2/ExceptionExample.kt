package com.basic.kotlin.sec2

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

fun main() {
}

fun parseIntOrThrow(str: String): Int? {
    return try {
        str.toInt()
    } catch (e: NumberFormatException) {
        null
    }
}

fun readFile() {
    val currentFile = File(".")
    val file = File("${currentFile.absolutePath}/a.txt")
    val reader = BufferedReader(FileReader(file))
    println(reader.readLine())
    reader.close()
}

fun readFileWithUse(path: String) {
    BufferedReader(FileReader(path)).use { reader ->
        println(reader.readLine())
    }
}
