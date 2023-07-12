package lesson_16

class Dice(
    private val randDiceNumb: Int = (1..6).random()
) {
    fun outputNumber() {
        println(randDiceNumb)
    }
}

fun main() {
    val dice = Dice()
    dice.outputNumber()
}