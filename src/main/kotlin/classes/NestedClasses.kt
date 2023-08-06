package classes

class DirectoryExplorer(val external: String) {

    private inner class Internal() {
        fun execute() {
            println("Access to parent props $external with inner modifier")
        }
    }

    private class PermissionCheck() {
      fun validatePermission(user: String)   {
            // cannot access to parent
            // println(external)
      }
    }
    fun listFolder(folder: String, user: String) {
       val permissionCheck = PermissionCheck()
        permissionCheck.validatePermission((user))
        val ic = Internal()
        ic.execute()
    }
}

fun main() {
    val de = DirectoryExplorer("'prop'")

    // private
    // val pc = DirectoryExplorer.PermissionCheck()

    de.listFolder(".", "John")
}