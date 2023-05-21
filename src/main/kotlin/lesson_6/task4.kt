package lesson_6

fun main() {
    val mysteryNumber = (1..9).random()

    var consoleNumber: Int
    var counter = NUMBER_OF_ATTEMPTS
    while (counter > 0) {
        print("Угадайте число от 1 до 9, включительно: ")
        consoleNumber = readln().toInt()
        counter--
        if (consoleNumber == mysteryNumber) {
            println("Это была великолепная игра!")
            break
        } else if (counter != 0) {
            println("Неверно, оставшееся количество попыток($counter)")
        } else {
            println("Было загадано число $mysteryNumber")
        }
    }
}

const val NUMBER_OF_ATTEMPTS = 5