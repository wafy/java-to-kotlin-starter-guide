package com.lannstark.lec03

import java.time.Period

fun main() {
    val number1: Int? = 3
    val number2: Long = number1?.toLong() ?: 0L
    val person = Person("이름", 10)

    print("이름: ${person.age}")
    val name = "호순이"

  val str =   """
        ABC
        FEFG
        ${name}
    """.trimIndent()
    println(str)

    val str2 = "ABC"
    println(str2[0])
}

fun printAgeIfPerson(obj: Any?) {
    val person = obj as? Person
    print(person?.age)
}