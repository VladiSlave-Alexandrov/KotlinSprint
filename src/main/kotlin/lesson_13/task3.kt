package lesson_13

class Contact1(
    var company: String? = null ?: " [не указано]",
    var name: String? = null ?: " [не указано]",
    var contactNumber: String? = null ?: " [не указано]",
) {
    fun displayContactList() {
        println("Имя: $name \nНомер: $contactNumber \nКомпания: $company")
        println()
    }
}

fun main() {
    val telephoneDirectory: MutableList<Contact1> = mutableListOf()

    val contact1 = Contact1("Ростислав", "89123456789", null)
    telephoneDirectory.add(contact1)

    val contact2 = Contact1(null, "89263547834", "Microsoft")
    telephoneDirectory.add(contact2)

    val contact3 = Contact1("Влад", null, "Рога и Копыта")
    telephoneDirectory.add(contact3)

    val contact4 = Contact1(null, null, null)
    telephoneDirectory.add(contact4)

    contact1.displayContactList()
}

