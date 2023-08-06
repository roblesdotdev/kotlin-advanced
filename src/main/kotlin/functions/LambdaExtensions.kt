package functions

// Lambda extensions allows to create more expressive or fluent DSL

class Request(val method: String, val query: String, val contentType: String = "application/json")
class Response(var contents: String = "", var status:  Status) {
    fun status(value: Status.() -> Unit) {}
}
class Status(var code: Int = 200, var description: String = "")

class RouteHandler(val request: Request, val response: Response) {
    var executeNext = false
    fun next() {
        executeNext = true
    }
}

fun routeHandler(path: String, f: RouteHandler.() -> Unit): RouteHandler.() -> Unit = f
fun response(response: Response.() -> Unit) {}

fun main() {
   routeHandler("/") {
       if (request.query != "") {
           // process query
           println("Query is empty")
       }
       response {
           status {
               code = 404
               description = "Not found"
           }
       }
   }
}