package lesson_13

class Contact1(
    _name: String?,
    _contactNumber: String?,
    _company: String?
) {
    var company: String?
    var name: String
    var contactNumber: String

    init {
        company = _company ?: " [не указано]"
        name = _name ?: " [не указано]"
        contactNumber = _contactNumber ?: " [не указано]"
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

    displayContactList(telephoneDirectory)
}

fun displayContactList(telephoneDirectory: MutableList<Contact1>) {
    telephoneDirectory.forEach() {
        println("Имя: ${it.name} \nНомер: ${it.contactNumber} \nКомпания: ${it.company}")
        println()
    }
}