package functions

// Local functions used to bundle code that doesn't need to be reused

fun foo(fooParam: String) {
    val outerFunction = "value"
    fun bar(barParam: String) {
        // outside values are available
        println(outerFunction)
        println("$fooParam - $barParam")
    }

    bar("bar")
}

fun main() {
    foo("foo")  // cannot access to bar function
}
