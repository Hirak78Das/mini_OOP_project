# Package java.io
**IO** is a API or collection framework in Java
**IO** is a sub-package of java package    
### **import java.io.**
- used to handle files
- simply IO is used to read/write data
### what is file handling?
## Streams in java  [import java.utils.Streams]
  1. Stream API is a sequence of data in the form of(byte or character format)
     - byte format -> stores image or videos in byte format
     - character format -> stores name or other sequence of characters
  2. Java performs IO through these streams
  3. Streams is an abstract class that shows what type of data you wanna read/write
  4. these streams is linked with the physical device(keyboard) by java IO 
## How does java implements(abstract class) these Streams?
  - using java IO package i.e. IO package classes are subclasses of stream abstract class

## Byte stream: use to handle input and output of bytes of data  
   Example: read an image or pdf file. It will contain binary data of files
            open an image in a text editor
   #### **how to read and write these byte files?**
   1.Input-Stream : `abstract class InputStream extends Object`  (https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/InputStream.html) --> it has a read method which can be implemented by the subclasses
   2.output-Stream : `abstract class OutputStream extends Object` --> it has a write method implemented by subclasses
## Character stream: use to read and write *Unicode* data
   #Unicode : handles characters from diverse languages and symbols. 
            : Its ability to support a wide range of characters makes it essential for globalization, internationalization, and modern communication across different platforms and applications.
   *Types of character stream*: 
   1. Reader: abstract classes, has read and write methods, which will be implemented by the subclasses
   2. Writer
*[character stream vs byte stream](https://www.geeksforgeeks.org/character-stream-vs-byte-stream-java/)

## **Predefined Streams in java: console/terminal based streams i.e. takes input or gives output in the terminal {whereas Byte/Character stream takes i/o from other sources}
1. System.in : Standard input stream takes input from keyboard. 
   Type: InputStream
2. System.out : Standard output-Stream gives output in console/terminal
3. System.err : Standard error stream gives errors in console

# IO Exception: 
  - occurs whenever an input/output operation is failed or interpreted
  - this class falls under java.io package

### Some common reasons why IOException takes place are:
   1. File not found.
   2. False user input.
   3. Bad URL for downloading files.
   4. File permission causes.
   5. Input/Output device issues.
### How to handle IOException?
- using try-catch and finally blocks






