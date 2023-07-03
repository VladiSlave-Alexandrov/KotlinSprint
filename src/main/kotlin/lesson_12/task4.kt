package lesson_12

class Weatherrrr(
    var daytimeTemperature: Int,
    var nightTimeTemperature: Int,
    var atmosphericPressure: Int,
    var rainPresence: Boolean = false,
) {
    init {
        outputWeatherData()
        println()
    }

    fun outputWeatherData() {
        println(daytimeTemperature)
        println(nightTimeTemperature)
        println(atmosphericPressure)
        println(rainPresence)
    }
}

fun main() {
    val day1 = Weatherrrr(15, 5, 722)
    val day2 = Weatherrrr(10, 3, 730)
}