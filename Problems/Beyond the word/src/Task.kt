import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val word = input.next()

    for (l in 'a'..'z') {
        var found = false
        for (e in word) {
            if (l == e) {
                found = true
                break
            }
        }

        if (!found) {
            print(l)
        }
    }
}