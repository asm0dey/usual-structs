package usualstructs.step3

private val ints = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

fun transformationChain1() {
    ints
        .asSequence()
        .filter { it % 2 == 0 }
        .map { it * it }
        .map { it.toDouble() / 17 }
        .forEach { println(it) }
}

fun transformationChain2() {
    ints
        .filter { it % 2 == 0 }
        .map { it * it }
        .map { it.toDouble() / 17 }
        .forEach { println(it) }
}