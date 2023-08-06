package functions

// Infix functions only can be used with single params

infix fun String.shouldBeEqualTo(value: String) = this == value

fun main() {
    val message = "Hello"
    message.shouldBeEqualTo("Hello")

    // infix
    val result = message shouldBeEqualTo "Hello"
    println(result)

    println(message shouldBeEqualTo "Bye")
}