package lesson_15

abstract class Message(val text: String) {
    open fun sendMessage() {}
    fun connectToServer() {
        println("Идёт подключение к серверу подождите")
    }
}

class TemperatureMessage(text: String) : Message(text) {
    override fun sendMessage() {
        println("Температура: $text")
    }
}

class PrecipitationMessage(text: String) : Message(text) {
    override fun sendMessage() {
        println("Количество осадков: $text")
    }
}

fun main() {
    val temperatureMessage = TemperatureMessage("-15")
    temperatureMessage.connectToServer()
    temperatureMessage.sendMessage()

    val precipitationMessage = PrecipitationMessage("500 mm")
    precipitationMessage.connectToServer()
    precipitationMessage.sendMessage()
}