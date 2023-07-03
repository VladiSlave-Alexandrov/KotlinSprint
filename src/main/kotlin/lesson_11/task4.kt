package lesson_11

class Contact(
    var firstName: String,
    val messageIcon: String = "message_Icon.png",
    val callIcon: String = "Call_Icon.png",
    val videoCallIcon: String = "Video_Call_Icon.png",
    val emailIcon: String = "Email_Icon.png",
    val faceTimeIconCall: String = "Face_Time_Call_Icon",
    val faceTimeIconVideoCall: String = "Face_Time_Video_Call_Icon"
) {
    var avatar = ""
    var secondName = ""
    var mobileNumber = ""
    var homeNumber = ""
    var iCloudMail = ""
    var closePeopleParentage: List<String> = mutableListOf()
    var closePeopleName: List<String> = mutableListOf()

    fun writeMessage() {
        println("Перейти на страницу написания сообщения")
    }

    fun call() {
        println("Совершение звонка")
    }

    fun videoCall() {
        println("Совершение Видео-звонка")
    }

    fun contactByEmail() {
        println("Перейти на страницу написания сообщения на Email")
    }

    fun pinCloseContact(closePeopleParentage: MutableList<String>, closePeopleName: MutableList<String>) {
        print("Значение иерархии отношений: ")        // :-)
        val newClosePeopleParentage = readln()
        closePeopleParentage.add(newClosePeopleParentage)
        println()
        print("Имя: ")
        val newClosePeopleName = readln()
        closePeopleName.add(newClosePeopleName)
    }

    fun faceTimeCall() {
        println("Совершение звонка по FaceTime")
    }

    fun faceTimeVideoCall() {
        println("Совершение видео-звонка по FaceTime")
    }
}

fun main() {
    val contact1 = Contact("First Name")
    contact1.secondName = "Second Name"
    contact1.avatar = "Mouse.png"
    contact1.mobileNumber = "8(999)999-42-42"
    contact1.homeNumber = "8(999)888-42-42"
    contact1.iCloudMail = "mail@mail.ru"
    contact1.closePeopleParentage = listOf("жена", "подруга", "подруга")
    contact1.closePeopleName = listOf("userName", "userName", "userName")
}