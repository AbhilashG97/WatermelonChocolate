fun main(args : Array<String>) {

    val myName = "HimmelDreng"
    val myAge = 20;
    var fruit = "watermelon"

    println("Is my favorite fruit watermelon? ${if(fruit.equals("watermelon")) "yes" else "no" }")    
    println("The first letter of my username $myName is ${myName.first()}")
    println("Is my age less then 30? ${myAge < 30}")

}