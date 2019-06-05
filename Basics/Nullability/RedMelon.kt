fun main(args : Array<String>) {

    // Kotlin is a null safe and will not allow any operation anything that can
    // invoke a NullPointerException    

    // To allow the program to be complied we have to use the safe call operator 

    var myFavoriteVegetable : String? = null
    var mayFavoriteFruit : String? = "Watermelon"
    println("My favorite vegetable is these many characters long - ${myFavoriteVegetable?.length}")

    println("And my fruit is these many characters long - ${mayFavoriteFruit?.length}")

    // If we don't use the null safe operator the code will not compile
}