package Chapter4.CodeAlong

fun main() {
    var sum=1

    while (true){
        sum += (sum + 1)
        if(sum>=1000){
            break
        }
    }
}