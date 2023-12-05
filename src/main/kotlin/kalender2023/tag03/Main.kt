package kalender2023.tag03

import java.io.BufferedReader
import java.io.File

fun main() {
    val bufferedReader1: BufferedReader = File("src/main/resources/2023/03/in").bufferedReader()
    val in1 = bufferedReader1.use { it.readText() }.split(System.lineSeparator())
    println(in1.size)
    println("There are " + countBroken(in1) + " broken departments")
}

fun countBroken(data: List<String>): Int {
    return (data.map { s -> if (isBroken(s)) 1 else 0 } as List<Int>).sum()
}

fun isBroken(s: String): Boolean {
    var status: Int = 0
    for (c:Char in s) {
        if (c.equals('[')) {
            status++
        } else {
            status--
        }
    }
    println(status)
    if (status == 0) return false else return true
}