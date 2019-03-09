package usualstructs.step6

fun main(args: Array<String>) {
    threadedPrint { "Hi!" }
    threadedPrint { 3 }
}

inline fun <T> threadedPrint(crossinline function: () -> T) {
    Thread {
        println(function())
        println("done")
    }.start()
}
