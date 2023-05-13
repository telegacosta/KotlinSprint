package lesson_4

fun main() {

    println("Есть повреждения корпуса (true/false):")
    val damage= readln().toBoolean()
    println("Введите численность экипажа:")
    val numberOfCrew = readln().toInt()
    println("Введите количество ящиков:")
    val numberOfBoxes = readln().toInt()
    println("Благоприятная погода (true/false):")
    val goodWeather = readln().toBoolean()

    val condition = (!damage && (numberOfCrew in 55 until 70) && (numberOfBoxes > 50)) ||
            (goodWeather && (numberOfCrew == 70) && (numberOfBoxes > 50))

    println("Можно отправляться: $condition")
}