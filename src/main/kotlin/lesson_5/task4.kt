package lesson_5

fun main() {
    val login = "Batman"
    val password = "password"

    print("Введите логин: ")
    var console = readlnOrNull()
    if (console != login) {
        println("Пользователь с таким именем не найден. Желаете зарегестрироваться?")
    } else {
        print("Введите пароль: ")
        console = readlnOrNull()
        if (console == password) {
            println("Авторизация прошла успешно")
        } else {
            println(message = "Ошибка авторизации")
        }
    }
}