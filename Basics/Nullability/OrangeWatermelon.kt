fun main(args : Array<String>) {
    
    // Kotlin is a null safe language 
    // The compiler won't allow anything that can throw an NullPointerException

    var awesomeFruit : String? = null
    awesomeFruit = "Watermelon"
    println("My favorite fruit is $awesomeFruit")    
}