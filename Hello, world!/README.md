# Hello, World! 

## Compiling a Kotlin application

```kotlinc``` is used compile Kotlin programs. The following is used to compile a Kotlin program - 

```kotlinc FileName.kt -include-runtime -d FileName.jar```

To run the file, the following command is used - 

```java -jar FileName.jar```

:exclamation: Please have a look [here](https://www.codexpedia.com/kotlin/install-compile-and-run-kotlin-from-command-line/) and [here](https://kotlinlang.org/docs/tutorials/command-line.html) to know more on Compiling Kotlin Programs.

## Naming Conventions

### Source File Naming conventions

> If a Kotlin file contains a single class (potentially with related top-level declarations), its name should be the same as the name of the class, with the .kt extension appended. If a file contains multiple classes, or only top-level declarations, choose a name describing what the file contains, and name the file accordingly. Use camel humps with an uppercase first letter (e.g. ProcessDeclarations.kt).

> The name of the file should describe what the code in the file does. Therefore, you should avoid using meaningless words such as "Util" in file names.

### Source file organization

> Placing multiple declarations (classes, top-level functions or properties) in the same Kotlin source file is encouraged as long as these declarations are closely related to each other semantically and the file size remains reasonable (not exceeding a few hundred lines).

> In particular, when defining extension functions for a class which are relevant for all clients of this class, put them in the same file where the class itself is defined. When defining extension functions that make sense only for a specific client, put them next to the code of that client. Do not create files just to hold "all extensions of Foo".

:warning: Please have a look [here](https://kotlinlang.org/docs/reference/coding-conventions.html#naming-rules) to know more.

## Hello, World! Kotlin Program

You can find a simple HelloWorld program [here](#). The program printss ```Hello, World!``` and also prints whatever is being passed as a command-line argument.  