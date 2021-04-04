fun main(args: Array<String>) {

    val n: Int = readLine()!!.toInt()
    for (i in 1..n) {
        val r = readLine()!!.split(" ")
        println(r[0].toInt() + r[1].toInt())
    }
}