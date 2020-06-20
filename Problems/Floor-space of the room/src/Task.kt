import java.util.*
import kotlin.math.sqrt

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val kind = scanner.next()

    val result = when (kind) {
        "triangle" -> calcTriangle(scanner)
        "rectangle" -> calcRectangle(scanner)
        "circle" -> calcCircle(scanner)
        else -> 0.0
    }

    println(result)
}

fun calcTriangle(scanner: Scanner): Double {
    val a = scanner.nextDouble()
    val b = scanner.nextDouble()
    val c = scanner.nextDouble()

    val p = (a + b + c) / 2

    val result = sqrt(p * (p - a) * (p - b) * (p - c))
    return result
}

fun calcRectangle(scanner: Scanner): Double {
    val a = scanner.nextDouble()
    val b = scanner.nextDouble()

    return a * b
}

fun calcCircle(scanner: Scanner): Double {
    val r = scanner.nextDouble()

    return 3.14 * r * r
}