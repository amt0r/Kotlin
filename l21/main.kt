package l21

import java.io.File

fun main() {

    val file = File("textFile.txt")
    file.writeToFileAndSend()


}

fun File.writeToFileAndSend() {

    val message = "seome message for file"
    createNewFile()
    writeText(message)
    println(message)

}