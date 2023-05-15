package Lesson_5

import kotlin.random.Random

fun main() {
    val winNumber1 = Random.nextInt(100)
    val winNumber2 = Random.nextInt(100)

    print("Введите первое число: ")
    val number1 = readln().toInt()
    print("Введите второе число: ")
    val number2 = readln().toInt()

    if ((number1 == winNumber1) && (number2 == winNumber2)) {println("Поздравляем! Вы выиграли главный приз!")}
    else if((number1 != winNumber1) && (number2 != winNumber2)) {println("Неудача! Крутите барабан!")}
    else {println("Вы выиграли утешительный приз!")}

    println("Числа для победы: $winNumber1, $winNumber2")
}

