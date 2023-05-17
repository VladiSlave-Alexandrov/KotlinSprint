package lesson_7

fun main() {
    do {
        val smsCode = (1000..9999).random()
        println("Ваш код авторизации: $smsCode")
        print("Введите код авторизации: ")
        val console = readln().toInt()
    } while (smsCode != console)
    println("Добро пожаловать")
}