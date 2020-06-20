import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val numbers = scanner.nextInt()

    var max = 0
    var maxIndex = 0
    for (i in 0 until numbers) {
        val elem = scanner.nextInt()

        if (elem > max) {
            max = elem
            maxIndex = i
        }
    }

    println(maxIndex)
}