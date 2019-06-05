fun main(args: Array<String>) {

    var randomArray = arrayOf("Watermelon", 1232, 4334.53, 'W', 32323323232)

    for(index in randomArray.indices) {
        if(randomArray[index] is String) {
            println("Yay! A string is at index $index in this array -> ${randomArray[index]}")
        } else if (randomArray[index] is Int){
            println("Yay! An integer is at index $index in this array -> ${randomArray[index]}")
        } else {
            println("Wow! ${randomArray[index]}")
        }
    }
}