package lesson_5

fun main() {

    val rightNumber1 = 12
    val rightNumber2 = 39

    println("Введите первое число:")
    val enteredNumber1 = readln().toInt()

    println("Введите второе число:")
    val enteredNumber2 = readln().toInt()

    val isNumber1Guessed = enteredNumber1 == rightNumber1
    val isNumber2Guessed = enteredNumber2 == rightNumber2

    if (isNumber1Guessed && isNumber2Guessed)
        println("Поздравляем! Вы выиграли главный приз!")
    else if (isNumber1Guessed || isNumber2Guessed)
        println("Вы выиграли утешительный приз!")
    else println("Неудача! Крутите барабан!")
}