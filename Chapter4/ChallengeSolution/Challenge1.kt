package Chapter4.ChallengeSolution

fun main() {

    val firstname="Ray"
    if(firstname=="Howard"){
        val lastName="Lucas"
    }else if(firstname=="Ray"){
        val lastName="Wenderlich"
    }
    val fullName=firstname+" "//+ lastName
    //Error in Last name ! -> because lastName is local Variable and its only accesible in the block of
    // controll flow statement not in the function.
}