fun main(args: Array<String>) {
    // the in operator can be used to access items in 
    // a given range
    var sampleRange: IntRange = 1..10
    for(item in sampleRange) {
        println(item)
    }
    println()

    // Character ranges can also be created using the
    // rangeTo() or .. operator

    var charRange = 'a'.rangeTo('z')
    for(alphabet in charRange) {
        println(alphabet)
    }
    println()

    var decreasingCharacters = 'z'.downTo('a')
    for(alphabet in decreasingCharacters) {
        println(alphabet)
    }
    println()

    var someNumberRange = 100...225
    if (250 in someNumberRange) {
        println("yay!!!")
    } else {
        println"booooo!!!")
    }
}