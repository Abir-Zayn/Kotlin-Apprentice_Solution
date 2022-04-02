package Chapter4.MiniExcercise

fun main() {
    /*
    Create a constant named myAge and initialize it with your age. Write an if
    expression to print out Teenager if your age is between 13 and 19, and Not a
    teenager if your age is not between 13 and 19.
     */
    val age=26
    if (age in 13..19){
        println("Teenager")
    }else if (age !in 13..19){
        println("Not a teenager")
    }
}