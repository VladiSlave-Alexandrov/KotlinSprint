package lesson_15

interface Movable {
    fun move() {
        println("Машина едет")
    }
}

interface TransportationOfPassengers {
    fun transferPassenger() {}
}

interface CargoTransportation {
    fun transferCargo() {}
}

class Truck(
    val name: String,
    val numberPasses: Int,
    val cargoQuantity: Int
) : Movable, TransportationOfPassengers, CargoTransportation {
    private val maxNumberPasses = 1
    private val maxCargoQuantity = 2000
    override fun transferPassenger() {
        if (numberPasses <= maxNumberPasses) println("$name перевозит $numberPasses человека")
        else println("Нарушение норм транспортировки")
    }

    override fun transferCargo() {
        if (cargoQuantity <= maxCargoQuantity) println("$name перевозит $cargoQuantity тонн груза")
        else println("Нарушение норм транспортировки")
    }
}

class PassengerCar(
    val name: String,
    val numberPasses: Int,
) : Movable, TransportationOfPassengers {
    private val maxNumberPasses = 3
    override fun transferPassenger() {
        if (numberPasses <= maxNumberPasses) println("$name перевозит $numberPasses человека")
        else println("Нарушение норм транспортировки")
    }
}

fun main() {
    val truck = Truck("Биг-бой", 1, 2000)
    val car = PassengerCar("Литл-Бой", 3)
    val car2 = PassengerCar("Литл-Бой-Младшенький", 2)
    truck.move()
    truck.transferPassenger()
    truck.transferCargo()
    car.move()
    car.transferPassenger()
    car2.move()
    car2.transferPassenger()
}