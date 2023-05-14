package lesson_3

fun main() {

    val inputData = "D2-D4;0"

    val list = inputData.split("-", ";")
    val startPosition = list[0]
    val finalPosition = list[1]
    val stepNumber = list[2]

    println(startPosition)
    println(finalPosition)
    println(stepNumber)
}