package usualstructs.step9

import java.util.*


val z = TreeNode(1, TreeNode("s"), TreeNode(3L))

data class TreeNode<T : Any>(
    val value: T,
    var left: TreeNode<*>? = null,
    var right: TreeNode<*>? = null
)

inline fun <reified T : Any> TreeNode<*>.findChildWithClass(): TreeNode<T>? {
    val toInspect = LinkedList<TreeNode<*>>()
    toInspect.add(this)
    while (!toInspect.isEmpty()) {
        val currentRoot = toInspect.pollFirst()
        if (currentRoot.value::class == T::class) return currentRoot as TreeNode<T>
        else sequenceOf(currentRoot.left, currentRoot.right).filterNotNullTo(toInspect)
    }
    return null
}

fun main(args: Array<String>) {
    println(z.findChildWithClass<String>())
    println(z.findChildWithClass<Int>())
}
