package demo.submodule.svc2.app

class App {

    val svc2: demo.submodule.svc2.Library = demo.submodule.svc2.Library()

    fun hello() {
        println(svc2.hello("SVC2"))
    }

}

fun main(args: Array<String>) {
    App().hello()
}
