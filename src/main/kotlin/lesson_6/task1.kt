package lesson_6

fun main() {
    print("Создайте логин: ")
    val login = readln()


    print("Создайте пароль: ")
    val password = readln()
    println("Регистрация прошла успешно")

    print("Введите логин: ")
    var inputLogin = readln()

    print("Введите пароль: ")
    var inputPassword = readln()

    while ((inputLogin != login) || (inputPassword != password)) {
        println("Неверный логин или пароль.")
        print("Введите логин: ")
        inputLogin = readln()

        print("Введите пароль: ")
        inputPassword = readln()
    }
    print("Авторизация прошла успешно")
}