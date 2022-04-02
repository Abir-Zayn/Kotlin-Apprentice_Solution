package Chapter4.ChallengeSolution

import kotlin.math.pow

fun main() {
    println("Printing a table of first 10 powers of 2")
    var x=0.0

    repeat(10){
        println("Power of 2 is : ${2.00.pow(x).toInt()}")
        x++
    }
}