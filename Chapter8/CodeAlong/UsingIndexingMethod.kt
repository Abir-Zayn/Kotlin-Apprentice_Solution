package Chapter8.CodeAlong

fun main() {

    val players = mutableListOf("Alice","Bob","Cindy","Dan","Mike")

    //using index to get values
    println(players[0])

    //using slice to cut out the values in players
    var upComingSlice = players.slice(2..3)
    println(upComingSlice.joinToString())

    var removePlayer = players.removeAt(2)
    println(players)


     fun isEstimated(player:String):Boolean{
         return player !in players
     }
    println(isEstimated("noa"))

    println(players.indexOf("Dan"))
    players.sort()
    println(players)

    for((index,player) in players.withIndex()){
        index+1
        println("$index -> $player")
    }
}