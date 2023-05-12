package lesson_3

fun main() {

    var step = 1
    var start = "E2"
    var final = "Е4"
    var move = "$start-$final;$step"

    println(move)

    step++
    val number = 2
    start = "D$number"
    final = "D${number + 1}"
    move = "$start-$final;$step"

    println(move)
}