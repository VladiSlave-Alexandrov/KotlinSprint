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

        if ((strLog == login) && (verificationPass(strPass))) println("Добро пожаловать")
        else println("Неверные данные")
    }

    private fun verificationPass(strPass: String): Boolean = strPass == password
}

fun main() {
    val user = User("мегатрон", "12345")
    user.logIn()
}