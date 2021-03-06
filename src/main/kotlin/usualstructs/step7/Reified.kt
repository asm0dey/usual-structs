package usualstructs.step7

import java.util.*


val z = TreeNode(1, TreeNode("s"), TreeNode(3L))

data class TreeNode<T : Any>(
    val value: T,
    var left: TreeNode<*>? = null,
    var right: TreeNode<*>? = null
)

