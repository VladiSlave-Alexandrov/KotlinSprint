package lesson_14

open class Ship(
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

class CargoShip(
    name: String,
    speed: Int = 25,
    payload: Int = 2000,
) : Ship(name, speed, payload) {}

class Icebreaker(
    name: String,
    speed: Int = 28,
    payload: Int = 900,
) : Ship(name, speed, payload) {
    fun breakIce() {
        println("Корабль преодолевает лёд")
    }
}

fun main() {
    val ship1 = Ship("Ласточка")
    ship1.move()
    ship1.freight()

    val ship2 = CargoShip("Победа")
    ship2.speed

    val ship3 = Icebreaker("Снежинка")
    ship3.payload
    ship3.breakIce()
}