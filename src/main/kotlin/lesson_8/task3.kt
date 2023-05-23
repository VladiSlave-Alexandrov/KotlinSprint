package lesson_8

fun main() {
    val pilafRecipe = arrayOf("Баранина", "Морковь", "Рис", "Лук", "Чеснок", "Зира", "Соль", "Перец")

    print("Введите искомый ингредиент: ")
    val ingredient = readln().replaceFirstChar { it.uppercase() }

    if (ingredient in pilafRecipe) {
        println("Ингредиент $ingredient в рецепте есть")
    } else {
        println("Такого ингредиента в рецепте нет")
    }
}