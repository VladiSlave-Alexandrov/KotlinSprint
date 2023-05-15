package lesson_6

fun main(){
    print("Введите количество секунд для таймера: ")
    val seconds = readln().toInt()
    var counter = seconds

    while(counter > 0){
        Thread.sleep(1000)
        counter--
    }
    println("Прошло $seconds секунд")
}