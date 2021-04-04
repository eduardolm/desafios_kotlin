fun main(args: Array<String>) {

    val N = readLine()!!.toInt()
    for (i in 1..N) {
        val n1 = readLine()!!.split("")
        println(calculate(n1))
    }
}

fun calculate(n1: List<String>): Int {
    if (n1[1].toInt() == n1[3].toInt()) return n1[1].toInt() * n1[3].toInt()
    return when (n1[2][0].isUpperCase()) {
        true -> n1[3].toInt() - n1[1].toInt()
        false -> n1[1].toInt() + n1[3].toInt()
    }
}