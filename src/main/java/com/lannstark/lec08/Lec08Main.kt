package com.lannstark.lec08

fun main() {

    repeat("hello", useNewLine = false)
    printNameAndGender(gender = "FEMALE", name = "cd")

    printAll("A", "B", "C")

    val array = arrayOf("A", "B", "C")
    printAll(*array)

}

fun max(a: Int, b: Int): Int = if (a > b) a else b

fun repeat(
    str: String,
    num: Int = 3,
    useNewLine: Boolean = true
) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}


fun printNameAndGender(name: String, gender: String) {
    println("name = ${name}")
    println("gender = ${gender}")
}

fun printAll(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}