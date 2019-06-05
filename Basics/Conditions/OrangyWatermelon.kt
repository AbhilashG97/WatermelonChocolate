/**
 * Simple example to demonstrate the use of a when statement
 */
fun main(args: Array<String>) {
    var fruitList = arrayOf<String>("watermelon", "mango", "apple", "orange")

    fruitList.forEach { 
        fruit ->  run {
            when (fruit) {
                "watermelon", "apple" -> println("$fruit is delicious")
                "mango" -> println("Yummy")
                else -> println("naaaah")
            }
        }
    }

    var numberList = arrayOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 11)

    numberList.forEach {
        number -> run {
            when {
                number == 1 -> println("One!!!")
                number == 2 -> println("Two!!!")
                number == 3 -> println("Three!!!")
                number == 4 -> println("Four!!!")
            }
        }
    }
}