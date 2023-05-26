package lesson_10

fun main() {
    print("ход игрока: ")
    val playerNumbers = diceRoll()
    println(playerNumbers)

    print("ход компьютера: ")
    val machineNumbers = diceRoll()
    println(machineNumbers)

    if (machineNumbers > playerNumbers) println("Победила бездушная, но удачливая машина")
    else if (machineNumbers == playerNumbers) println("Победила дружба")
    else println("Победило гордое человечество")
}

fun diceRoll(): Int {
    val dice1 = (1..6).random()
    val dice2 = (1..6).random()
    return dice1 + dice2
}