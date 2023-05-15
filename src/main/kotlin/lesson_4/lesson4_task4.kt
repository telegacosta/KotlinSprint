package lesson_4

fun main() {

    val day = 5

    val armExercise = "Упражнения для рук"
    val legExercise = "Упражнения для ног"
    val backExercise = "Упражнения для спины"
    val absExercise = "Упражнения для пресса"

    val isTrainingToday = day % 2 == 1

    println("""
        $armExercise: $isTrainingToday
        $legExercise: ${!isTrainingToday}
        $backExercise: ${!isTrainingToday}
        $absExercise: $isTrainingToday
    """.trimIndent())
}