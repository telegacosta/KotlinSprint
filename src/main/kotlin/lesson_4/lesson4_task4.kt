package lesson_4

fun main() {

    val day = 5

    val armExercise = "Упражнения для рук"
    val legExercise = "Упражнения для ног"
    val backExercise = "Упражнения для спины"
    val absExercise = "Упражнения для пресса"

    val IsTrainingToday = day % 2 == 1

    println("""
        $armExercise: $IsTrainingToday
        $legExercise: ${!IsTrainingToday}
        $backExercise: ${!IsTrainingToday}
        $absExercise: $IsTrainingToday
    """.trimIndent())
}