package lesson_4

fun main() {
    var weight = 20
    var vol = 80
    println("Average для груза с весом $weight кг и объемом $vol л: ${(weight >= MIN_WEIGHT) && (weight <= MAX_WEIGHT) && (vol < MAX_VOL)}")

    weight = 50
    vol = 100
    println("Average для груза с весом $weight кг и объемом $vol л: ${(weight >= MIN_WEIGHT) && (weight <= MAX_WEIGHT) && (vol < MAX_VOL)}")
}

const val MIN_WEIGHT = 35
const val MAX_WEIGHT = 100
const val MAX_VOL = 100