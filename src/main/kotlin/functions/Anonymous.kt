package functions

fun op(x: Int, op: (Int) -> Int): Int {
    return op(x)
}

fun main() {

    // Lambda
    val result = op(3) { it * 3 }
    println(result)

    // Anonymous functions
    val result2 = op(3, fun(x: Int): Int { return x * x })
    println(result2)
}