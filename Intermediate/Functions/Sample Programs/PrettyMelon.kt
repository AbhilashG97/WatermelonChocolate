fun createCakeAndIcecream(vararg cakeStuff: String, icecreamStuff: String): Pair<String, String> {
    var cake: String = ""

    for(item in cakeStuff) {
        cake += "$item "
    }

    return Pair (cake, icecreamStuff)
}

fun getStatistics(numbers: Array<Int>): Triple<Double?, Double?, Int?> {
    
    require(numbers.size > 3, {"length of the array is insufficient"})
    
    var sum: Double = 0.0
    var mean: Double
    var mode: Int = 0

    var tempArray = IntArray(numbers.size)

    for((index, value) in numbers.withIndex()) {
        sum += value
        tempArray[index]++
    }

    for(index in tempArray.indices) {
        if(mode < tempArray[index]) {
            mode = index
        }
    }

    mean = sum/numbers.size
    return Triple(sum, mean, mode)
}

fun main(args: Array<String>) {
    var (cake, icecream) = createCakeAndIcecream(cakeStuff = *arrayOf("Chocolate, Chocolate Chip"), icecreamStuff = "Butterscotch")
    println(cake)
    println(icecream)

    var (sum, mean, mode) = getStatistics(Array(10, { i -> i + 1 }))
    println("Sum: $sum, Mean: $mean, Mode: $mode")
}