package lesson_9

fun main() {
    print("Введите названия 5-ти ингредиентов через запятую: ")
    val console = readln()
    val splitter = ','

    val ingredientList = console.split(splitter)
    println(ingredientList.sorted())
}