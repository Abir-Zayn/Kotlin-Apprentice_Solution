package Chapter4.CodeAlong

fun main() {
    /*
    Sometimes you want to
    check one condition, then another. This is where else-if comes into play
     */
    val hourofDay=12

    val timeOFday= if(hourofDay<6){
        "early morning"
    }else if(hourofDay<12){
        "Morning"
    }else if(hourofDay<17){
        "Afternoon"
    }else if(hourofDay<20){
        "Evening"
    }else if(hourofDay<24){
        "Late Evening"
    }else{
        "Invalid Hour"
    }
    println(timeOFday)

}