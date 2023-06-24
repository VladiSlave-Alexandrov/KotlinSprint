package lesson_11

class Rooms(
    val name: String,
    val cover: String,
) {
    lateinit var participantsList: List<Participants>

}

fun showRooms(roomList: Array<Rooms>) {
    for (i in roomList) {
        println(i.name)
        println(i.cover)
        showUserList(i.participantsList)
        println()
    }
    println()
    println()
}

fun showUserList(participantsList: List<Participants>) {

    participantsList.forEach() {
        var microphoneStatus = ""
        when (it.microphoneStatusCode) {
            1 -> microphoneStatus = "(Разговаривает)"
            2 -> microphoneStatus = "(Микрофон выключен)"
            3 -> microphoneStatus = "(Пользователь заглушен)"
        }
        print("${it.avatar} - $microphoneStatus")
        println()
    }
}

class Participants(
    val nickName: String,
    var microphoneStatusCode: Int,
    val avatar: String
) {
    fun showUserNickname() {
        println(nickName)
    }
}

fun main() {
    val user1 = Participants("User1", 1, "Слоник")
    val user2 = Participants("User2", 2, "Кошечка")
    val user3 = Participants("User3", 3, "Собачка")


    val communicationRooms = Rooms("communication", "Символ \"облако\"")
    communicationRooms.participantsList = listOf(user1, user2, user3)
    user1.showUserNickname()

    val user4 = Participants("User4", 1, "Бэтмен")
    val user5 = Participants("User4", 1, "Человек-Паук")

    val gameRooms = Rooms("Games", "Символ \"гемпад\"")
    gameRooms.participantsList = listOf(user4, user5)

    var roomList = arrayOf(communicationRooms, gameRooms)
    showRooms(roomList)
    user1.showUserNickname()
    user5.showUserNickname()


}