package lesson2

fun main(){
    val departureHour = 9
    val departureMinute = 39
    val travelTime = 457

    val arrivalTime = departureHour * 60 + departureMinute + travelTime
    println("Прибытие поезда в: ${arrivalTime / 60}:${arrivalTime % 60}")
}