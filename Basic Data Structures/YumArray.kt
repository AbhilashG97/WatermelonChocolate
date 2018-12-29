fun main (args : Array<String>) {

    var myArray = intArrayOf(12, 432, 4, 3, 99)
    println(myArray.get(0))

    myArray.set(2, 54)
    
    var size : Int

    var myNewArrayList = arrayListOf(12, 32, 434, 23, 42)
    size = myNewArrayList.size
    println(myNewArrayList+" The size of the arrayList is -> $size")

    var name : String = "HimmelDreng"
    var favoriteFruit : String = "watermelon"

    println("I am $name and my favorite fruit is $favoriteFruit"); 
}