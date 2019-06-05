fun main(args: Array<String>) {

    // Elvis Operator
    var badVegetable : String? = null
    var badVegetableLength : Int? = badVegetable?.length ?: 0
    println("I don't like this vegetable - $badVegetableLength")

    var someNumber : Int? = null
    var luckyNumber : Int = someNumber ?: 2

    println("My lucky number is $luckyNumber")

}