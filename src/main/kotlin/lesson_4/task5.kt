package lesson_4

fun main() {
    print("Есть ли повреждения корпуса(true - незначительные,false - отсутствуют): ")
    val damages: Boolean? = readlnOrNull()?.toBoolean()

    print("Введите численность экипажа: ")
    val crewNumber = readln().toInt()

    print("Введите текущее количество ящиков провизии: ")
    val provisions = readln().toInt()

    print("Погодные условия(true - благоприятные, false - неблагоприятные): ")
    val weather: Boolean? = readlnOrNull()?.toBoolean()

    val shippingOption = ((damages == false) && (crewNumber in MIN_CREW until MAX_CREW) &&
            (provisions > MIN_PROVISIONS)) || ((damages == true) && (crewNumber == MAX_CREW) &&
            (provisions > MIN_PROVISIONS) && (weather == true))
    println(shippingOption)
}

const val MIN_CREW = 55
const val MAX_CREW = 70
const val MIN_PROVISIONS = 50