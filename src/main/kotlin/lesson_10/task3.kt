package lesson_10

fun main() {
    print("Введите количество символов в пароле: ")
    val passwordNumbers = readln().toInt()

    println(passwordGenerator(passwordNumbers))

}

fun passwordGenerator(passwordNumbers: Int): String {
    val listOfNumbers = ("0123456789").split("").toMutableList()
    val lostOfCharacters = ("!\"#\$%&'()*+,-./ ").split("")
    listOfNumbers.addAll(lostOfCharacters)
    var password = ""
    for (i in 0..passwordNumbers) {
        password += (listOfNumbers).random()
    }
    return password
}