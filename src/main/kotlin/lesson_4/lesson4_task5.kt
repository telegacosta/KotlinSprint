package lesson_4

fun main() {

    println("Есть повреждения корпуса (true/false):")
    val isDamage= readln().toBoolean()
    println("Введите численность экипажа:")
    val numberOfCrew = readln().toInt()
    println("Введите количество ящиков:")
    val numberOfBoxes = readln().toInt()
    println("Благоприятная погода (true/false):")
    val isGoodWeather = readln().toBoolean()

    val condition = (!isDamage &&
            (numberOfCrew in MIN_NUMBER_OF_CREW until MAX_NUMBER_OF_CREW) &&
            (numberOfBoxes > MIN_NUMBER_OF_BOXES)) ||
            (isGoodWeather && (numberOfCrew == MAX_NUMBER_OF_CREW) &&
            (numberOfBoxes > MIN_NUMBER_OF_BOXES))

    println("Можно отправляться: $condition")
}

const val MIN_NUMBER_OF_CREW = 55 // минимальная численность экипажа
const val MAX_NUMBER_OF_CREW = 70 // максимальная численность экипажа
const val MIN_NUMBER_OF_BOXES = 50 // минимальное количество ящиков провизии