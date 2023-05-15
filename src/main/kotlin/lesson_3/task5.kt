package lesson_3

fun main(){
    val move = "D2-D4;0"

    val splitter = ";"
    val splitter2 = "-"
    val splitString = move.split(splitter, splitter2)
    val startMove = splitString[0]
    val finalMove = splitString[1]
    val numberMove = splitString[2]


    println(startMove)
    println(finalMove)
    println(numberMove)
}