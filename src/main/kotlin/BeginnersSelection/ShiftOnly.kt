package org.example.BeginnersSelection

fun main() {
    val inputCount = readLine()!!.toInt()
    val inputValueList = readLine()!!.split(" ").map { it.toInt() }.toMutableList()
    var isOk = true // 初回は実行できるようにする
    var operationCount = 0


    while (isOk) {
        val evenCount = inputValueList.count { it % 2 == 0 }
        isOk = inputCount == evenCount // evenCountがinputCountと同じである時、全てが偶数だったと判断できる

        if (isOk) {
            inputValueList.mapIndexed { index, value ->
                inputValueList[index] = value / 2
            }
            operationCount++
        }
    }

    println(operationCount)
}
