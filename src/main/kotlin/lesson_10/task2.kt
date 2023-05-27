package lesson_10

fun main() {
    print("Придумайте логин: ")
    val login = readln()

    print("Придумайте пароль: ")
    val password = readln()

    println(verifyRegistration(login, password))
}

fun verifyRegistration(login: String, password: String): String {
    return if ((login.count() >= MIN_CHARACTER_FOR_REGISTRATION) && (password.count() >= MIN_CHARACTER_FOR_REGISTRATION)) {
        "Регистрация прошла успешно"
    } else {
        "Логин или пароль недостаточно длинные"
    }
}

const val MIN_CHARACTER_FOR_REGISTRATION = 4