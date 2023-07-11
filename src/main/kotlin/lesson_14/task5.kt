package lesson_14

import java.lang.Math.sqrt
import kotlin.math.PI

abstract class Figure(val color: String) {
    abstract fun calculateArea(): Double

    abstract fun calculatePerimeter(): Double
}

class Circle(
    color: String,
    val radius: Double,
) : Figure(color) {
    override fun calculateArea(): Double = PI * (radius * radius)

    override fun calculatePerimeter(): Double = 2 * PI * radius
}

class Triangle(
    color: String,
    val sideA: Double,
    val sideB: Double,
    val sideC: Double
) : Figure(color) {
    override fun calculateArea(): Double {
        val halfPerimeter = calculatePerimeter() / 2
        val area = sqrt(halfPerimeter * (halfPerimeter - sideA) * (halfPerimeter - sideB) * (halfPerimeter - sideC))
        return area
    }

    override fun calculatePerimeter(): Double = sideA + sideB + sideC
}

class Rectangle(
    color: String,
    val sideA: Double,
    val sideB: Double
) : Figure(color) {
    override fun calculateArea(): Double = sideA * sideB

    override fun calculatePerimeter(): Double = (sideA * 2) + (sideB * 2)
}

fun main() {
    val circle1 = Circle("Красный", 10.0)
    val circle2 = Circle("Белый", 8.0)
    val triangle1 = Triangle("Красный", 7.0, 5.0, 7.0)
    val triangle2 = Triangle("Белый", 5.0, 5.0, 5.0)
    val rectangle1 = Rectangle("Красный", 5.0, 2.0)
    val rectangle2 = Rectangle("Белый", 3.0, 8.0)
    val figureList = arrayOf(circle1, circle2, triangle1, triangle2, rectangle1, rectangle2)

    areaSum(figureList)
    perimeterSum(figureList)
}

fun areaSum(figureList: Array<Figure>) {
    var areaSum = 0.0
    for (i in figureList) {
        if (i.color == "Красный") areaSum += i.calculateArea()
        else continue
    }
    println(String.format("%.3f", areaSum))
}

fun perimeterSum(figureList: Array<Figure>) {
    var perimeterSum = 0.0
    for (i in figureList) {
        if (i.color == "Красный") perimeterSum += i.calculatePerimeter()
        else continue
    }
    println(String.format("%.1f", perimeterSum))
}