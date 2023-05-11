package lesson_3

fun main(){
    val move = "D2-D4;0"

    val startMove = move[0].toString() + move[1].toString()
    val finalMove = move[3].toString() + move[4].toString()
    val numberMove = move[6].toString()

    println(startMove)
    println(finalMove)
    println(numberMove)
}