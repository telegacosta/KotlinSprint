package lesson_5

fun main() {

    println("Введите логин:")
    val login = readln()

    val loginVerification = login == "Batman"

    if (!loginVerification)
        println("Пользователя с таким логином не существует, зарегистрируйтесь")
    else {
        println("Введите пароль:")
        val password = readln()
        val passwordVerification = password == "password"
        if (!passwordVerification)
            println("Ошибка авторизации")
        else println("Здравствуйте!")
    }
}