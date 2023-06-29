package lesson_11

class Usser(
    val login: String,
    val password: String,
    val email: String
) {
    var id: Int = 0
}

class Forum() {

    var usserList: MutableList<Usser> = mutableListOf()


    fun newUser(login: String, password: String, email: String): Int {
        val user = Usser(login, password, email)
        usserList.add(user)
        user.id = usserList.indexOf(user)
        return usserList.indexOf(user)
    }

    var messageList: MutableList<String> = mutableListOf()

    fun newMessage(usserId: Int, messageText: String) {
        val message = "($usserId)${usserList.elementAt(usserId).login}: $messageText"
        messageList.add(message)
        //printLastMessage()
    }

    fun printThread() {
        messageList.forEach() {
            println("Mes-Id:${messageList.indexOf(it)}")
            println(it)
            println()
        }
    }

    //var messageId = 0
    //fun printLastMessage() {
    //    while (messageId <= messageList.indexOf(messageList.last())) {
    //        println("Mes-Id:${messageList.indexOf(messageList[messageId])}")
    //        println(messageList[messageId])
    //        println()
    //        messageId++
    //    }
    //}
}

fun main() {
    val forum = Forum()
    forum.newUser("Batman", "12345", "batman@mail.ru")
    forum.newUser("SpiderMan", "54321", "spiderman@mail.ru")

    forum.newMessage(0, "Привет")
    forum.newMessage(1, "Здравствуй")
    forum.newMessage(0, "Я фанат DC")
    forum.newMessage(1, "Я фанат Marvel")
    forum.printThread()


}