package lesson_15

abstract class User(
    val name: String,
) {
    fun readMessage() {
        println("$name Читает сообщение")
    }

    fun writeMessage() {
        println("$name Добавляет новое сообщение")
    }
}

class StandardUser(
    name: String
) : User(name) {}

class Administrator(
    name: String,
) : User(name) {
    fun deleteMessage() {
        println("$name удалил это сообщение")
    }

    fun banUser(userName: StandardUser) {
        println("$name забанил пользователя под ником: ${userName.name}")
    }
}

fun main() {
    val user = StandardUser("Кто то")
    val admin = Administrator("Любимый Админчик")
    user.readMessage()
    user.writeMessage()
    admin.readMessage()
    admin.deleteMessage()
    admin.banUser(user)


}
