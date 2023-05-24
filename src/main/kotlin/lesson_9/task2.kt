package lesson_9

import kotlin.system.exitProcess

fun main() {
    val wokRecipe = mutableListOf("Лапша", "Масло", "Соус")
    println("В рецепте есть базовые ингредиенты: $wokRecipe")

    print("Желаете добавить еще?: ")
    val response = readln().replaceFirstChar { it.uppercase() }

    if (response == "Да") println("Какой ингредиент вы хотите добавить?")
    else exitProcess(0)

    val newIngredient = readln().replaceFirstChar { it.uppercase() }
    wokRecipe.add(newIngredient)

    println("Теперь в рецепте есть следующие ингредиенты: $wokRecipe")
}