# How and when to use ArrayList

1. Arraylist can stores only object, not primitive data types
2. we can store primitive data types(int, double, boolean, char, etc) using wrapper class(Intger, Boolean, etc) as an object.

   ##Autoboxing and Unboxing :-
   \*In Java, ArrayList<Integer> allows us to store integer values due to autoboxing and unboxing:

   - Autoboxing: Java automatically converts a primitive int to an Integer object when we add it to an ArrayList<Integer>. For example:
     `java
ArrayList<Integer> numbers = new ArrayList<>();
numbers.add(10);  // 10 is a primitive int, but Java autoboxes it to Integer`
   - Unboxing: When retrieving values from an ArrayList<Integer>, Java automatically converts Integer objects back into int values if needed.

### Why Use Integer instead of int

ArrayList cannot directly store primitive types like int, double, or char because ArrayList works with objects, and primitives are not objects. Instead, Java provides wrapper classes like Integer, Double, and Character that encapsulate primitive values in an object.

3. we can also store custom objects, Strings, ArrayList,
4. when we want dynamic array, use arraylist.
