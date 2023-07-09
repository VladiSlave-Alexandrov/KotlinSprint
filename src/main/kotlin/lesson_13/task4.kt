package lesson_13

import java.util.*

class Contact1(
    _name: String?,
    _contactNumber: String?,
    _company: String?
) {
    var company: String? = getValue(_company)
    var name: String? = getValue(_name)
    var contactNumber: String? = getValue(_contactNumber)

    private fun getValue(str: String?) = if (str.isNullOrEmpty()) null else str
}

fun displayContactList(telephoneDirectory: MutableList<Contact1>) {
    telephoneDirectory.forEach() {
        println("Имя: ${it.name} \nНомер: ${it.contactNumber} \nКомпания: ${it.company}")
        println()
    }
}

fun addContact(telephoneDirectory: MutableList<Contact1>): MutableList<Contact1> {
    while (true) {
        print("Введите имя контакта: ")
        val name = readlnOrNull()
        println()

        print("Введите название компании: ")
        val company = readlnOrNull()
        println()

        while (true) {
            print("Введите номер телефона: ")
            val number = readlnOrNull()
            println()
            if (number == null) {
                println("Поле обязательно к заполнению")
                continue
            } else {
                val contact1 = Contact1(name, number, company)
                telephoneDirectory.add(contact1)
                break
            }
        }
        println("“Если хотите добавить новую запись, введите \"да\"")
        val flag = readln().lowercase()
        if (flag == "да") continue
        else break
    }
    return telephoneDirectory
}

fun main() {
    val telephoneDirectory: MutableList<Contact1> = mutableListOf()
    addContact(telephoneDirectory)
    displayContactList(telephoneDirectory)
}
