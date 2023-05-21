package lesson_7

fun main() {
    print("Введите число: ")
    val finiteNumber = readln().toInt()

    for (i in 0..finiteNumber step 2) {
        print("$i, ")
    }
}