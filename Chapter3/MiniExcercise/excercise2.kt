package Chapter3.MiniExcercise

fun main() {
    var date= readLine()!!.toInt()
    var month= readLine().toString()
    var year= readLine()!!.toInt()

    var time=Triple(date,month,year)
    println("""
        Date     :  ${time.first}
        Month    :  ${time.second}
        Year     :  ${time.third}
    """.trimIndent())
}