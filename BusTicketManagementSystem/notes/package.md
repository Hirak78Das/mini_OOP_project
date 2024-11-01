# when to add package in a class, interface or abstract class

- when you declare a package at the top of your java file, you're creating a namespace (i.e you can have same file names in different folders), which avoids naming conflict(by grouping relative identifier together under a unique indentifier) and controls scope and enhance code readability.
- An identifier(class, variable or function name) defined in one namespace is not accessible from another unless explicitly imported i.e. enacapsulation
- namespace is the path defined in the package
- if your file is located within a subfolder, you should declare the corresponding package name in the file so that compiler can match its directory structure
- package declaration helps the compiler and runtime locate and organize classes according to their folder hierarchy
- _import issue_ : other classes trying to access this class won't be able to import it, if package is not mentioned inside that class.
