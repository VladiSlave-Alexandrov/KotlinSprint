package lesson_10

fun main() {
    var winCounter = 0
    do {
        print("ход игрока: ")
        val playerNumbers = diceRoll()
        println(playerNumbers)

        print("ход компьютера: ")
        val machineNumbers = diceRoll()
        println(machineNumbers)

        if (machineNumbers > playerNumbers) println("Победила бездушная, но удачливая машина")
        else if (machineNumbers == playerNumbers) println("Победила дружба")
        else {
            println("Победило гордое человечество")
            winCounter++
        }
    } while (continueRound(winCounter))
}

fun diceRoll(): Int {
    val dice1 = (1..6).random()
    val dice2 = (1..6).random()
    return dice1 + dice2
}

fun continueRound(winCounter: Int): Boolean {
    println("Хотите бросить кости еще раз? Введите Да или Нет")
    val answer = readln().replaceFirstChar { it.uppercase() }
    if (answer == "Да") return true
    else {
        println("Человечество победило $winCounter раз(а)")
        return false
    }
}