package lesson_4

fun main(){
    val todayReserved = 13
    var tableAvailability = todayReserved < TABLE_NUMBER
    println("Доступность столиков на сегодня: $tableAvailability")

    val tomorrowReserved = 9
    tableAvailability = tomorrowReserved < TABLE_NUMBER
    println("Доступность столиков на сегодня: $tableAvailability")

}
const val TABLE_NUMBER = 13