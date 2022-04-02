package Chapter4.MiniExcercise

/*
Create a constant named reader and set it to your name as a string. Create a
constant named author and set it to my name, Richard Lucas. Create a constant
named authorIsReader that uses string equality to determine if reader and
author are equal.
 */
fun main() {
    var reader ="Abir Zayn"
    var author= "Richard Lucas"
    var equals = reader==author
    println("IS reader and author name is equal? $equals")
    /*
    Create a constant named readerBeforeAuthor
    which uses string comparison to
    determine if reader comes before author
     */
    var readBeforeAuthor = reader<author
    println("Is reader names word comes first than authors name?$readBeforeAuthor")

}