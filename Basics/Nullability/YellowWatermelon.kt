fun main(args: Array<String>) {

    //safe-call operator    
    // calling methods on nullable will return null 

    var fruit : String? = null
    var fruitLength : Int? = fruit?.length
    // NullPointerException will be thrown if a method is called
    // on a null object

    var badFruitLength : Int = fruit!!.length

    println("The length of the fruit is $fruitLength")
    println("Guess what the length of the fruit is? $badFruitLength") // This will result in NPE 

    // We can bypass the nullabitly check of the kotiln compiler, but this will
    // result in NullPointerException being thrown during RunTime

    //println("This will trigger a NullPointerException $badFruitLength")
}