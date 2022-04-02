package Chapter4.CodeAlong

fun main() {

    val and = true && true
    val or = true || false
    println("value of and -> $and , Value of or ->$or")

    var andTrue = 1<2 && 4>3
    val andFalse = 1<2 && 3>4
    println("value of andTrue -> $andTrue , Value of andFalse ->$andFalse")

    val orTrue = 1<2 || 3>4
    val orFalse = 1==2||3==4
    println("value of orTrue-> $orTrue , Value of orFalse ->$orFalse")

}