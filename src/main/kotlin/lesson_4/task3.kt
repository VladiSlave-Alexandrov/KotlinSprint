package lesson_4

fun main(){
    val weather = "солнечная"
    val awning = "раскрыт"
    val humidity = 20
    val season = "зима"

    val conditions = (weather == "солнечная") && (awning == "раскрыт") && (humidity == 20) && (season !="зима")
    println("Благоприятные ли условия сейчас для роста бобовых? $conditions")
}