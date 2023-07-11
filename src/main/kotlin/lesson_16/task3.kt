package lesson_16

class User(
    val login: String,
    private val password: String
) {
    fun logIn() {
        print("Введите логин: ")
        val strLog = readln()
        print("Введите пароль: ")
        val strPass = readln()

        if ((strLog == login) && (strPass == password)) println("Неверные данные")
        else println("Добро пожаловать")
    }
}

fun main() {
    val user = User("мегатрон", "12345")
    user.logIn()
}