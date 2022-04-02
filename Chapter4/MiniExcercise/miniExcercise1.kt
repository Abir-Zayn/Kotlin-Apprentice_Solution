package Chapter4.MiniExcercise

/*
Create a constant called myAge and set it to your age. Then, create a constant
named isTeenager that uses Boolean logic to determine if the age denotes
someone in the age range of 13 to 19
 */
const val age = 21
fun main() {
    var userage= readLine()!!.toInt()
    if(userage in 13..19){
        println("Userage is in range of 13 to 19")
    }

}