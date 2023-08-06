package classes


sealed class PageResult {
    class Success(val content: String): PageResult()
    class Error(val status: Int, val message: String): PageResult()
}

fun getURLPage(url: String): PageResult {
    val wasValidCall = false

    if (wasValidCall) {
        return PageResult.Success("The page content")
    }
    return PageResult.Error(404, "Not found page")
}

fun main() {
    val pageResult = getURLPage("/")
    when (pageResult) {
        is PageResult.Success -> println(pageResult.content)
        is PageResult.Error -> println("Error ${pageResult.status} - ${pageResult.message}")
    }
}