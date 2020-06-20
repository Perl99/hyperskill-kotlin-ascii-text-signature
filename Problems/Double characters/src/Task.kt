import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val word = scanner.next()

    for (w in word) {
        repeat(2) {
            print(w)
        }
    }
}