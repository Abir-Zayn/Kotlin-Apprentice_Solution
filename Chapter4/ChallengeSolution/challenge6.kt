package Chapter4.ChallengeSolution

import kotlin.math.log

fun main() {
println(powerOfTwo(8))

}
fun powerOfTwo(n:Int):Int
{
    if(n==0) { return 0; }
    while(n != 1)
    {
        var n1 = n/2;
        if(n1%2 != 0 && n1!= 1){ return 0; }
        return n1
    }
    return 1;
}