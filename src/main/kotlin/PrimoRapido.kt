fun main(args: Array<String>) {
    //continue a solução
    val n = readLine()!!.toInt()

    for (i in n downTo 1) {
        val num: Long = readLine()!!.toLong()
        if (primo(num)) {
            println("Prime")
        } else {
            println("Not Prime")
        }

        }
    }

fun primo(numero: Long): Boolean {
    var d: Long = 2
    if (numero <= 1) return false
    while ((d * d) <= numero ) {
        if (numero % d == 0L) return false
        d++
    }
    return true
}