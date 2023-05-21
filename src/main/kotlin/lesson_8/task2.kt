package lesson_8

fun main() {
    val pilafRecipe = arrayOf("Баранина", "Морковь", "Рис", "Лук", "Чеснок", "Зира", "Соль", "Перец")

    print("Введите искомый ингредиент: ")
    val ingredient = readln().capitalize()

    var flag = false
    for (i in pilafRecipe.indices) {
        if (ingredient == pilafRecipe[i]) {
            println("Ингредиент $ingredient в рецепте есть")
            flag = true
            break
        } else continue
    }
    if (!flag) println("Такого ингредиента в рецепте нет")
}