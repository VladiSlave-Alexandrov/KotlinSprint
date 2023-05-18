package lesson_6

fun main() {
    var counter = NUMBER_OF_ATTEMPS_TO_ENTER
    while (counter > 0) {
        val a = (1..9).random()
        val b = (1..9).random()
        print("Докажите что вы не робот, решив пример: $a + $b = ")
        val solution = readln().toInt()
        counter--
        if (solution == (a + b)) {
            println("Добро пожаловать")
            counter = 0
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
        } else if (counter != 0) {
            println("Неверно")
        } else {
            println("Доступ запрещен")
        }
    }
}

const val NUMBER_OF_ATTEMPS_TO_ENTER = 3