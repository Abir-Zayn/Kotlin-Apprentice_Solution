package Chapter4.CodeAlong

fun main() {

    var hoursWorked = 45
    var price = 0
    if(hoursWorked>40){
        var extraPayment = hoursWorked-40
        price = extraPayment*50
        hoursWorked -= extraPayment
    }
    price += hoursWorked * 25
    println(price)
}