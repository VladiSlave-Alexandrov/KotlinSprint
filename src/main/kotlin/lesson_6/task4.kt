package lesson_6

fun main() {
    val mysteryNumber = (1..9).random()

    var consoleNumber: Int
    var counter = NUMBER_OF_ATTEMPTS
    var flag = true
    while (counter > 0) {
        print("Угадайте число от 1 до 9, включительно: ")
        consoleNumber = readln().toInt()
        counter--
        if (consoleNumber == mysteryNumber) {
            println("Это была великолепная игра!")
            flag = false
            break
        } else println("Неверно, оставшееся количество попыток($counter)")
    }
    if (flag) println("Было загадано число $mysteryNumber")
}

const val NUMBER_OF_ATTEMPTS = 5