package lesson_5

fun main() {

    val number1 = 12
    val number2 = 39

    println("Введите первое число:")
    val enteredNumber1 = readln().toInt()

    println("Введите второе число:")
    val enteredNumber2 = readln().toInt()

    val isNumber1Guessed = (enteredNumber1 == number1) || (enteredNumber2 == number1)
    val isNumber2Guessed = ((enteredNumber1 == number2) || (enteredNumber2 == number2))
            && (enteredNumber1 != enteredNumber2)

    if (isNumber1Guessed && isNumber2Guessed)
        println("Поздравляем! Вы выиграли главный приз!")
    else if (isNumber1Guessed || isNumber2Guessed)
        println("Вы выиграли утешительный приз!")
    else println("Неудача! Крутите барабан!")
}