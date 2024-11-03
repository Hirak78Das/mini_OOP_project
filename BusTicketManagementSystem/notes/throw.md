# throw vs throws

Java throw

- The throw keyword in Java is used to explicitly throw an exception from a method or any block of code.
- We can throw either checked or unchecked exception.
- The throw keyword is mainly used to throw custom exceptions.
- Syntax in Java throw :
  throw Instance
  Example:
  `throw new ArithmeticException("/ by zero");`
  But this exception i.e., Instance must be of type Throwable or a subclass of Throwable
  For example, an Exception is a sub-class of Throwable and user-defined exceptions typically extend the Exception class

- The flow of execution of the program stops immediately after the throw statement is executed and the nearest enclosing try block is checked to see if it has a catch statement that matches the type of exception.
- If it finds a match, controlled is transferred to that statement otherwise next enclosing try block is checked, and so on.
- If no matching catch is found then the default exception handler will halt the program.

Java throws

- in order to throw exception, we need to include the throws keyword in signature method
- throws is a keyword in Java that is used in the signature of a method to indicate that this method might throw one of the listed type exceptions.
- The caller to these methods has to handle the exception using a try-catch block
- if the caller method doesnt have try catch block, it will directly print the error and terminate the program.
