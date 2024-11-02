package org.example.BeginnersSelection

fun main() {
    val n = readLine()!!.toInt()
    val inputNums = readLine()!!.split(" ").map { it.toInt() }.sortedDescending()

    var alicePoint = 0
    var bobPoint = 0

    inputNums.forEachIndexed { index, value ->
        if (index == 0 || index % 2 == 0) {
            alicePoint += value
        } else {
            bobPoint += value
        }
    }

    println(alicePoint - bobPoint)
}
