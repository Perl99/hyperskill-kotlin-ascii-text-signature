import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()
    val num = IntArray(n) { scanner.nextInt() }
    val shift = scanner.nextInt() % num.size

    val numShifted = IntArray(n)

    for (i in 0 until num.size - shift) {
        numShifted[i + shift] = num[i]
    }

    for (i in 0 until shift) {
        numShifted[i] = num[num.size - shift + i]
    }

    for (e in numShifted) {
        print(e)
        print(" ")
    }
}