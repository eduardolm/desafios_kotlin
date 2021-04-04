import java.math.BigDecimal
import java.math.RoundingMode
import kotlin.math.pow

fun main(args: Array<String>) {

    val raio = readLine()!!.toDouble()
    val pi = 3.14159
    val area = pi * raio.pow(2.0)
    val resultado = BigDecimal( area.toString()   ).setScale(4, RoundingMode.HALF_EVEN)
    println("A=$resultado")

}