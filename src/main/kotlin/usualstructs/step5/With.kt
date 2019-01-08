package usualstructs.step5

fun main(args: Array<String>) {
    val duck = Duck()
    with(duck) {
        color = "yellow"
        childrenCount = 17
        repeat(5) { moveForward() }
        repeat(2) { turnRight() }
        repeat(5) { moveForward() }
    }
}