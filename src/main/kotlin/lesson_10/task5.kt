package lesson_10

fun main() {
    print("Придумайте логин: ")
    val login = readln()
    val password = generatePassword()
    println("Ваш пароль - $password")

    if (checkLengthData(login, password)) logIn(login, password)
    else return
}

fun generatePassword(): String {
    print("Введите количество символов в генерируемом пароле: ")
    val passwordNumbers = readln().toInt()
    val allOfCharacters = ' '..'9'
    var password = ""
    for (i in 1..passwordNumbers) {
        password += (allOfCharacters).random()
    }
    return password
}

fun checkLengthData(login: String, password: String): Boolean {
    if ((login.count() >= MIN_CHARACTER_FOR_REGISTRATION) && (password.count() >= MIN_CHARACTER_FOR_REGISTRATION)) {
        println("Регистрация прошла успешно")
        return true
    } else {
        println("Логин или пароль недостаточно длинные")
        return false
    }
}

fun logIn(login: String, password: String) {
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