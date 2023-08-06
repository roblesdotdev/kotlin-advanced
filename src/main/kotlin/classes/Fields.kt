package classes

class Customer() {
    var lastPurchaseAmmount: Double = 0.0
        get() = field
        set(value) {
            if (value > 100) {
                field = value
            }
        }
}

fun main() {
    val c = Customer()
    c.lastPurchaseAmmount = 10.0    // Setter
    println(c.lastPurchaseAmmount)  // Getter
    c.lastPurchaseAmmount = 110.0
    println(c.lastPurchaseAmmount)
}