package lesson_12

class Weatherr(
    _daytimeTemperature: Int,
    _nightTimeTemperature: Int,
    _atmosphericPressure: Int,
    _rainPresence: Boolean,
) {

    val daytimeTemperature: Int
    val nightTimeTemperature: Int
    val atmosphericPressure: Int
    val rainPresence: Boolean

    init {
        daytimeTemperature = _daytimeTemperature
        nightTimeTemperature = _nightTimeTemperature
        atmosphericPressure = _atmosphericPressure
        rainPresence = _rainPresence
    }


    fun outputWeatherData() {
        println(daytimeTemperature)
        println(nightTimeTemperature)
        println(atmosphericPressure)
        println(rainPresence)
    }
}

fun main() {
    val day1 = Weatherr(3, -3, 722, false)
    day1.outputWeatherData()
    println()
    val day2 = Weatherr(15, 5, 724, true)
    day2.outputWeatherData()
    println()
    val day3 = Weatherr(5, -1, 728, false)
    day3.outputWeatherData()
}