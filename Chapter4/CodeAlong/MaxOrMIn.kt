package Chapter4.CodeAlong

fun main(){
    /*
    If you wanted to determine the minimum and maximum of two variables, you could
    use if expressions like so:
     */
    val x=5
    val y=10
    val minimum = if(x<y) x else y
    println("min is: $minimum")
    val maximum = if(x>y) x else y
    println("max is: $maximum")
}