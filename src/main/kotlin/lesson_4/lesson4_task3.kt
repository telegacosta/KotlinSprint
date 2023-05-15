package lesson_4

fun main() {

    val isWeatherGood = true
    val isTentOpen = true
    val humidity = 20
    val isNotWinterSeason  = false

    println("Благоприятные ли условия сейчас для роста бобовых? ${
        isWeatherGood && isTentOpen && (humidity == 20) && isNotWinterSeason
    }")
}