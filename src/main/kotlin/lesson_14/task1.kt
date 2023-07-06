package lesson_14

class Ship(
    val name: String,
    val speed: Int = 30,
    val payload: Int = 1000,
) {
    fun move() {
        println("Корабль движется со скоростью: $speed узлов")
    }

    fun freight() {
        println("Корабль перевозит: $payload кг груза")
    }
}

fun main() {
    val ship1 = Ship("Ласточка")
    ship1.move()
    ship1.freight()
}