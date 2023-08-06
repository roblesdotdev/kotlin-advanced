package classes

interface Repository {
    fun getAll(): List<Customer>
}

class CustomerController() {
    // lateinit ensure initialization and is null safety
    private lateinit var repository: Repository

    fun index(): String {
        return repository.getAll().toString()
    }
}

fun main() {
    val cc = CustomerController()
    println(cc.index())  // Throws not initialized lateinit
}