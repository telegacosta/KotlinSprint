package lesson_1

fun main() {

    val timeInSeconds = 6480
    val minutes = timeInSeconds / 60
    val seconds = timeInSeconds % 60
    val time = String.format("%d:%02d", minutes, seconds)

    println(time)
}