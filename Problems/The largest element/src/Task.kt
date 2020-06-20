import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    var maxN = 0
    do {
        val n = scanner.nextInt()

        maxN = kotlin.math.max(maxN, n)
    } while (n != 0)

    println(maxN)
}