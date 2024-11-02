package org.example.BeginnersSelection

fun main() {
    val A = readLine()!!.toInt() // 500円
    val B = readLine()!!.toInt() // 100円
    val C = readLine()!!.toInt() // 50円
    val X = readLine()!!.toInt() // 合計

    var count = 0

    for (i in 0..A) {

        for (j in 0..B) {

            for(k in 0..C) {
                val total = (i * 500) + (j * 100) + (k * 50)

                if (X == total) {
                    count++
                }

            }
        }
    }

    println(count)
}
