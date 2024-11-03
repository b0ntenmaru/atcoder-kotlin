package org.example.BeginnersSelection

fun main() {
    val (n, y) = readLine()!!.split(" ").map { it.toInt() }

    for (i in 0..n) {
        for (j in 0..n) {
            val c = n - (i + j)

            if (c >= 0 && i * 10000 + j * 5000 + 1000 * c == y) {
                println("$i $j $c")
                return
            }
        }
    }

    println("-1 -1 -1")
}