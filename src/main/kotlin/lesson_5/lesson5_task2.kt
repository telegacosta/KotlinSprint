package lesson_5

import java.time.LocalDateTime

fun main() {

    val currentYear = LocalDateTime.now().year

    println("Введите год рождения:")
    val age = currentYear - readln().toInt()

    val resultText = if (age >= AGE_OF_MAJORITI) "Показать экран со скрытым контентом"
    else if (age in 16 .. 17) "Показать экран с ограниченным контентом"
    else "Вернуться на главный экран"

    println(resultText)
}

const val AGE_OF_MAJORITI = 18