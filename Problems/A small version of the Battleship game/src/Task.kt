import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val freeXs = BooleanArray(5) { true }
    val freeYs = BooleanArray(5) { true }

    repeat(3) {
        val x = input.nextInt()
        val y = input.nextInt()

        freeXs[x - 1] = false
        freeYs[y - 1] = false
    }

    var xPrinted = false
    for (i in freeXs.indices) {
        if (freeXs[i]) {
            if (xPrinted) {
                print(" ")
            }

            print(i + 1)
            xPrinted = true
        }
    }
    println()

    var yPrinted = false
    for (i in freeYs.indices) {
        if (freeYs[i]) {
            if (yPrinted) {
                print(" ")
            }

            print(i + 1)
            yPrinted = true
        }
    }
}