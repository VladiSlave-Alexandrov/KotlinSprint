package lesson_8

fun main() {
    val pilafRecipe = arrayOf("Баранина", "Морковь", "Рис", "Лук", "Чеснок", "Зира", "Соль", "Перец")

    for (i in pilafRecipe) {
        print("$i\t ")
    }
    println()

    print("Введите ингредиент который хотите заменить: ")
    val ingredient = readln().replaceFirstChar { it.uppercase() }

    if (!pilafRecipe.contains(ingredient)) println("Ингредиент $ingredient в рецепте отсутствует")
    else print("Введите ингредиент для добавленя его в список: ")

    val replacementIngredient = readln().replaceFirstChar { it.uppercase() }
    pilafRecipe[pilafRecipe.indexOf(ingredient)] = replacementIngredient

    print("Готово! Вы сохранили следующий список: ")
    for (i in pilafRecipe) {
        print("$i\t ")
    }
}