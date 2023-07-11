package lesson_16

class Circle(private val radius: Double) {
    private val pi = 3.14
    fun circleLength(): Double = 2 * pi * radius

    fun circleArea(): Double = pi * radius * radius
}

fun main() {
    val circle = Circle(5.0)
    println(circle.circleLength())
    println(circle.circleArea())
}