import java.io.InputStreamReader;

public class IOException_using_InputSreamReader {
  public static void main(String args[]) {
    System.out.println("Taking input as byte code and converting to character using InputStreamReader class: ");
    // System.in will take input as byte stream using InputStreamReader class
    InputStreamReader isr = new InputStreamReader(System.in);
    // implementing IOException
    try {
      // the try block is implemented when there is no error while taking input
      System.out.println("Take input as numbers: ");
      int num = isr.read(); // read the input byte code and converted to integer
    } catch (Exception e) {
      // TODO: handle exception
    }

  }

}
