import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()
    val nums = IntArray(n)

    repeat(n) {
        nums[it] = scanner.nextInt()
    }

    val numsShifted = IntArray(n)
    for (i in 0 until nums.lastIndex) {
        numsShifted[i + 1] = nums[i]
    }
    numsShifted[0] = nums.last()

    for (e in numsShifted) {
        print(e)
        print(" ")
    }
}