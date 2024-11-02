package org.example.BeginnersSelection

fun main() {
    val input = readLine()!!
    val count = input.count { it == '1' }

    println(count)
}