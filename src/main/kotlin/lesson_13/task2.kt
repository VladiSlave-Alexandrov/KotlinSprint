package lesson_13

class Contact(
    var name: String,
    var contactNumber: String,
    _company: String?
) {
    var company: String?

    init {
        company = _company ?: " [не указано]"
    }

    fun outputDataContact() {
        println("Имя: $name \nНомер: $contactNumber \nКомпания: $company")
    }
}

fun main() {
    val contact1 = Contact("Ростислав", "89123456789", null)
    contact1.outputDataContact()
}
