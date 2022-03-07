package Chapter3.CodeAlong

fun main() {

    //Creating a Pair {MEthod-1}
    val cordinate:Pair<Int,Int> = Pair(2,3)
    //Creating a pair{MEthod-2}
    val pair2 = Pair(4,5)
    //creating a pair{Method-3}
    val pair3= 7 to 11
    println(pair3.first) //Accessing the pair value
    println(pair3.second)

    //Creating a Triple
    var tripleA:Triple<Int,Int,Char> = Triple(5,8,'a')
    println(""""Accessing the triple value:
        | ${tripleA.first}
        | ${tripleA.second}
        | ${tripleA.third}
    """.trimMargin())


}