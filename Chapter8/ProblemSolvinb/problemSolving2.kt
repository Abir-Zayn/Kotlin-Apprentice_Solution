package Chapter8.ProblemSolvinb

fun main() {

    /*
    Write a function that removes the first occurrence of a given integer from a list of
    integers. This is the signature of the function:

    fun removeOne(item: Int, list: List<Int>): List<Int>
     */

    println("Printing all elements in the array")
    var selectedList = listOf<Int>(1,2,4,7,7,10,11)
    selectedList.forEach { print(" $it") }
    println()
    println("After removing element")
    println(remove(7,selectedList))

}

fun remove(item:Int,List:List<Int>):List<Int>{

    var newList:List<Int> = listOf()
    if(List.contains(item)){
        newList= List.minus(item)
    }

    return newList
}


