package lesson_4

fun main() {

    val minMass = 35
    val maxMass = 100
    val maxVolume = 100

    var mass = 20
    var volume = 80

    println("Average для груза с весом $mass кг и объемом $volume л: " +
            "${(mass >= minMass) && (mass <= maxMass) && (volume < maxVolume)}")

    mass = 50
    volume = 100

    println("Average для груза с весом $mass кг и объемом $volume л: " +
            "${(mass >= minMass) && (mass <= maxMass) && (volume < maxVolume)}")
}