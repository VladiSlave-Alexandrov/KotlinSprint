package lesson_7

fun main() {
    val lowercaseLetters = 'a'..'z'
    val uppercaseLetters = 'A'..'Z'
    val numbers = '0'..'9'
    val characterSet = lowercaseLetters + uppercaseLetters + numbers

    print("Введите количество символов в пароле: ")
    val numberCharacter = readln().toInt()

    for (i in 1..numberCharacter) {
        print((characterSet).random())
    }

}