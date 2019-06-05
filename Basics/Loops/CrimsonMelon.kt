fun main(args: Array<String>) {

    var someNumber : Int = 20

    // While loop
    while(someNumber > 0) {
        println("While loop -> Print Watermelon $someNumber times")
        someNumber-- ;
    }

    // Do..While loop
    someNumber = 20 
    do {
        println("Do While loop - $someNumber")
        someNumber--
    } while (someNumber > 0)

    
    // For loop
    for(melonyNumber in 5..15) {
        println("This is a number $melonyNumber")
    }

}