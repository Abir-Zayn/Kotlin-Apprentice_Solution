package Chapter4

fun main() {
    var givenNumber = 10
    var cube1 = 1
    var cube2 = 1
    var count = 0
    var allCombinations = 36

    while (true) {

        if (cube1 + cube2 == givenNumber) {
            count += 1
        }

        if (cube1 != 6) {
            cube1 += 1
        } else {
            cube1 = 1
            cube2 += 1
        }

        if (cube1 == 6 && cube2 == 6) {
            break
        }
    }

    var probability = (count) / (allCombinations)
    print(probability)
}