package lesson_5

fun main() {
    val winNumber1 = 15
    val winNumber2 = 16

    print("Введите первое число: ")
    val number1 = readln().toInt()
    print("Введите второе число: ")
    val number2 = readln().toInt()

    if ((number1 == winNumber1) && (number2 == winNumber2)) {println("Поздравляем! Вы выиграли главный приз!")}
    else if((number1 != winNumber1) && (number2 != winNumber2)) {println("Неудача! Крутите барабан!")}
    else {println("Вы выиграли утешительный приз!")}
}