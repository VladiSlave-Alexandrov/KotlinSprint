package lesson_14

open class Ship(
    val name: String,
    val speed: Int,
    val payload: Int,
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
    speed: Int,
    payload: Int,
    val numberOfCranes: Int,
) : Ship(name, speed, payload) {
    fun crane() {
        println("Идет погрузка/разгрузка груза при помощи кранов")
    }
}

class Icebreaker(
    name: String,
    speed: Int,
    val speedInIce: Int,
    payload: Int,
) : Ship(name, speed, payload) {
    fun breakIce() {
        println("Корабль преодолевает лёд")
    }
}

fun main() {
    val ship1 = Ship("Ласточка", 30, 1000)
    ship1.move()
    ship1.freight()
    println()

    val ship2 = CargoShip("Здоровяк", 20, 2000, 12)
    ship2.move()
    ship2.freight()
    ship2.crane()
    println()

    val ship3 = Icebreaker("Пингвин", 22, 20, 900)
    ship3.move()
    ship3.freight()
    ship3.breakIce()
    println()
}