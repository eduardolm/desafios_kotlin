fun main(args: Array<String>) {
    //continue a solução
    fun Float.format(digits: Int) = "%.${digits}f".format(this).replace(',','.')
    val r = readLine()!!.toFloat()
    var i = 0F

    if (r <= 2000.00  ) {
        i = 0F
    } else if (r > 2000.00 && r <= 3000.00) {
        i = 0.08F * (r - 2000.00F)
    } else if (r > 3000.00 && r <= 4500.00  ) {
        i = 0.08F * 1000.00F + 0.18F * (r - 3000.00F)
    } else if (r > 4500) {
        i = 0.08F * 1000.00F + 0.18F * 1500.00F + 0.28F * (r - 4500.00F)
    }
    if (i == 0F) println("Isento") else println("R$ ${i.format(2)}")
}
