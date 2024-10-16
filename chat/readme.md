# make CLI chat

1. Abstract class vs Normal class 
   -- Abstract class serves as a blueprint for other subclasses. Normal class serves as a blueprint for its instances
   -- an abstract class can both extends and implements, meaning it can have both abstract methods(without body) and normal methods. 
   -- you can't make objects for abstract class directly, only the subclasses can have instances
   -- the abstract methods of the superclass must be implemented(add meaning/body) by the subclass or else you need to make the subclass abstract as well example: 
   `
          abstract class Animal {
             public abstract void sound();
          }
         class Dog extends Animal {
             @Override
             public void sound() {
             System.out.println("The dog barks");
         }
         }`
2. Read and Write data in programming
3. IO package: [detail notes](~/mini_oop_projects/chat/notes/io.md)
  - how to work with files 
  - file handling
4. IO Exception
