fun main() {
    val letter = readLine()!!.first().toLowerCase()

    val vowels = mutableMapOf<Char, Int>()
    vowels['a'] = 1
    vowels['e'] = 5
    vowels['i'] = 9
    vowels['o'] = 15
    vowels['u'] = 21

    if (vowels.contains(letter)) {
        println(vowels[letter])
    } else {
        println(0)
    }
}