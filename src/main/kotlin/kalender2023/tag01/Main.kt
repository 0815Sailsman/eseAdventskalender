package kalender2023.tag01

import java.io.File
import java.io.BufferedReader

fun main(args: Array<String>) {
    val bufferedReader1: BufferedReader = File("src/main/resources/2023/01/in1").bufferedReader()
    val in1 = bufferedReader1.use { it.readText() }.split(System.lineSeparator())
    val bufferedReader2: BufferedReader = File("src/main/resources/2023/01/in2").bufferedReader()
    val in2 = bufferedReader2.use { it.readText() }.split(System.lineSeparator())
    val bufferedReader3: BufferedReader = File("src/main/resources/2023/01/in3").bufferedReader()
    val in3 = bufferedReader3.use { it.readText() }.split(System.lineSeparator())
    val bufferedReader4: BufferedReader = File("src/main/resources/2023/01/in4").bufferedReader()
    val in4 = bufferedReader4.use { it.readText() }.split(System.lineSeparator())

    print(filter(filter(filter(in1, in2), in3), in4))
}

fun filter(in1: List<String>, in2: List<String>): List<String> {
    val res:List<String> = mutableListOf()
    for (s in in1) {
        if (in2.contains(s)) res.addLast(s)
    }
    return res
}