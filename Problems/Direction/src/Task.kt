import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val nextInt = scanner.nextInt()

    val text = when (nextInt) {
        1 -> "move up"
        2 -> "move down"
        3 -> "move left"
        4 -> "move right"
        0 -> "do not move"
        else -> "error!"
    }

    println(text)
}