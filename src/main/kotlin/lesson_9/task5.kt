package lesson_9

fun main() {
    println("Введите 5 ингредиентов: ")
    val listIngredient = MutableList(5) { readln() }

    val sortedListIngredient = listIngredient.distinct().sorted().toMutableList()

    sortedListIngredient[0] = sortedListIngredient[0].replaceFirstChar { it.uppercase() }

    sortedListIngredient[(sortedListIngredient.indexOf(sortedListIngredient.last()))] =
        sortedListIngredient.last() + "."

    println(sortedListIngredient.joinToString())
    println("${sortedListIngredient.joinToString()}.")
}