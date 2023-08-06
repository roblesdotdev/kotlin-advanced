package classes

// companion object allows to create static methods

class Log() {
   companion object Factory {
       fun createFileLog(filename: String): Log = Log(filename)
   }

    constructor(filename: String): this() {}
}

fun main() {
    val log = Log()
    val fileLog = Log.createFileLog("file.txt")
}