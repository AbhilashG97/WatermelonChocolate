fun processNumbers(numberOfItems: String, vararg numbers: Int) {
    println("The number of elements present are $numberOfItems")
    var sum: Int = 0
    for (number in numbers) {
        sum += number
    }
    println("The sum of the numbers is: $sum")
}

fun main(args: Array<String>) {
    var numberArray = intArrayOf(1, 2, 454, 900, 100, 3, 89)
    processNumbers(numbers = *numberArray, numberOfItems = "7")
}