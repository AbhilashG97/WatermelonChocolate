# Ranges and Collections

This section will cover topics related to ranges and collection. You can find sample programs inside the ```Sample Programs``` folder

## Ranges

Ranges in ```Kotlin``` have a start value and an end value. Ranges in ```Kotlin``` are **inclusive**. 

:warning: Both start and end are inclusive in Kotlin ranges.

The following functions can be used to create ranges - 

1. rangeTo()
2. downTo()

Also, ```..``` operator can also be used to create ranges. 


```in``` operator can be used to access ranges. 

### .. Operator

This operator creates a range. An example can be found [here](SourMelon.kt)

:warning: ```..``` operator returns a range type variable.

### rangeTo() and downTo()

These two functions can also be used to create ranges. 

:exclamation: rangeTo() creates a range in increasing order.

:exclamation: downTo() creates a range in decreasing order.

:warning: Examples can be found [here](SourMelon.kt)

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

:warning: ```Kotlin``` has a ```MutableIterable``` interface that comed from the parent ```Iterable``` interface. ```MutableCollection``` interface extends ```MutableIterable``` interface and it is **mutable**.  

Some of the properties and functions of a Collection are given below - 

| Function/Property                   | Description                                                                                    |
|-------------------------------------|------------------------------------------------------------------------------------------------|
| size                                | this property returns the size of the collection.                                              |
| isEmpty()                           | returns true if the collection is empty or false otherwise.                                    |
| contains(element: E)                | eturns true if the element specified in the argument is present in the collection.             |
| containsAll(element: Collection<E>) | returns true if the element in the collection passed as argument is present in the collection. |

Some of the properties and functions of a MutableCollection are given below -

| Function/Property                   | Description                                                                                                                                                                        |
|-------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| size                                | this property returns the size of the collection.                                                                                                                                  |
| isEmpty()                           | returns true if the collection is empty or false otherwise.                                                                                                                        |
| contains(element: E)                | eturns true if the element specified in the argument is present in the collection.                                                                                                 |
| containsAll(element: Collection<E>) | returns true if the element in the collection passed as argument is present in the collection.                                                                                     |
| add(element: E)                     | adds the element passed as an argument to the collection and returns true if successful or false if the collection does not support duplicates and the element is already present. |
| remove(element: E)                  | emoves the element passed as an argument from the collection. Returns true if successful or false if it was not present in the collection.                                         |
| addAll(elements: Collection<E>)     | adds all the elements in the collection passed as arguments to the collection. Returns true if successful or false if nothing was added.                                           |
| removeAll(elements: Collection<E>)  | removes all of the elements present in the collection passed as arguments. Returns true if successful or false if nothing was removed                                              |
| retainAll(elements: Collection<E>)  | retains only the elements present in the collections passed as arguments. Returns true if successful or false if nothing was retained.                                             |
| clear()                             | removes all elements from this collection.                                                                                                                                         |

### Lists

> List is an ordered collection of itema

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

