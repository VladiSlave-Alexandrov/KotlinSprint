package lesson_11

fun main() {
    val user1 = User(1001, "user1", "user1Nagibator2000", "user1@mail.com")
    val user2 = User(1002, "user2", "user2Nagibator2000", "user2@mail.com")

    println(user1.id)
    println(user2.login)
    println(user1.password)
    println(user2.email)
}