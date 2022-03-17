package Chapter8.ProblemSolvinb


fun main() {

    /*
    Arrays and lists have a reverse() method that reverses all the elements inplace, that is, within the original array or list. Write a function that does a similar
    thing, without using reverse(), and returns a new array with the elements of the
    original array in reverse order. This is the signature of the function:

    fun reverse(array: Array<Int>): Array<Int>
     */

    var arr= arrayOf(1,2,3,6,7,8)
    reverse(arr).forEach { print(" $it") }

}

fun reverse(array:Array<Int>): IntArray {
    val a = array
    val b = IntArray(array.size)

    var reversingIndex = b.size-1
    for(index1 in a.indices){
       b[index1]=a[reversingIndex]
        reversingIndex--
         b[index1]

    }
    return b
}