fun helloUser(userName: String): String {
    return "Hello, $userName!"
}

fun main(args: Array<String>) {
    println("Hello, world!")

    if(!args.isEmpty()) {
        println(helloUser(args[0]))
    }
}