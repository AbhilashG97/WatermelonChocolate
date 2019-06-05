# Ranges and Collections

This section will cover topics related to ranges and collection. You can find sample programs inside the ```Sample Programs``` folder. 

## Ranges

Ranges in ```Kotlin``` have a start value and an end value. Ranges in ```Kotlin``` are **inclusive**. 

:warning: Both start and end are inclusive in ```Kotlin``` ranges.

The following functions can be used to create ranges - 

1. rangeTo()
2. downTo()

Also, ```..``` operator can also be used to create ranges. 


```in``` operator can be used to access ranges. 

### .. Operator

This operator creates a range. An example can be found [here](Sample%20Programs/SourMelon.kt)

:warning: ```..``` operator returns a range type variable.

### rangeTo() and downTo()

These two functions can also be used to create ranges. 

:exclamation: rangeTo() creates a range in increasing order.

:exclamation: downTo() creates a range in decreasing order.

:warning: Examples can be found [here](Sample%20Programs/SourMelon.kt)

### in Operator

The ```in``` operator is used to check if a value is present in a given range or not. It can also be used to access the items of a given range. 

## Collections

Collections are used to store objects of similar types. 

Collections in ```Kotlin``` are of two types - 

1. **Mutable Collection**
   
   Mutable collections can be modified by adding, removing or replacing items present in the collection. 

1. **Immutable Collection**

   Immutable collections on the other hand cannot be modified. However, there are ways to modify it by creating a new collection altogether. 

:warning: The ```Iterable``` interface is at the top of the class hierarchy in ```Kotlin```. The ```Collection``` interface extends the ```Iterable``` interface and it is also **immutable**.

:warning: ```Kotlin``` has a ```MutableIterable``` interface that comes from the parent ```Iterable``` interface. ```MutableCollection``` interface extends ```MutableIterable``` interface and it is **mutable**.  

Some of the properties and functions of a Collection are given below - 

| Function/Property                   | Description                                                                                    |
|-------------------------------------|------------------------------------------------------------------------------------------------|
| ```size```                                | this property returns the size of the collection.                                              |
| ```isEmpty()```                           | returns true if the collection is empty or false otherwise.                                    |
| ```contains(element: E)```                | returns true if the element specified in the argument is present in the collection.             |
| ```containsAll(element: Collection<E>)``` | returns true if the element in the collection passed as argument is present in the collection. |

Some of the properties and functions of a MutableCollection are given below -

| Function/Property                   | Description                                                                                                                                                                        |
|-------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| ```size```                                | this property returns the size of the collection.                                                                                                                                  |
| ```isEmpty()```                           | returns true if the collection is empty or false otherwise.                                                                                                                        |
| ```contains(element: E)```                | returns true if the element specified in the argument is present in the collection.                                                                                                 |
| ```containsAll(element: Collection<E>)``` | returns true if the element in the collection passed as argument is present in the collection.                                                                                     |
| ```add(element: E)```                     | adds the element passed as an argument to the collection and returns true if successful or false if the collection does not support duplicates and the element is already present. |
| ```remove(element: E)```                  | removes the element passed as an argument from the collection. Returns true if successful or false if it was not present in the collection.                                         |
| ```addAll(elements: Collection<E>)```     | adds all the elements in the collection passed as arguments to the collection. Returns true if successful or false if nothing was added.                                           |
| ```removeAll(elements: Collection<E>)```  | removes all of the elements present in the collection passed as arguments. Returns true if successful or false if nothing was removed                                              |
| ```retainAll(elements: Collection<E>)```  | retains only the elements present in the collections passed as arguments. Returns true if successful or false if nothing was retained.                                             |
| ```clear()```                             | removes all elements from this collection.                                                                                                                                         |

#### Ordered Collection vs Unordered Collection

An ordered collection will have items stored in a particular order. Items in ordered collections can be accessed with their index.

An unordered collection on the other hand will store elements without any particular order. Here the elements usually cannot be accessed with their index.

### Lists

> List is an ordered collection of items

Lists are also of two types - 

1. Mutable
2. Immutable

The following functions can be used to create Immutable Lists - 

1. ```listOf()```
2. ```emptyList()```
3. ```listOfNotNull()```

The following functions can be used to create Mutable Lists -  

1. ```arrayListOf()```
2. ```mutableListOf()```

Examples can be found [here](Sample%20Programs/BitterMelon.kt).

:warning: ```toMutableList()``` can be used to convert an **immutable list** to a **mutable list**. 

### Sets

> A set is an unordered collection of unique elements. 

:boom: Duplicate items cannot be present in a set. 

Immutable sets can be created by using the ```setOf()``` function. 

```kotlin
var immutableSet = setOf(1, 2, 3, 5, 6, 7)
```

Mutable sets can be created using the following functions - 

```kotlin
var mutableHashSet = hashSetOf("Watermelon", "Mango", "Lemon", "Orange")

var mutableTreeSet = sortedSetOf(4, 77, 200, 98)

var mutableLnkedHashSet = linkedSetOf("Apple" , "Pineapple", "Orange", "Watermelon")

var mutableSet = mutableSetOf(3, 5, 7, 33, 2020)
```

:warning: ```mutableSetOf``` creates a set of type ```MutableSet```

Examples can be found [here](Sample%20Programs/BitterMelon.kt)

### Maps

Map is an unordered collection in which items are stored in key-value pairs. All the keys have to be unique, their values however may not be necessarily unique.

:warning: Unlike ```Set``` and ```List```, ```Map``` **doesn't extend** any interface. 

Some of properties and fuctions of the Map are listed below -

| Function/Property             | Description                                                                       |
|-------------------------------|-----------------------------------------------------------------------------------|
| ```size```                    | this property returns the size of map collection.                                 |
| ```isEmpty()```               | returns true if the map is empty or false otherwise.                              |
| ```containsKey(key: K)```     | returns true if the map contains the key in the argument.                         |
| ```containsValue(value: V)``` | returns true if the map maps one or more keys to the value passed as an argument. |
| ```get(key: K)```             | returns the value matching the given key or 'null' if none is found.              |
| ```keys```                    | this property returns an immutable  Set of all the keys in the map.               |
| ```values```                  | returns an immutable Collection of all the values in the map.                    |

```mapOf()``` functions creates an immutable Map. 

The following functions can be used to create mutable Maps - 

1. ```mutableMapOf()```
2. ```hashMapOf()```
3. ```linkedHashMap()```
4. ```sortedMapOf()```

:warning: ```LinkedHashMap``` stores the item in the order in which they were created. 

:warning: ```SortedMap``` stores the enteries in ascending order.

:warning: While adding items to a ```Map```, the ```to``` keyword can be used to add key-value pair together. An example is shown below.

```kotlin
var fruitMap = mapOf(1 to "Watermelon", 2 to "Apple", 3 to "Lychee", 4 to "Orange")
```

More examples can be found [here](Sample%20Programs/SweetMelon.kt).

## Collection Operation Functions

Some of the commonly used extension functions are as follows - 

1. ```last()```
2. ```first()```
3. ```max()```
4. ```average()```

:star: Please have a look [here](https://kotlinlang.org/docs/reference/collections-overview.html) to know more on Collections.
