package lesson_12

class Weatherrr(
    var daytimeTemperature: Int,
    var nightTimeTemperature: Int,
    var atmosphericPressure: Int,
    var rainPresence: Boolean = false,
) {
    fun outputWeatherData() {
        println(daytimeTemperature)
        println(nightTimeTemperature)
        println(atmosphericPressure)
        println(rainPresence)
    }
}

fun main() {
    val day1 = Weatherrr(15, 5, 722)
    val day2 = Weatherrr(10, 3, 730)

    day1.outputWeatherData()
    day2.outputWeatherData()
}
