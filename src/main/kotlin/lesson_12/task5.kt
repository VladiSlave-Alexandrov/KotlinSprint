package lesson_12

import kotlin.random.Random.Default.nextBoolean


class Weatherrrrr(
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
        println()
    }


}

fun main() {
    val numberDays = 10
    val days: MutableList<Weatherrrrr> = collectWeatherData(numberDays)
    calculateMeanData(days, numberDays)
}

fun collectWeatherData(numberDays: Int): MutableList<Weatherrrrr> {
    val days: MutableList<Weatherrrrr> = mutableListOf()
    var counter = numberDays
    while (counter > 0) {
        val day = Weatherrrrr(
            daytimeTemperature = (-91..56).random(),
            nightTimeTemperature = (-91..56).random(),
            atmosphericPressure = (641..815).random(),
            rainPresence = nextBoolean()
        )
        day.outputWeatherData()
        days.add(day)
        counter--
    }
    return days
}

fun calculateMeanData(days: List<Weatherrrrr>, numberDays: Int) {
    val meanDaytimeTemperature = days.map { it.daytimeTemperature }.average()
    val meanNighttimeTemperature = days.map { it.nightTimeTemperature }.average()
    val numberRainyDays = days.map { it.rainPresence }.filter { it }.size
    val meanAtmosphericPressure = days.map { it.atmosphericPressure }.average()

    println("Средняя дневная температура за $numberDays дней: $meanDaytimeTemperature")
    println("Средняя ночная температура за $numberDays дней: $meanNighttimeTemperature")
    println("Среднее значение атмосферного давления за $numberDays дней: $meanAtmosphericPressure")
    println("Количество дождливых дней из $numberDays: $numberRainyDays")
}


