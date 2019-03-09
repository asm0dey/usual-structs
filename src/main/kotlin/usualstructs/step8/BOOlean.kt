package usualstructs.step8

sealed class BOOlean {
    abstract val value: Boolean

    class TRUE : BOOlean() {
        override val value = true
    }

    class FALSE : BOOlean() {
        override val value = false
    }
}

fun BOOlean.asBool() = when(this){
    is BOOlean.TRUE -> true
    is BOOlean.FALSE -> false
}