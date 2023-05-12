package lesson_4

fun main() {

    val tables = 13
    val tablesToday = 13
    val tablesTomorrow = 9

    println("Доступность столиков на сегодня: ${tablesToday < tables}\n" +
            "Доступность столиков на завтра: ${tablesTomorrow < tables}")
}