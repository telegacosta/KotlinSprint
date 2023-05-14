package lesson_4

fun main() {

    val minNumberOfCrew = 55 // минимальная численность экипажа
    val maxNumberOfCrew = 70 // максимальная численность экипажа
    val minNumberOfBoxes = 50 // минимальное количество ящиков провизии

    println("Есть повреждения корпуса (true/false):")
    val isDamage= readln().toBoolean()
    println("Введите численность экипажа:")
    val numberOfCrew = readln().toInt()
    println("Введите количество ящиков:")
    val numberOfBoxes = readln().toInt()
    println("Благоприятная погода (true/false):")
    val isGoodWeather = readln().toBoolean()

    val condition = (!isDamage && (numberOfCrew in minNumberOfCrew until maxNumberOfCrew)
            && (numberOfBoxes > minNumberOfBoxes))
            || (isGoodWeather && (numberOfCrew == maxNumberOfCrew)
            && (numberOfBoxes > minNumberOfBoxes))

    println("Можно отправляться: $condition")
}