package lesson_10

fun main() {
    print("Введите количество символов в пароле: ")
    val passwordNumbers = readln().toInt()

    println(passwordGenerator(passwordNumbers))

}

fun passwordGenerator(passwordNumbers: Int): String {
    val allOfCharacters = (("0123456789").split("") + ("!\"#$%&'()*+-,./ ").split("")).toMutableList()
    allOfCharacters.removeAll(setOf(""))
    var password = ""
    for (i in 1..passwordNumbers) {
        password += (allOfCharacters).random()
    }
    return password
}