fun main(args: Array<String>) {
    
    var fruits = arrayOf("Watermelon", "Kiwi", "Orange", "Pineapple")

    for((index, value) in fruits.withIndex()) {
        if(value.first() == 'W') {
            println("Yay! Watermelon is at index $index")
        } else {
            println("No watermelon :(");
        }
    }
}