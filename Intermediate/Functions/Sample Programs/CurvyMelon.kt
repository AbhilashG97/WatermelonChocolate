fun makeFruitShake(fruit: String, toppings: String, icecreamFlavor: String) {
    println("Created Fruit Shake: $fruit - $icecreamFlavor shake with $toppings")
}

fun makeColdDessert(fruit: String, icecreamFlavor: String, servings: Int = 2) {
    println("Dessert Name - $fruit - $icecreamFlavor Dessert")
    println("Servings - $servings")
}

fun main(args: Array<String>) {
    makeFruitShake(toppings="Dragon Fruit Cubes", icecreamFlavor="Lychee", fruit="Watermelon");
    println()
    makeColdDessert("Mango", "Vanilla")
}