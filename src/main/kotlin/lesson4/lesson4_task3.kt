package lesson4

fun main() {

    val weather = "солнечная"
    val tent = "раскрыт"
    val humidity = 20
    val exceptionSeason  = "зима"

    val weatherToday = "солнечная"
    val tentToday = "раскрыт"
    val humidityToday = 20
    val seasonToday = "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? ${(weatherToday == weather) 
            && (tentToday == tent) 
            && (humidityToday == humidity) 
            && (seasonToday != exceptionSeason)}")
}