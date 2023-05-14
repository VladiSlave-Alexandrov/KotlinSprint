package lesson_5

fun main(){
    print("Введите год рождения: ")
    val birthYear = readln().toInt()

    if(2023 - birthYear < AGE_OF_MAJORITY) println("Доступ закрыт")
    else println("Показать экран со скрытым контентом")

}

const val AGE_OF_MAJORITY = 18