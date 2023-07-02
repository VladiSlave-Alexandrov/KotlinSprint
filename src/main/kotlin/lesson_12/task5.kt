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
    var meanDaytimeTemperature = 0
    var meanNighttimeTemperature = 0
    var numberRainyDays = 0
    var meanAtmosphericPressure = 0
    days.forEach() {
        meanDaytimeTemperature += it.daytimeTemperature
        meanNighttimeTemperature += it.nightTimeTemperature
        meanAtmosphericPressure += it.atmosphericPressure
        if (it.rainPresence == true) numberRainyDays += 1
    }
    meanDaytimeTemperature /= numberDays
    meanNighttimeTemperature /= numberDays
    meanAtmosphericPressure /= numberDays
    println("Средняя дневная температура за $numberDays дней: $meanDaytimeTemperature")
    println("Средняя ночная температура за $numberDays дней: $meanNighttimeTemperature")
    println("Среднее значение атмосферного давления за $numberDays дней: $meanAtmosphericPressure")
    println("Количество дождливых дней из $numberDays: $numberRainyDays")
}


