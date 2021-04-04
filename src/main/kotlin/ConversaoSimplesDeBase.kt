fun main(args: Array<String>) {

    var s: String
    val r = """0x.*""".toRegex()
    while(true) {

        s = readLine().toString()
        if (r.matches(s)) {
            println(Integer.parseInt(s.removeRange(0, 2), 16))
        } else {
            if (s.toInt() < 0) break
            println("0x${Integer.toHexString(s.toInt()).toUpperCase()}")
        }
    }
}
