package lesson_4

fun main(){
    val weather = true
    val isTentOpen = true
    val humidity = 20
    val season = false

    val conditions = weather && isTentOpen && (humidity == 20) && season
    println("Благоприятные ли условия сейчас для роста бобовых? $conditions")
}