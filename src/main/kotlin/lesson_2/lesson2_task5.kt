package lesson_2

import kotlin.math.pow

fun main() {

    val sum = 70000
    val rate = 16.7
    val term = 20
    val result = sum * ((1 + rate / 100)).pow(term)

    println("%.3f".format(result))
}