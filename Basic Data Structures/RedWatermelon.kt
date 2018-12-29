fun main(args : Array<String>) {
    
    var size : Int = 12
    var someArray = Array(size , {i -> i * 2} )
    println("This is an array od size $size and the 2 element is ${someArray[2]}")

    var awesomeArray = Array<String> (size, { i -> "Apple + $i"})
    println("This is an awesome array ${awesomeArray[11]}")

    var soManyWatermelons = Array<String>(size, { _ -> "watermelon"})
    println("This is an watermelon array, and guess what it contains? ------ ${soManyWatermelons[2]}!!")

}   