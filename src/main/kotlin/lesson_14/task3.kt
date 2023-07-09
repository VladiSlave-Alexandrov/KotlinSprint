package lesson_14

open class Message(
    val text: String,
    val ownerName: String,
) {
    open fun printMessage() {
        println(
            """
            Автор: $ownerName
            $text
        """.trimIndent()
        )
    }
}

class Commentary(
    text: String,
    ownerName: String,
    val messageInfo: String
) : Message(text, ownerName) {
    override fun printMessage() {
        println()
        println("[$messageInfo]")
        super.printMessage()
    }
}

fun main() {
    val message1 = Message("Как победить Безымянного Короля?", "SuperPenguin228")
    message1.printMessage()
    val commentary1 = Commentary("я хз чет, сложный босс", "Какой то чел", message1.text)
    commentary1.printMessage()
}