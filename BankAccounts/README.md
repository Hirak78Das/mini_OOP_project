## make Bank account for the users 
   
### things that i learned from this project
1. Data member - includes all kinds of variables(instance variables, static variables, constant/final variables)
   Instance variables - consists of object variables only
2. if you wanna take int input from the user, first take the input as string and then convert the string to integer format
   -- why it's important to do this?
   --> cuz when we put input from the CLI and then hit enter, a newline '\n' is send to the jvm along with the input.
   --> this newline is ignored when we take input as an integer and is stored in the input buffer which can be problematic when we take the next input as string
   --> but when we take input as string, the newline generated while hitting enter will be removed from the input buffer, hence no unexpected output when using string input later.
   
   ##  int n = Integer.parseInt(sc.nextLine()); 
                                          - took input as string so that \n newline is removed from the input buffer
                                          - check this --> https://www.google.com/search?client=ubuntu-sn&channel=fs&q=why+to+use+nextLine+instead+of+n
   # ** this is not only for int but also for float, double etc

3. Integer class is used to convert the primitive int to an object (know as wrapper class )
   Example of some useful methods:
   - Integer.parseInt(String s): Converts a String to a primitive int.
   - Integer.valueOf(String s): Converts a String to an Integer object.
   - Integer.toString(int i): Converts an int to a String.
   - Integer.compare(int x, int y): Compares two int values.
4.
