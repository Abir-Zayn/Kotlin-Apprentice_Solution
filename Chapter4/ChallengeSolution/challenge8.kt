package Chapter4.ChallengeSolution

fun main() {
    var n= readLine()!!.toInt()
    println("Fibonicci Number of $n is ")
    var x=0
    var y=1
    var z=0
    var limit=n
    n=0

    while(n<=limit){
        z=x+y
        println("$z")
        x=y
        y=z
        n++
    }
}