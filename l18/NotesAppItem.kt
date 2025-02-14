package l18

import java.util.*

open class NotesAppItem {
    open fun getItemData() = ""
}

class MessageItem(
    private var tittle: String,
    private var creationDate: Date,
    private var type: String,
    private var data: String,
) : NotesAppItem() {
    override fun getItemData(): String {
        return "$tittle  $creationDate  $type  $data"
    }
}
class PhoneItem(
    private var tittle: String,
    private var creationDate: Date,
    private var type: String,
    private var data: Long,
) : NotesAppItem() {
    override fun getItemData(): String {
        return "$tittle  $creationDate  $type  $data"
    }
}
class ListItem(
    private var tittle: String,
    private var creationDate: Date,
    private var type: String,
    private var data: List<String>,
) : NotesAppItem() {
    override fun getItemData(): String {
        return "$tittle  $creationDate  $type  $data"
    }
}