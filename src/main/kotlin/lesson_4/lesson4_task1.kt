package lesson_4

fun main() {

    val tablesToday = 13
    val tablesTomorrow = 9

    println("Доступность столиков на сегодня: ${tablesToday < NUMBER_OF_TABLES}\n" +
            "Доступность столиков на завтра: ${tablesTomorrow < NUMBER_OF_TABLES}")
}

const val NUMBER_OF_TABLES = 13