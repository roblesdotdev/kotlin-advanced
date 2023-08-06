package functions

// Inline functions duplicate the code everywhere is called
// Only make sense with lambda

inline fun op(op: () -> Unit) {
    println("Before calling op")
    op()
    println("After calling op")
}

fun main() {
    op { println("This is the actual op function") }
}