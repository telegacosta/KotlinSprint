package lesson4

fun main() {

    val IsWeatherGood = true
    val isTentOpen = true
    val humidity = 20
    val isNotWinterSeason  = false

    println("Благоприятные ли условия сейчас для роста бобовых? ${
        IsWeatherGood && isTentOpen && (humidity == 20) && isNotWinterSeason
    }")
}