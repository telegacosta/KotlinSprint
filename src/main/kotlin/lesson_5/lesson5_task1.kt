package lesson_5

fun main() {

    val number1 = (1..100).random()
    val number2 = (1..100).random()

    println("Решите математический пример:")
    print("$number1 + $number2 = ")

    val sum = readln().toInt()
    val isSumRight = sum == number1 + number2

    if (isSumRight)
        println("Добро пожаловать!")
    else
        println("Доступ запрещен.")
}