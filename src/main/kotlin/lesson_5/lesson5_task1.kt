package lesson_5

fun main() {

    println("Введите число №1:")
    val number1 = readln().toInt()

    println("Введите число №2:")
    val number2 = readln().toInt()

    println("Введите сумму чисел №1 и №2:")
    val sum = readln().toInt()

    val rightSum = number1 + number2

    if (sum == rightSum)
        println("Добро пожаловать!")
    else
        println("Доступ запрещен.")
}