package lesson_9

fun main() {
    val omeletRecipe = mutableListOf(2, 50, 15)

    print("Введите желаемое количество порций: ")
    val portionNumbers = readln().toInt()

    omeletRecipe.mapIndexed { i, it -> omeletRecipe[i] = it * portionNumbers }
    println("На $portionNumbers порций вам понадобится: Яиц - ${omeletRecipe[0]}, Молока - ${omeletRecipe[1]}, Сливочного масла - ${omeletRecipe[2]}")
}