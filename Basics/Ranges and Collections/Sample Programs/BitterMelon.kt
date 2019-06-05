fun main(args: Array<String>) {
    
    // Lists
    var immutableList = listOf("watermelon", "apple", "orange", "melon")
    var emptyImmutableList = emptyList<String>()
    var nonNullImmutableList = listOfNotNull("apple-pie", "lemon-cake", null, "watermelon-icecream")

    var mutableList : ArrayList<String> = arrayListOf("Watermelon", "Mango", "Apple", "Lychee")
    mutableList.add("Dragon Fruit")
    for(item in mutableList) {
        println(item)
    }

    var anotherMutableList = immutableList.toMutableList()
    anotherMutableList[3] = "lychee"
    anotherMutableList.add("jack fruit")
    for(fruit in anotherMutableList) {
        println(fruit)
    }

    // Sets
    var immmutableSet = setOf("banana", "potato", "ginger")
    for(item in immmutableSet) {
        println(item)
    }
    println()

    var treeSet = sortedSetOf("Mango", "Apple", "Watermelon", "Orange", "Dragon Fruit")
    treeSet.addAll(listOf("Soursop", "Sapote"))
    for(item in treeSet) {
        println(item)
    }
}