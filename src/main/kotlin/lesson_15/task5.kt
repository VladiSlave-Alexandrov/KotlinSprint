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
    val numberPasses: Int = 1,
    val cargoQuantity: Int = 2000
) : Movable, TransportationOfPassengers, CargoTransportation {
    override fun transferPassenger() {
        println("$name перевозит $numberPasses человека")
    }

    override fun transferCargo() {
        println("$name перевозит $cargoQuantity тонн груза")
    }
}


class PassengerCar(
    val name: String,
    val numberPasses: Int = 3,
) : Movable, TransportationOfPassengers {
    override fun transferPassenger() {
        println("$name перевозит $numberPasses человека")
    }
}

fun main() {
    val truck = Truck("Биг-бой")
    val car = PassengerCar("Литл-бой")
    truck.move()
    truck.transferPassenger()
    truck.transferCargo()
    car.move()
    car.transferPassenger()
}