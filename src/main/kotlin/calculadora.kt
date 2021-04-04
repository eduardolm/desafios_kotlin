fun main() {

    var a: Float?
    var b: Float?

    println("******************************************")
    println("***           Calculadora              ***")
    println("******************************************")
    println()

    do {
        println("Entre com um número real: ")
        a = readLine()?.toFloat()
        println("Entre com outro número real: ")
        b = readLine()?.toFloat()
        if (a == 0F || b == 0F) println("Valore(s) inválido(s). Tente novamente.")
    } while (a == 0F && b == 0F)


    println("Escolha a operação: ")
    println("1 - Adição: ")
    println("2 - Subtração: ")
    println("3 - Multiplicação: ")
    println("4 - Divisão: ")
    val operation: Int? = readLine()?.toInt()

    when (operation) {
        1 -> soma(a, b, resultado = (::println))
        2 -> subtracao(a, b, resultado = (::println))
        3 -> multiplicacao(a, b, resultado = (::println))
        4 -> divisao(a, b, resultado = (::println))
    }
}

fun soma(a: Float?, b: Float?, resultado: (Float) -> Unit) { resultado(a!! + b!!) }

fun subtracao(a: Float?, b: Float?, resultado: (Float) -> Unit) { resultado(a!! - b!!) }

fun multiplicacao(a: Float?, b: Float?, resultado: (Float) -> Unit) { resultado(a!! * b!!) }

fun divisao(a: Float?, b: Float?, resultado: (Float) -> Unit) { resultado(a!! / b!!) }