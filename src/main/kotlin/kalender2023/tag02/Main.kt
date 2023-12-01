package kalender2023.tag02

import kalender2023.tag01.filter
import java.io.File
import java.io.BufferedReader

fun main(args: Array<String>) {
    val bufferedReader1: BufferedReader = File("src/main/resources/2023/02/<entername>").bufferedReader()
    val in1 = bufferedReader1.use { it.readText() }.split(System.lineSeparator())
}