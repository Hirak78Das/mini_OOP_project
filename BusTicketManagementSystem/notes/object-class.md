# Object class in java

## \*object\* class is the root class of java which is inherited by every classes present in java including user-defined classes

## Though we don't explicitly use extends keyword to inherit _Object_ class in our file, it is automated by java.

## as we know java.lang.\* is imported by default in our java file,

### Summary of Key Methods in Object

Method Purpose Default Behavior
toString() String representation of the object Class name and hash code
equals() Checks equality between objects Reference equality
hashCode() Generates a hash code Memory address-based hash code
getClass() Returns the class object of the instance N/A
clone() Creates a shallow copy Shallow copy of the object
finalize() Cleanup before garbage collection No action by default
wait() Waits for another thread's notification Used in synchronized blocks
notify() Wakes up a waiting thread Used in synchronized blocks
notifyAll() Wakes up all waiting threads Used in synchronized blocks

These methods provide essential functionality for all Java objects, forming the foundation for many aspects of object-oriented programming, multithreading, and data handling in Java.
