package lesson_5

fun main(){
    val number1 = 15
    val number2 = 13
    print("Докажите что вы не робот, решив задачу: $number1 + $number2 = ")
    val answer = readln().toInt()

    if(answer == number1 + number2) println("Добро пожаловать")
    else println("Доступ запрещен")
}