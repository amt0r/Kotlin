package KotlinBasics

fun main() {

    val statusesFromServer = listOf(101, 102, 103)

    for (i in statusesFromServer) {
        when(i) {
            Status.NEW.id -> setStatus(Status.NEW)
            Status.COOKING.id -> setStatus(Status.COOKING)
            Status.COMPLETED.id -> setStatus(Status.COMPLETED)
            else -> setStatus(Status.ERROR)
        }
        Thread.sleep(1000)
    }

    TODO()
}
enum class Status(val id: Int) {
    NEW(101) {
        override fun getStatus(): String {
            return "dsa"
        }
    },
    COOKING(102) {
        override fun getStatus(): String {
            return "dsa"
        }
    },
    COMPLETED(103) {
        override fun getStatus(): String {
            return "dsa"
        }
    },
    ERROR(0) {
        override fun getStatus(): String {
            return "dsa"
        }
    };

    abstract fun getStatus(): String
}

fun setStatus(status: Status) {
    when(status) {
        Status.NEW -> println("Заказ прийнятий")
        Status.COOKING -> println("Готується")
        Status.COMPLETED -> println("готовий")
        Status.ERROR -> println("Помилка")
    }
}