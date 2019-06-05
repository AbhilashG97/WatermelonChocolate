fun main(args: Array<String>) {

    var melonIntegerArray = Array<Int>(12, { i -> i*10 })
    var numberArray = intArrayOf(12, 43, 434, 323, 5443, 6485, 232)
    // Iteration using the indices property 
    for(index in melonIntegerArray.indices) {
        println("Melon -> ${melonIntegerArray[index]}")
    }

    // Iteration using withIndex() function
    for((index,value) in melonIntegerArray.withIndex()) {
        println("$index -> $value")
    }

    for(index in numberArray.indices) {
        if(numberArray[index] % 2 ==0) {
            println("This is an even number ${numberArray[index]}")
        } else {
            println("This is an odd number ${numberArray[index]}")
        } 
    }

    println("\nUsing withIndex() function\n")

    for((watermelon, orange) in numberArray.withIndex()) {
        if(orange%2 == 0) {
            println("Even number ${orange} at $watermelon")
        } else {
            println("Odd number ${orange} at $watermelon")
        }
    }

}