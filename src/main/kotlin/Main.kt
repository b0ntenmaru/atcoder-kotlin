package org.example

fun main() {
    val n = readLine()!!.toInt()
    val inputNums = mutableListOf<Int>()

    for (i in 1..n) {
        inputNums.add(readLine()!!.toInt())
    }

    println(inputNums.sortedDescending().distinct().size)
}
