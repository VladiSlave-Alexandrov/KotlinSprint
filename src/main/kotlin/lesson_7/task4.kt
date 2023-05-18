package lesson_7

fun main() {
    print("Введите количество времени для отсчета в секундах: ")
    val time = readln().toInt()

    for (i in time downTo 1) {
        println(i)
        Thread.sleep(1000)
    }
    println("Время вышло")
}