package Chapter4.ChallengeSolution

import java.util.*

fun main() {
    var currentYear:Int= readLine()!!.toInt()
    var month:String= "February".lowercase(Locale.getDefault())
    var days=0

    if(currentYear%4==0){
        if(month=="february"){
            days=29
        }
        else days=30
    }else if(currentYear%400==0){
        if(month=="february"){
            days=29
        }
        else days=30
    }else{
        if(month!=="february"){
            days=28
        }
        else days=30
    }
    println(days)
}