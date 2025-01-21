package contacts



fun main() {
    val app = ContactsApp()
    app.start()
}

class Contact(val name: String, val surname: String, val phoneNumber: String)

class ContactsApp {

    private lateinit var contact: Contact

    fun start() {
        promptInput()
        printMessage()
    }

    private fun printMessage() {
        println(RECORD_CREATED_MESSAGE.trimIndent())
    }

    private fun promptInput() {
        println(NAME_PROMPT)
        val name = readln()

        println(SURNAME_PROMPT)
        val surname = readln()

        println(PHONE_PROMPT)
        val phoneNumber = readln()

        contact = Contact(name, surname, phoneNumber)
    }

    companion object {
        const val NAME_PROMPT = "Enter the name of the person:"
        const val SURNAME_PROMPT = "Enter the surname of the person:"
        const val PHONE_PROMPT = "Enter the number:"

        const val RECORD_CREATED_MESSAGE = """
            
            A record created!
            A Phone Book with a single record created!
        """
    }
}