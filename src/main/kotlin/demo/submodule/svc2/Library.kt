/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package demo.submodule.svc2

class Library {
    val svc1: demo.submodule.svc1.Library = demo.submodule.svc1.Library()

    fun hello(message: String): String {
        return "svc2 -> ${svc1.hello(message)}"
    }
}
