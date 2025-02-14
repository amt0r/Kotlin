package l16

class Guide {
    private var tittle = ""

    fun setTittle(tittle: String) {
        this.tittle = tittle
    }

    fun getTittle(): String {
        return tittle
    }

    fun chooseArticle() {
        println("Open catalog")
    }
}