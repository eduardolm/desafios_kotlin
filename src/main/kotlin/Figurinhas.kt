fun main(args: Array<String>) {

    val lista = mutableListOf<Int>()

    for (i in 1..readLine()!!.toInt()) {
        val input = readLine()!!.split(" ").map { it.toInt() }
        lista.add(mdc(input[0], input[1]))
    }
    lista.forEach {
        println(it) }
}

// máximo divisor comum (chamada recursiva)
fun mdc(n1: Int, n2: Int): Int {
    var a = n1
    var b = n2
    if (b == 0) return a
    var r: Int = 0
    while (b != 0) {
        r = a % b
        a = b
        b = r
    }
    return a
}