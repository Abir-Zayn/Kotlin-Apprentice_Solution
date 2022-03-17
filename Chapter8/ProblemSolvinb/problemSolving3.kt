package Chapter8.ProblemSolvinb

fun main() {

    /*
    Write a function that removes all occurrences of a given integer from a list of
    integers. This is the signature of the function:
    fun remove(item: Int, list: List<Int>): List<Int>
     */


    var a:List<Int> = listOf(2,7,9,9,10)
    println(removeAll(9,a))

}
fun removeAll(item:Int, list: List<Int>):List<Int>{
    var newList = list.toMutableList()

    for(i in list.indices){
        if(newList.contains(item)){
            newList.removeAll(listOf(item))
            return newList.toList()
        }
    }
    return newList.toList()
}