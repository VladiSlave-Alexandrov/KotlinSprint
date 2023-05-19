package lesson_7

fun main() {
    print("Введите число: ")
    val finiteNumber = readln().toInt()

    for (i in 0..finiteNumber step 1) {
        if (i % 2 == 0) print("$i, ")
        else continue
    }
}