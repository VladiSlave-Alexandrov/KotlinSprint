package lesson_15

interface Flight {
    fun fly() {
        println("Летит")
    }
}

interface Swimming {
    fun swim() {
        println("Плывет")
    }
}

class CrucianCarp : Swimming {}
class Seagull : Flight {}
class Duck : Flight, Swimming {}

fun main() {
    val carp = CrucianCarp()
    carp.swim()

    val seagull = Seagull()
    seagull.fly()

    val duck = Duck()
    duck.swim()
    duck.fly()
}