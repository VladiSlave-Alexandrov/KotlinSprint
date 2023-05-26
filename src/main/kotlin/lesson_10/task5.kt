package lesson_10

fun main() {
    print("Придумайте логин: ")
    val login = readln()
    val password = passwordGenerator()
    println("Ваш пароль - $password")

    conditionsOfRegistration(login, password)

    userAuthorization(login, password)
}

fun passwordGenerator(): String {
    print("Введите количество символов в генерируемом пароле: ")
    val passwordNumbers = readln().toInt()

    val listOfNumbers = ("0123456789").split("").toMutableList()
    val lostOfCharacters = ("!\"#\$%&'()*+,-./ ").split("")
    listOfNumbers.addAll(lostOfCharacters)
    var password = ""

    for (i in 0 until passwordNumbers) {
        password += (listOfNumbers).random()
    }
    return password
}

fun conditionsOfRegistration(login: String, password: String) {
    if ((login.count() >= MIN_CHARACTER_FOR_REGISTRATION) && (password.count() >= MIN_CHARACTER_FOR_REGISTRATION)) {
        println("Регистрация прошла успешно")
    } else {
        println("Логин или пароль недостаточно длинные")
        return
    }
}

fun userAuthorization(login: String, password: String) {
    var flag = true
    while (flag) {
        print("Введите логин: ")
        val consoleLogin = readln()
        print("Введите пароль: ")
        val consolePassword = readln()

        if (dataVerification(consoleLogin, login) && dataVerification(consolePassword, password)) {
            while (flag) {
                val dataTextMessage = messageAuthorization()
                println("Ваш код из смс - $dataTextMessage, никому его не показывайте")
                print("Введите четырех-значный код из SMS: ")
                val consoleTextMessage = readln()
                flag = !dataVerification(consoleTextMessage, dataTextMessage)
            }
            println("Авторизация прошла успешно")
        } else {
            println("Неверный логин или пароль, повторите попытку")
        }
    }
}

fun dataVerification(consoleData: String, userData: String): Boolean {
    return consoleData == userData
}

fun messageAuthorization(): String = (1000..9999).random().toString()

const val MIN_CHARACTER_FOR_REGISTRATION = 4