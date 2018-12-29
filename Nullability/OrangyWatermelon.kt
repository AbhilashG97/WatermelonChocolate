fun main(args: Array<String>) {

    // Elvis Operator
    var badVegetable = null
    var badVegetableLength = badVegetable ?: "Bitter Gaurd"
    println("I don't like this vegetable - $badVegetableLength")

    var someNumber : Int? = null
    var luckyNumber : Int = someNumber ?: 2

    println("My lucky number is $luckyNumber")

}