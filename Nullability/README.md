# Nullabilty

## Declaring a variable as nullable (?)

```Kotlin``` is a ```null-safe``` language which means that variables in Kotlin cannot take null values unles they have been specifically specified. 

:warning: If a null value is given to a variable of a data type, it will not compile unless that variable is declared as nullable by making use of ```?``` operator.

An exmaple for the same can be found [here](OrangeWatermelon.kt).

## Safe Call Operator (?.)

:warning: Kotlin won't compile if it detects anything that might lead to a NullPointerExcpetion as it is a ```Null Safe Language```. 

Hence, if a varible is declared as nullable and we want to use that varible then it is adviced to use the Safe Call Operator.

An example for the same can be found [here](RedMelon.kt).

:boom: We can bypass the null safety check of the kotlin compiler by making use of ```!!.``` However, doing so may lead to NullPointer Exception being thrown. 

If we use a function of a null object the return type would be ```nullable```. An example can be found [here](YellowWatermelon.kt)

## Elvis Operator (?:)

Elvis operator is used to provide a default value to a varible if their value is null.

An example for the same can be found [here](OrangyWatermelon.kt)