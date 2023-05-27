package lesson_9

fun main() {
    val omeletRecipe = mutableListOf(2, 50, 15)

    print("Введите желаемое количество порций: ")
    val portionNumbers = readln().toInt()

    val ingredientNumbers = omeletRecipe.map { it * portionNumbers }
    println("На $portionNumbers порций вам понадобится: Яиц - ${ingredientNumbers[0]}, Молока - ${ingredientNumbers[1]}, Сливочного масла - ${ingredientNumbers[2]}")
}