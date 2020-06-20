import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val word = scanner.next()

    val counts = IntArray('z' + 1 - 'a') { 0 }

    for (l in word) {
        counts[l - 'a']++
    }

    var numberOfSingleLetters = 0
    for (c in counts) {
        if (c == 1) {
            numberOfSingleLetters++
        }
    }

    println(numberOfSingleLetters)
}