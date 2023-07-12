package lesson_16

import kotlin.math.pow

class Circle(private val radius: Double) {

    fun circleLength(): Double = 2 * pi * radius

    fun circleArea(): Double = pi * radius.pow(2)

    companion object {
        private const val pi = 3.14
    }
}

fun main() {
    val circle = Circle(5.0)
    println(circle.circleLength())
    println(circle.circleArea())
}