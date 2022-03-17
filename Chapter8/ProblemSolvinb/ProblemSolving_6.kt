package Chapter8.ProblemSolvinb

fun main() {

    /*
    Write a function that calculates the minimum and maximum value in an array of
    integers. Calculate these values yourself; don’t use the methods min and max.
    Return null if the given array is empty.
    This is the signature of the function:

    fun minMax(numbers: Array<Int>): Pair<Int, Int>?
     */

    val arr= arrayOf<Int>(6,4,2,8,10,22,14,16)
    println(minMax(arr))

}
fun minMax(numbers: Array<Int>):Pair<Int,Int> {
    var minimum = numbers[0]
    var maximum = numbers[0]


    if (numbers.isNotEmpty()) {
        for (index in numbers.indices) {
            if (maximum < numbers[index]) {
                maximum = numbers[index]
            }
        }

        for (index in numbers.indices) {
            if (minimum > numbers[index]) {
                minimum = numbers[index]
            }
        }

    }
    return Pair(maximum, minimum)
}
