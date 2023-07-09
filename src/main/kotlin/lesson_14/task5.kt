package lesson_14

import java.lang.Math.sqrt

abstract class Figure(val color: String) {
    open fun calculateArea(): Double {
        return 0.0
    }

    open fun calculatePerimeter(): Double {
        return 0.0
    }
}

class Circle(
    color: String,
    val radius: Double,
) : Figure(color) {
    override fun calculateArea(): Double {
        val area: Double = NUMBER_OF_PI * (radius * radius)
        return area
    }

    override fun calculatePerimeter(): Double {
        val perimeter = 2 * NUMBER_OF_PI * radius
        return perimeter
    }
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

    override fun calculatePerimeter(): Double {
        val perimeter = sideA + sideB + sideC
        return perimeter
    }
}

class Rectangle(
    color: String,
    val sideA: Double,
    val sideB: Double
) : Figure(color) {
    override fun calculateArea(): Double {
        val area = sideA * sideB
        return area
    }

    override fun calculatePerimeter(): Double {
        val perimeter = (sideA * 2) + (sideB * 2)
        return perimeter
    }
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

const val NUMBER_OF_PI = 3.14