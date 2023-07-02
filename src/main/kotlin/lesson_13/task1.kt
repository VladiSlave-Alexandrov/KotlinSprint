package lesson_13

class Contact(
    var name: String,
    var contactNumber: String,
    _company: String?
) {
    var company: String?

    init {
        company = _company ?: "Информация отсутствует"
    }

    fun outputDataContact() {

        println(
            """$name
            |$contactNumber
            |$company
        """.trimMargin()
        )
    }
}

fun main() {
    val contact1 = Contact("Кто то", "С таким то номером", null)
    contact1.outputDataContact()
}