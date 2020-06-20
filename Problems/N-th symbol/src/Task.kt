import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val line = scanner.nextLine()
    val index = scanner.nextInt()

    println("Symbol # $index of the string \"$line\" is '${line[index - 1]}'")
}