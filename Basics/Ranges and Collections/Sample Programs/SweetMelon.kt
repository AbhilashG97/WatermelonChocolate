fun main(args: Array<String>) {
    
    var immutableMap = mapOf(1 to "Watermelon", 2 to "Lychee", 3 to "Apple", 4 to "Orange")
    for(key in immutableMap.keys) {
        println(immutableMap.get(key))
    }
    println()

    var sortedMap = sortedMapOf(3 to "Watermelon", 4 to "Apple", 2 to "Soursop", 1 to "Mango")
    sortedMap.forEach {
        key, value -> run {
            println("$key -> $value")
        }
    }  
}