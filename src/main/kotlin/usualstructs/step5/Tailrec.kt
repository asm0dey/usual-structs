package usualstructs.step5

fun main(args: Array<String>) {
    println(factorial(6))
}

fun factorial(i: Int) = factorialLoop(i, 1)

private tailrec fun factorialLoop(counter: Int, acc: Long): Long {
    return if (counter == 0) acc
    else factorialLoop(counter - 1, acc * counter)
}
