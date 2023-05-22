package lesson_6

fun main() {
    val mysteryNumber = (1..9).random()

    var consoleNumber: Int
    var counter = NUMBER_OF_ATTEMPTS

    do {
        print("Угадайте число от 1 до 9, включительно: ")
        consoleNumber = readln().toInt()
        counter--

        if (consoleNumber == mysteryNumber) {
            println("Это была великолепная игра!")
            break
        } else if (counter == 0) {
            println("Было загадано число $mysteryNumber")
            break
        }
        println("Неверно, оставеешся количество попыток($counter)")
    } while (counter != 0)

}

const val NUMBER_OF_ATTEMPTS = 5