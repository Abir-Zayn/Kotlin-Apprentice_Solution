package Chapter8.CodeAlong

fun main() {

    //Arrays are better than the list in the case of raw performance but the list have the additional feature of being
    //dynamically0sized means the array is fixed size whereas the list can be setup to grow and shrink as needed .


    //creating a list
    var innerplanets = listOf<String>("Mercury","Venus","Earth","Mars")
    var innerPlanrtsArrayList = arrayListOf<String>("Mercury","Venus","Earth")

    //To create an empty list it created by passing no arguments into list().
    var subscriberName:List<String> = listOf()

 }