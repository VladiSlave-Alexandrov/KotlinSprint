package lesson_10

fun main() {
    print("Введите количество символов в пароле: ")
    val passwordNumbers = readln().toInt()

    println(generatePassword(passwordNumbers))

}

fun generatePassword(passwordNumbers: Int): String {
    val allOfCharacters = ' '..'9'
    var password = ""
    for (i in 1..passwordNumbers) {
        password += (allOfCharacters).random()
    }
    return password
}