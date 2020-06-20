package signature

import com.sun.xml.internal.fastinfoset.util.StringArray
import java.io.File
import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.max

fun main() {
    val basePath = "C:\\Users\\Perl99\\IdeaProjects\\ASCII Text Signature\\"
    val mediumFont = loadFont(basePath + "ASCII Text Signature\\task\\src\\signature\\medium.txt")
    val romanFont = loadFont(basePath + "ASCII Text Signature\\task\\src\\signature\\roman.txt")

    val scanner = Scanner(System.`in`)

    print("Enter name and surname: ")
    val name = scanner.nextLine()

    print("Enter person's status: ")
    val status = scanner.nextLine()

    printSignature(name, status, mediumFont, romanFont)
}

private fun loadFont(filePath: String): ArrayList<StringArray> {
    val scanner = Scanner(File(filePath))

    val rows = scanner.nextInt()
    val chars = scanner.nextInt()

    val font = arrayListOf<StringArray>()

    repeat(chars) {
        /* val letter = */ scanner.next().first()
        /* val length = */ scanner.nextInt()

        // skip line ending
        scanner.skip("\n")

        val letterArray = StringArray(rows, rows, true)
        repeat(rows) {
            letterArray.add(scanner.nextLine())
        }
        font.add(letterArray)
    }

    return font
}

private fun printSignature(name: String, status: String, mediumFont: ArrayList<StringArray>, romanFont: ArrayList<StringArray>) {
    val nameStringRows = getNameStringRows(name, romanFont)
    val nameStringRowLength = nameStringRows[0].length
    val statusStringRows = getNameStringRows(status, mediumFont)
    val statusLength = statusStringRows[0].length

    val innerLength = max(nameStringRowLength, statusLength)
    val signatureLengthWithoutBorders = innerLength + 4

    val spacesBeforeName = (signatureLengthWithoutBorders - nameStringRowLength) / 2
    val spacesAfterName = signatureLengthWithoutBorders - nameStringRowLength - spacesBeforeName

    val spacesBeforeStatus = (signatureLengthWithoutBorders - statusLength) / 2
    val spacesAfterStatus = signatureLengthWithoutBorders - statusLength - spacesBeforeStatus

    printTimes('8', signatureLengthWithoutBorders + 4)
    println()

    val nameRows = romanFont[0].size
    repeat(nameRows) { row ->
        print("88")
        printTimes(' ', spacesBeforeName)
        print(nameStringRows[row])
        printTimes(' ', spacesAfterName)
        println("88")
    }

    val statusRows = mediumFont[0].size
    repeat(statusRows) { row ->
        print("88")
        printTimes(' ', spacesBeforeStatus)
        print(statusStringRows[row])
        printTimes(' ', spacesAfterStatus)
        println("88")
    }

    printTimes('8', signatureLengthWithoutBorders + 4)
    println()
}

private fun getNameStringRows(name: String, font: ArrayList<StringArray>): StringArray {
    val nameString = StringArray()

    val letterLength = font[0][0].length
    val rows = font[0].size
    repeat(rows) { row ->
        var stringRow = ""

        repeat(name.length) { i ->
            val letter = name[i]

            val bigLetter = if (letter == ' ') {
                " ".repeat(letterLength)
            } else {
                getLetterRow(letter, row, font)
            }

            stringRow += bigLetter
        }
        nameString.add(stringRow)
    }

    return nameString
}

private fun getLetterRow(letter: Char, row: Int, font: ArrayList<StringArray>): String {
    val position = if (letter.isLowerCase()) {
        letter - 'a'
    } else {
        letter - 'A' + (font.size / 2)
    }

    return font[position][row]
}

private fun printTimes(char: Char, times: Int) {
    repeat(times) {
        print(char)
    }
}
