package lesson_9

fun main() {
    val pilafRecipe = listOf("Баранина", "Морковь", "Рис", "Лук", "Чеснок", "Зира", "Соль", "Перец")

    println("В рецепте есть следующие ингредиенты: ")
    pilafRecipe.forEach {
        println(it)
    }
}