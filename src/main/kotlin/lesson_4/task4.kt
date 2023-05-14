package lesson_4

fun main(){
    val trainingDay = 5
    var exercise = trainingDay % 2

    println("""
        Упражнения для рук:    ${exercise == 1}      
        Упражнения для ног:    ${exercise == 0}
        Упражнения для спины:  ${exercise == 0}
        Упражнения для пресса: ${exercise == 1}""")
}