package lesson_10

fun main() {
    print("Придумайте логин: ")
    val login = readln()

    print("Придумайте пароль: ")
    val password = readln()

    conditionsOfRegistration(login, password)
}

fun conditionsOfRegistration(login: String, password: String) {
    if ((login.count() >= MIN_CHARACTER_FOR_REGISTRATION) && (password.count() >= MIN_CHARACTER_FOR_REGISTRATION)) {
        println("Регистрация прошла успешно")
    } else {
        println("Логин или пароль недостаточно длинные")
    }
}

const val MIN_CHARACTER_FOR_REGISTRATION = 4