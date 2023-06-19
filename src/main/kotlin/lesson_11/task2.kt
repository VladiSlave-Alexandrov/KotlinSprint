package lesson_11

class User(
    val id: Int,
    val login: String,
    var password: String,
    val email: String
) {
    var bio: String = ""
    fun fillYourselfInformation() {
        print("Введите информацию о себе: ")
        bio = readln()
    }

    fun displayUserInformation() {
        println("О себе: $bio")
    }

    fun changePassword() {
        while (true) {
            print("Введите старый пароль: ")
            val oldPassword = readln()
            println()
            if (oldPassword == password) {
                print("Придумайте новый пароль: ")
                password = readln()
                println("Пароль успешно изменен :-)")
                break
            } else {
                println("Неверный пароль, попробуйте снова :-( ")
            }
        }
    }

    fun sendMessage(login: String) {
        println("Введите сообщение для пользователя $login: ")
        val message = readln()
        Thread.sleep(3000)
        println(message)
    }
}

fun main() {
    val user1 = User(1001, "user1", "user1Nagibator2000", "user1@mail.com")
    val user2 = User(1002, "user2", "user2Nagibator2000", "user2@mail.com")
    user1.fillYourselfInformation()
    user1.displayUserInformation()
    user1.changePassword()
    user1.sendMessage(user2.login)

}