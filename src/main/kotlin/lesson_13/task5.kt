package lesson_13

fun main() {
    print("Введите номер телефона: ")
    val strNumber = readLine().toString()
    try {
        val number = strNumber.toLong()
    } catch (e: NumberFormatException) {
        println("Неверный формат номера телефона, можно использовать только цифры")
    }
}