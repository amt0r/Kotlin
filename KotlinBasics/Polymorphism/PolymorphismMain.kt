package KotlinBasics.Polymorphism

import java.util.*

fun main() {

    val creationDate = Date()

    val messageItem: NotesAppItem = MessageItem(
        "dddd",
        creationDate,
        "message",
        "call sis"
    )

    val phoneItem: NotesAppItem = PhoneItem(
        "dddd",
        creationDate,
        "message",
        321312321
    )

    val listItem: NotesAppItem = ListItem(
        "dddd",
        creationDate,
        "message",
        listOf("dsa", "dsa", "21fed")
    )

    val list = listOf(messageItem, phoneItem, listItem)

    list.forEach{
        println(it.getItemData())
    }
}