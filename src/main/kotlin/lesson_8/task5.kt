package lesson_8

fun main() {
    print("Введите количество ингредиентов в рецепте: ")
    val ingredientsNumbers = readln().toInt()

    val recipe = Array(ingredientsNumbers) {
        print("Введите ингредиент : ")
        readln().replaceFirstChar { it.uppercase() }
    }

    println("Готово, ваш рецепт: ")
    for (i in recipe.indices) {
        println("[${i + 1}]: ${recipe[i]}")
    }
}