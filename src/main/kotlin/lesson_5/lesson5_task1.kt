package lesson_5

fun main() {

    val number1 = (1..100).random()
        println("Число №1: $number1")

    val number2 = (1..100).random()
        println("Число №2: $number2")

    println("Введите сумму чисел №1 и №2:")
    val sum = readln().toInt()

    val isSumRight = sum == number1 + number2

    if (isSumRight)
        println("Добро пожаловать!")
    else
        println("Доступ запрещен.")
}