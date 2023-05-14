package lesson_5

fun main(){
    print("Докажите что вы не робот, решив задачу: 2 + 2 = ")
    val answer = readlnOrNull()

    if(answer == "4") println("Добро пожаловать")
    else println("Доступ запрещен")
}