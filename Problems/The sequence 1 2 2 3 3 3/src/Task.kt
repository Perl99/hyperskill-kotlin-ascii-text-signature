import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()

    var el = 1
    var rep = 1

    repeat(n) {
        print("$el ")
        rep++

        if (rep > el) {
            rep = 1
            el++
        }
    }
}