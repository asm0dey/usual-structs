package usualstructs.step2

import java.util.*

fun main(args: Array<String>) {
    println(nullableFactorial(6))
    println(nullableFactorial(null))

}

private fun nullableFactorial(input: Int?) = input?.let { fact(it) }

private fun fact(i: Int): Long {
    return if (i < 1) 1
    else i * fact(i - 1)
}
