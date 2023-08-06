package functions

fun factorial(number: Int): Int {
    return when (number) {
        0, 1 -> 1
        else -> number * factorial(number - 1)
    }
}

tailrec fun factorialTR(number: Int, acc: Int = 1): Int {
    return when(number) {
        0 -> acc
        else -> factorialTR(number - 1, acc * number)
    }
}

fun main() {
    println(factorial(5))
    println(factorialTR(5))
}