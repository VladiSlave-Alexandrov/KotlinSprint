package lesson_4

fun main(){
    print("Есть ли повреждения корпуса(true - незначительные,false - отсутствуют): ")
    val damages: Boolean? = readlnOrNull()?.toBoolean()

    print("Введите численность экипажа: ")
    val crewNumber = readln().toInt()

    print("Введите текущее количество ящиков провизии: ")
    val provisions = readln().toInt()

    print("Погодные условия(true - благоприятные, false - неблагоприятные): ")
    val weather: Boolean? = readlnOrNull()?.toBoolean()

    val shippingOption = ((damages == false)&&(crewNumber in 55..69)&&(provisions > 50))||((damages == true)&&(crewNumber == 70)&&(provisions > 50)&&(weather == true))
    println(shippingOption)
}