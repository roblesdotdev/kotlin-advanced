package functions

fun containingFunction() {
    val numbers = 1..100
    numbers.forEach {
        if (it % 5 == 0) {
            // return from function
            // return
            // return from lambda
            return@forEach
        }
    }
    println("Hello")
}

fun containingFunction2() {
    val numbers = 1..100
    numbers.forEach(fun (element: Int) {
        if (element % 5 == 0) {
            return  // with anonymous functions return is local
        }
    })
    println("Hello")
}


fun main() {
    containingFunction()
    containingFunction2()
}