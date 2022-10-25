package com.lannstark.lec02

import java.lang.IllegalArgumentException

fun main() {
    val str: String? = null
    println(str?.length) //safe call null이 아닐 경우만 호출해줘
    println(str?.length ?: 0) //엘비스연산자

    println(startWith(null))
    val person = Person("하하")
    startWithA(person.name)

}
fun startWithA(str: String): Boolean {
    return str.startsWith("A")
}

fun startsWithA1(str: String?): Boolean {
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("")
}

fun startWithA2(str: String): Boolean? {
    return str?.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
    return str?.startsWith("A")
        ?: false
}

fun startWith(str: String?): Boolean {
    return str!!.startsWith("A") //절대 null이 아니다. 단언
}