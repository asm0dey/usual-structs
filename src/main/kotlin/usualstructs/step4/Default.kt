package usualstructs.step4

fun main(args: Array<String>) {
    println(factorial(6))
}

fun factorial(i: Int) = factorialLoop(counter = i)

tailrec fun factorialLoop(counter: Int, acc: Long = 1): Long {
    return if (counter == 0) acc
    else factorialLoop(counter - 1, acc * counter)
}
