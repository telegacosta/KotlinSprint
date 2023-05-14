package lesson_5

fun main() {

    val rightNumber1 = (1..100).random()
    val rightNumber2 = (1..100).random()

    println("Введите первое число от 1 до 100:")
    val enteredNumber1 = readln().toInt()

    println("Введите второе число от 1 до 100:")
    val enteredNumber2 = readln().toInt()

    val isNumber1Guessed = enteredNumber1 == rightNumber1
    val isNumber2Guessed = enteredNumber2 == rightNumber2

    if (isNumber1Guessed && isNumber2Guessed)
        println("Поздравляем! Вы выиграли главный приз!")
    else if (isNumber1Guessed || isNumber2Guessed)
        println("Вы выиграли утешительный приз!")
    else println("Неудача! Крутите барабан!")

    println("Выигрышные числа: $rightNumber1 и $rightNumber2")
}