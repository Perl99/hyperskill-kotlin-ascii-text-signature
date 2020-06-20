import java.util.*
import kotlin.math.ceil

fun main() {
    val scanner = Scanner(System.`in`)
    val upper = scanner.nextInt()
    val lower = scanner.nextInt()
    val digits = scanner.nextInt()
    val symbols = scanner.nextInt()

    val alphabet = ('a'..'z').joinToString("")
    val digitsString = ('0'..'9').joinToString("")

    val upperLetters = alphabet.toUpperCase().repeat(numRepeats(upper, alphabet.length)).take(upper)
    val lowerLetters = alphabet.repeat(numRepeats(lower, alphabet.length)).take(lower)
    val digitsPart = digitsString.repeat(numRepeats(digits, digitsString.length)).take(digits)

    // Separate using digits to avoid "Aa"
    // Append random on the end, in case some or all parts are empty
    val pass = "$upperLetters$digitsPart$lowerLetters!@"
    val passMax = pass.repeat(numRepeats(symbols, pass.length)).take(symbols)

    println(passMax)
}

fun numRepeats(input: Int, length: Int): Int {
    return ceil(input.toDouble() / length.toDouble()).toInt()
}