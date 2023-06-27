package lesson_12

class Weather() {
    var daytimeTemperature = 15
    var nightTimeTemperature = 5
    var atmosphericPressure = 722
    var rainPresence = false

    fun outputWeatherData() {
        println(daytimeTemperature)
        println(nightTimeTemperature)
        println(atmosphericPressure)
        println(rainPresence)
    }
}

fun main() {
    val day1 = Weather()
    day1.daytimeTemperature = 3
    day1.nightTimeTemperature = -3
    day1.atmosphericPressure = 700
    day1.outputWeatherData()
    println()

    val day2 = Weather()
    day2.daytimeTemperature = 13
    day2.nightTimeTemperature = 7
    day2.atmosphericPressure = 728
    day2.rainPresence = true
    day2.outputWeatherData()
}