package Chapter8.CodeAlong

fun main() {

    //easiest way to create an array
    var evenNumbers = arrayOf<Int>(2,4,8,10)

    //its possible to create an array with all of its values set to a default value
    var fiveOfFives = Array(5) { 5 }

    //Kotlin support different type of standard library function to create array
    var zeros=DoubleArray(4)  // DoubleArray of 4 size but value in it is 0

    var otherNumbers = arrayOf(1,3,7,9,11).toIntArray()

}