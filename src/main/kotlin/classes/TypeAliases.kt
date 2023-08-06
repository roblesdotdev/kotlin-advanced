package classes

typealias Name = String

data class Employee(val name: Name) {
    fun printName(message: String) {
       println("$message, $name")
    }
}

fun main() {
    val e = Employee("John Doe")
    e.printName("Hello")
}