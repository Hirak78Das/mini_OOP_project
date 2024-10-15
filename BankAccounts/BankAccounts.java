
import java.util.Scanner;

public class BankAccounts {
  // creating global scanner object
  public static Scanner sc = new Scanner(System.in); // make static so that static methods(eg: main) can access

  // Data members
  static int id = 1000; // for id generation to each account
  String uid;
  String name;
  String address;
  String type; // account type
  double balance; // initial balance
  public static int no_of_transaction = 0;

  // Default constructor -- you dont need to create Default constructor though, if
  // you want null values it will be created automatically by calling default
  // constructor
  // but i did it cuz it was present in the referred file aswell
  BankAccounts() {
    uid = name = address = type = null;
  }

  BankAccounts(String name, String address, String type, double balance) {
    // uid will be done by backend i.e. bank itself and not by client
    uid = UID();
    this.name = name;
    this.address = address;
    this.type = type;
    this.balance = balance;
  }

  // Generate unique id for each account
  String UID() {
    return "ID" + Integer.toString(BankAccounts.id++);
  }

  // Display info and balance of the client
  void display() {
    System.out.println("");
    System.out.println("\t***ACCOUNT INFORMATION***");
    System.out.println("");
    System.out.println("     Name of Holder     : " + this.name);
    System.out.println("     Account No         : " + this.uid);
    System.out.println("     Account Type       : " + this.type);
    System.out.println("     Available Balance  : ₹" + this.balance);
    System.out.println("     Address of Holder  : " + this.address);
    System.out.println("");
    System.out.println("");
  }

  // deposit money in account
  void deposit() {
    System.out.print("");
    System.out.println("Account No : " + this.uid);
    System.out.println("Name : " + this.name);
    System.out.println("Enter amount to be Deposited : ₹");
    double deposit = Double.parseDouble(sc.nextLine());
    this.balance = this.balance + deposit;
    System.out.println("");
    System.out.println("Amount Credited Successfully...");
    System.out.println("");
    no_of_transaction++;
  }

  public static void main(String args[]) {
    // Enter no of users
    System.out.println("Enter Number of accounts you wanna make");

    int n = Integer.parseInt(sc.nextLine()); // took input as string so that \n newline is removed from the input
                                             // buffer. check this -->
                                             // https://www.google.com/search?client=ubuntu-sn&channel=fs&q=why+to+use+nextLine+instead+of+nextInt

    // create array of accounts(this just allocated memory for n objects)
    BankAccounts[] account = new BankAccounts[n];

    // Enter info of the n users
    for (int i = 0; i < n; i++) {
      System.out.println("Enter Info of account no." + (i + 1));
      System.out.print("Enter name : ");
      String name = sc.nextLine();
      System.out.print("Account type : ");
      String type = sc.nextLine();
      System.out.print("Enter Address : ");
      String address = sc.nextLine();
      System.out.print("Enter balance : ₹");
      double balance = Double.parseDouble(sc.nextLine());
      // make object for each account
      account[i] = new BankAccounts(name, address, type, balance);
      System.out.println("");
    }

    int num; // to hold account no. to access or manipulate those accounts
  }
}
