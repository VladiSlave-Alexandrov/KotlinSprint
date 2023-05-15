package lesson_4

fun main(){
    val trainingDay = 5
    val exercise = trainingDay % 2 == 1
    val hands = exercise
    val abs = exercise
    val legs = !exercise
    val back = !exercise

    println("""
        Упражнения для рук:    $hands      
        Упражнения для ног:    $legs
        Упражнения для спины:  $back
        Упражнения для пресса: $abs""")
}