fun sayByeBye(name : String) : String {
    return "Bye bye, $name!"
}

fun sayGoodNight(name: String) : String = "Night night, $name!"

fun sayHi(name : String) = "Hi, $name!" 

fun main(args: Array<String>) {
    println(sayByeBye("Apple"))
    println(sayGoodNight("Lychee"))
    println(sayHi("Watermelon"))
}