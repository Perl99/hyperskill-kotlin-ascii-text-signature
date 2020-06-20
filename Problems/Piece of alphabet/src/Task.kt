import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val word = scanner.next()

    for (i in 1 until word.length) {
        if (word[i] - word[i - 1] != 1) {
            println(false)
            return
        }
    }

    println(true)
}