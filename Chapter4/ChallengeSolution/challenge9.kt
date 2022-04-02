package Chapter4.ChallengeSolution

fun main() {
    /*
    Given a number n, calculate the factorial of n.
    (Example: 4 factorial is equal to 1 *2 * 3 * 4.
     */
    var n= readLine()!!.toInt()
    var temp=1

    while(n>0){
        temp *= n
        n--
    }
    println(temp)
}