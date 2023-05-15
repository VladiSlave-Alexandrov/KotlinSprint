package lesson_6

fun main(){
    print("Создайте логин: ")
    val login = readln()

    print("Создайте пароль: ")
    val password = readln()

    var flag = true
    while(flag){
        print("Введите логин: ")
        val inputLogin = readln()

        print("Введите пароль: ")
        val inputPassword = readln()

        if((inputLogin != login) ||(inputPassword != password)) println("Неверный логин или пароль.")
        else{
            print("Авторизация прошла успешно")
            flag = false
        }
    }
}