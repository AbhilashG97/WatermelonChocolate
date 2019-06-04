fun main(args : Array<String>) {
    
    var myFavotiteFruitList : Array<String> = arrayOf("watermelon", "kiwi", "orange")
    var vegetableList = arrayOf<String>("Chilli", "Potatoes", "Tomatoes", "Ginger")
    var emptyFruitList: Array<String?> = Array(0, {_ -> ""})
    var numberArray = intArrayOf(1, 2, 4, 5, 6)

    numberArray.forEach{ number -> println(number) }
    println()
    myFavotiteFruitList.forEach{item -> println(item)}
    println()    
    vegetableList.forEach(System.out::println)
    println()
    println(emptyFruitList.joinToString())
}