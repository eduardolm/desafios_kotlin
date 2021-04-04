import java.io.EOFException

fun main(args: Array<String>) {

    while (true) {

        try {

            val l = readLine()!!.toInt()
            val v = readLine()!!.split(" ").run { this.map { it.toInt() } }.toMutableList()
            v.sort()
            when (v.last()) {
                in 0..9 -> println(1)
                in 10..19 -> println(2)
                else -> println(3)
            }

        } catch (f : EOFException) {
            break
        } catch (n : NullPointerException) {
            break
        } catch (e : Exception) {
            break
        }
    }
}