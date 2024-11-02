package org.example.BeginnersSelection

fun main() {
    val (n, a, b) = readLine()!!.split(" ").map { it.toInt() }
    val matchList = mutableListOf<Int>()

    for (num in 1..n) {
        val numTotal = num.toString().map { it.digitToInt() }.sum() // 格桁の和 20なら 2 + 0 = 2

        if (a <= numTotal && numTotal <= b) {
            matchList.add(num)
        }
    }

    println(matchList.sum())
}