package Chapter8.CodeAlong

fun main() {

    val outerplanets = mutableListOf<String>("Jupiter","earth","Saturn","Neptune")
    var exoplanets   = mutableListOf<String>()
    exoplanets.add("sun")

    if(exoplanets.size<2){
        println("Confirmed to add in solar system.")
        outerplanets.addAll(exoplanets)
        println(outerplanets)
    }else{
        println("not added")
    }

    println(outerplanets.last()) //last value in outplanets list
    val arr = mutableListOf<Int>(1,9,11,12,15,18,21)

    //Mutuable List Function
    println(arr.min())
    println(arr.first())
    println(arr.max())
    arr[2] = 111
    println(arr.size)

    println(arr)
    arr.clear()

}