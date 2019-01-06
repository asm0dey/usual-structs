package usualstructs.step8

fun main(args: Array<String>) {
    inThread { println("Hi!") }
}

inline fun inThread(crossinline function: () -> Unit) {
    Thread { function() }.start()
}
