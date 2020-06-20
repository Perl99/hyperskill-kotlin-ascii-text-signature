import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val nextLine = scanner.nextLine()

    val print = when (nextLine) {
        "gryffindor" -> "bravery"
        "hufflepuff" -> "loyalty"
        "slytherin" -> "cunning"
        "ravenclaw" -> "intellect"
        else -> "not a valid house"
    }
    println(print)
}