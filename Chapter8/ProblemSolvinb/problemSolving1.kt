package Chapter8.ProblemSolvinb

fun main() {

   /* Check out the following challenges to test your knowledge of Kotlin arrays and lists
    Which of the following 1-10 are valid statements?

    */












    //Wrong Statement  val array1 = Array<Int>()

    // wrong Statement val array2=arrayOf()

    val array3: Array<String> = arrayOf()
    val array4 = arrayOf(1,2,3)
    println(array4[0])
    // wrong statement println(array4[5])
    array4[0]=4


    val array5 =arrayOf(1,2,3)
    array5[0] = array5[1]
  // Wrong Statement -> Wrong Statement  array5[0] = "six"
   //wrong Statement -> array5 += 6

    for(item in array5){
        println(item)
    }



}
