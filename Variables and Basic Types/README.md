# Basic Dataypes in Kotlin

## Variables

We can declare variables in Kotlin using ```var``` and ```val```. 

```var``` is used for declaring mutable variables, i.e. their value can be changed after declaring them. 

```val``` is used to declare immutable variables, i.e. their value cannot be changed after declaring them. 

You can find a simple example [here](Yum.kt) and [here](RedJam.kt).

:warning: If we try to assign a new value to a ```val``` variable, compilation error wil be thrown. 

:boom: Variables declared with ```val``` cannot be left uninitialized  unless their type is specified. An example is given below -

```kotlin
val awesomeFruit; // This won't compile

val favoriteFruit: String; // This will compile
```
:boom: It is not possible to declare multiple variables in the same line in ```Kotlin```.

:exclamation: The type of a varible is inferred by the compiler in Kotlin. Look [here](Silver.kt) for an example.

:boom: ```var``` and ```val``` have to be used to declare a varible. A variable cannot be declared withou them. 

## Basic Types

In Kotlin all types are Objects.

Some of them are listed below - 

| Variable Type | Size of the data type |
|---------------|-----------------------|
| Int           | 4 bytes               |
| Long          | 8 bytes               |
| Short         | 2 bytes               |
| Byte          | 1 byte                |
| Float         | 4 bytes               |
| Double        | 8 bytes               |

:warning: To represent Float and Long values ```F``` and ```L``` suffixed at the end of the values. 

:warning: Similarly, hex and binary values are represented by prefixing ```0x``` and ```0b``` repectively. Examples are shown below.

```kotlin 
var longValue = 12L
var floatValue = 4F
var hexValue = 0x00
var binaryValue = 0b0101
```
## Data Type Conversions

```Kotlin``` also provides helper functions that can be used to convert one data type into another.

The helper functions are as follows - 

1.  ```toByte()``` 
1.  ```toInt()```
1.  ```toLong()```
1.  ```toFloat()```
1.  ```toDouble()```
1.  ```toShort()``` 
1.  ```toString()```
1.  ```toChar()```

:warning: Using ```toInt()``` on Long will truncate the value.

## Other Data Types

```Kotlin``` also has ```String``` and ```Boolean``` data types.

1.  **Boolean**
    
    A Boolean variable can store ```true``` or ``false``` values.

1.  **String**

    Strings can be created with double or triple quotes. An exmaple can be found [here](LalMirchi.kt).

:boom: String interpolation is possible is ```Kotlin```. The ```$``` can also be used to evaluate expressions inside in a String.


## Arrays

There are two ways to create an Array in ```Kotlin```, which are as follows - 

1.  Using the constructor ```Array()```
1.  Using the helper function ```arrayOf()```

:warning: Along with the helper function, other utility functions are also available which can be used to create Arrays. 

Some of the utilty functions are as follows - 

1.  ```intArrayOf()```
1.  ```charArrayOf()```
1.  ```byteArrayOf()```

and so on. 

:warning: Also, please have a look at [this](https://stackoverflow.com/questions/44239869/whats-the-kotlin-equivalent-of-javas-string) StackOverflow post. 

Exmaples can be found [here](MelonArray.kt)

:warning: Please have a look at [this](https://stackoverflow.com/questions/44239869/whats-the-kotlin-equivalent-of-javas-string) StackOverflow post.