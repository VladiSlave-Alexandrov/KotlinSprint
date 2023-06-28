package lesson_13

class Contact(
    var name: String,
    var contactNumber: String,
    var company: String?
) {

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