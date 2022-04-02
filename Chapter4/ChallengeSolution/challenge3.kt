package Chapter4.ChallengeSolution

import kotlin.math.sqrt
import kotlin.system.exitProcess

fun main() {
    var a=1
    var b:Double=-8.0
    var c:Double=5.0
    var Posx:Double=0.0
    var negX:Double=0.0
    if(a ==0){
        println("If a value is equals to 0 then the equation will be linear.")
        exitProcess(1)
    }else{
        Posx= (-b+ sqrt(b*b-(4*a*c)))/2
        negX= ((-b- sqrt(b*b-(4*a*c))))/2
    }
    println(Posx.toFloat())
    println(negX.toFloat())

}