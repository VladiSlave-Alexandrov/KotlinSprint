package lesson_8

fun main() {
    print("Введите количество ингредиентов в рецепте: ")
    val ingredientsNumbers = readln().toInt()

    val recipe = Array(ingredientsNumbers, { "" })
    for (i in recipe.indices) {
        print("Введите ингредиент [${i + 1}]: ")
        val consoleIngredient = readln()
        recipe[i] = consoleIngredient.capitalize()
    }

    println("Готово, ваш рецепт: ")
    for (i in recipe.indices) {
        println("[${i + 1}]: ${recipe[i]}")
    }
}