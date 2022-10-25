package com.lannstark.lec04

fun main() {

    val money1 = JavaMoney(2_000)
    val money2 = JavaMoney(1_000)

    if (money1 > money2) {
        println("Money1이 Money2보다 큽니다.")
    }

    val money3 = JavaMoney(1_000L)
    val money4 = money3
    val money5 = JavaMoney(1_000L)
    println(money3 == money5)

    if(fun2() && fun1()) {
        println("본문")
    }
}

fun fun1(): Boolean {
    println("fun1")
    return true
}

fun fun2(): Boolean {
    println("fun2")
    return false
}