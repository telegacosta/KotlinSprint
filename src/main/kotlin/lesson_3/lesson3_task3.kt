package lesson_3

fun main() {

    val number = readln().toInt()

    if (number in 1..9){
        for (index in 1..9)
            println("${number}x$index=${number * index}")
    }
    else println("Введите число от 1 до 9")
}