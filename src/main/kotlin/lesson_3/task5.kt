package lesson_3

fun main(){
    val move = "D2-D4;0"

    var splitter = ";"
    val splitString = move.split(splitter)
    val numberMove = splitString[1]

    splitter = "-"
    val splitMove = splitString[0].split(splitter)
    val startMove = splitMove[0]
    val finalMove = splitMove[1]


    println(startMove)
    println(finalMove)
    println(numberMove)
}