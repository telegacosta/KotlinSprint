package lesson_3

fun main() {

    val inputData = "D2-D4;0"

    val list1 = inputData.split(";")
    val list2 = list1[0].split("-")
    val startPosition = list2[0]
    val finalPosition = list2[1]
    val stepNumber = list1[1]

    println(startPosition)
    println(finalPosition)
    println(stepNumber)
}