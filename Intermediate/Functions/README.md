# Functions

This section is all about ```Functions``` in ```Kotlin```. 

## Introduction

A function contains a set of statements that perform a particular task. In ```Kotlin``` functions can be created using the ```fun``` keyword. 

A simple ```Kotlin``` function is shown below - 

```kotlin 
fun sayHello(name : String) : String {
    return "Hello, $name!";
}
```
:star: The above function contains a single parameter of type String and it also returns a String.

:warning: If no return type is specified, ```Unit``` will be taken as the return type by default. 

```kotlin
fun sayByeBye(name: String) {
    print("Bye bye, $name")
}
```

:exclamation: In the above example the return type is ```Unit```.

### Single-Line Functions

```Kotlin``` also allows us to declare single-line functions. Please look [here](Sample%20Programs/CuteMelon.kt) for an example.

:warning: In single-line functions the braces and return type need not be written as the compiler automatically infers it. 

## Named Parameters

```Kotlin``` supports named parameters. Named parameters make the code readable and easy to understand. 

:warning: When using named parameteres we can change the order in which the parameters are passes to the function.

An example can be found [here](Sample%20Programs/CurvyMelon.kt).

## Default Parameters

Default values can be given to the parameters of a function in ```Kotlin```.

[Here](Sample%20Programs/CurvyMelon.kt) is an example. 

## Java Interoperability

Since Java doesn't support Default Parameters, ```Kotlin``` has the ```JvmOverloads``` annotation which will instruct the Kotlin compiler to generate the Java overloaded functions for us. 

An example can be found below - 

```kotlin 
@JvmOverloads
fun makeColdDessert(fruit: String, icecreamFlavor: String, servings: Int = 2) {
    println("Dessert Name - $fruit - $icecreamFlavor Dessert")
    println("Servings - $servings")
}
```

## Unlimited Arguments and the Spread Operator

```Kotlin``` has ```vararg``` which is equivalent to the ```...``` operator in ```Java```. 

:warning: ```vararg``` is a modifier in ```Kotlin```. This modifier allows callers to pass comma-separated list of arguments. 

:boom: The ```vararg``` modifier is typically used at the end when multiple arguments are present. However, the modifier can be used at other positions if the named parameters are used.

A simple example can be found below - 

```kotlin 
fun processNumbers(numberOfItems: String, vararg ints: Int) {
    println("$numberOfItems" have been provided);
    var sum = 0;
    for(number in ints) {
        sum += number
    }
    println("The sum of all the numbers in $sum")
}
```

:warning: When an array is passed to a ```vararg``` parameter of a function the compiler shows an error. In order to avoid such an error, we have to unpack the array which can be done by using the ```Spread Operator```, denoted by ```*```.

A simple example is shown below -

```kotlin 
var numberArray = intArrayOf(1, 3, 4, 6, 6, 3)
processNumbers("6", *numberArray)
```

More examples can be found [here](Sample%20Programs/BeautifulMelon.kt).

## Returning Multiple Values

```Kotlin``` provides us with ```Pair``` and ```Triple``` which can be used to return multiple values from a function. 

Both ```Pair``` and ```Triple``` are generic. 

:warning: ```require``` keyword can be used to ensure the parameter(s) of a function have the required values before it can be run.

```kotlin
fun printNumbers(size: Int, numbers: Array<Int>) {
    require(size > 1, {"Array does not contain enough items"})
}
```

:star: Examples can be found [here](Sample%20Programs/PrettyMelon.kt).