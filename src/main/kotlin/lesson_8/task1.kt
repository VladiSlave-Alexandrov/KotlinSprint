package lesson_8

fun main() {
    val advertisementViews = arrayOf(14, 15, 3, 12, 5, 10, 19)
    var sumViews = 0

    for (i in advertisementViews.indices) {
        sumViews += advertisementViews[i]
    }
    println(sumViews)
}