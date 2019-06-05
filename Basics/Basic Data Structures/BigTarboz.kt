fun main(args : Array<String>) {

    var myFavFruitArray = arrayOf("apple", "kiwi", "watermelon", "orange")
    var differentData = arrayOf("This array contains everything", 121, 212.33, 's', false)

    println(myFavFruitArray[0])
    println("Horay!! ${differentData[4]}")

    var integerArray = arrayOf<Int>(20, 1997, 9)
    var stringArray = arrayOf<String>("This", "is", "a", "string", "array")
    var floatArray = arrayOf<Float> (212.43F, 22.32F)

    println("This is an integer<> array ${integerArray[2]}")
    println("This is a string<> array.... A ${stringArray[3]} ${stringArray[4]}")
    println("This is a float<> array....  ${floatArray[1]}")

    var anotherIntegerArray = intArrayOf(12,432,4232,1212)
    var anotherFloatArray = floatArrayOf(12.3F, 23.432F, 323.43F)
    var doubleArray = doubleArrayOf(212.32323, 323434.332, 323.543)

    println(doubleArray[1])
}