package Chapter4.ChallengeSolution

fun main() {
    val answer1= true && true
    val answer2= false||false
    val answer3= (true && 1!=2)||(4>3 && 100<1)
    val answer4 = ((10/2)>3)&&((10%2)==0)
    println("""
        answer 1    $answer1
        answer 2    $answer2
        answer 3    $answer3
        answer 4    $answer4
    """.trimIndent())

}