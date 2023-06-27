package lesson_12

class Weatherr() {
    var daytimeTemperature: Int = 0
    var nightTimeTemperature: Int = 0
    var atmosphericPressure: Int = 0
    var rainPresence = false

    constructor(
        _daytimeTemperature: Int,
        _nightTimeTemperature: Int,
        _atmosphericPressure: Int,
        _rainPresence: Boolean,
    ) : this() {
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
    val day1 = Weatherr()
    day1.daytimeTemperature = 3
    day1.nightTimeTemperature = -3
    day1.atmosphericPressure = 700
    day1.outputWeatherData()
    println()

    val day2 = Weatherr()
    day2.daytimeTemperature = 13
    day2.nightTimeTemperature = 7
    day2.atmosphericPressure = 728
    day2.rainPresence = true
    day2.outputWeatherData()
}