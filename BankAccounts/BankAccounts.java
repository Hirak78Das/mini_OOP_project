
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

  // to deposit money in account
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

  // to withdraw money from the account
  void withdraw() {
    System.out.print("");
    System.out.println("Account No : " + this.uid);
    System.out.println("Name : " + this.name);
    System.out.println("Enter amount to be withdrawn: ₹");
    double withdraw = Double.parseDouble(sc.nextLine());
    this.balance = this.balance - withdraw;
    System.out.println("");
    System.out.println("Amount Debited Successfully...");
    System.out.println("");
    no_of_transaction++;
  }

  // check balance of any account
  void checkBalance() {
    System.out.println("");
    System.out.println("Account No: " + this.uid);
    System.out.println("Name : " + this.name);
    System.out.println("Balance :  ₹" + this.balance);
  }

  // Change address of any account
  void changeAddress() {
    System.out.println("");
    System.out.println("Account No : " + this.uid);
    System.out.println("Name : " + this.name);
    System.out.print("Enter New Address : ");
    this.address = sc.nextLine();
    System.out.println("");
    System.out.println("Address Successfully Changed...");
    System.out.println("");
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

    int num; // to hold account no. so that we can access or manipulate those accounts

    do {
      System.out.println("");
      System.out.println("        MENU FOR ACCOUNT MANIPULATION");
      System.out.println("   1. Print information of any account");
      System.out.println("   2. Deposit money to any account");
      System.out.println("   3. withdraw money from any account ");
      System.out.println("   4. Change Address of any account");
      System.out.println("   5. Check Balance ");
      System.out.println("   6. Exit the program...");
      System.out.println("       Enter your Choice : ");
      int choice = Integer.parseInt(sc.nextLine());
      switch (choice) {
        case 1:
          System.out.println("Enter Account No: ");
          num = Integer.parseInt(sc.nextLine());
          account[num - 1].display();
          break;
        case 2:
          System.out.println("Enter Account No: ");
          num = Integer.parseInt(sc.nextLine());
          account[num - 1].deposit();
          break;
        case 3:
          System.out.println("Enter Account No: ");
          num = Integer.parseInt(sc.nextLine());
          account[num - 1].withdraw();
          break;
        case 4:
          System.out.println("Enter Account No: ");
          num = Integer.parseInt(sc.nextLine());
          account[num - 1].changeAddress();
          break;
        case 5:
          System.out.println("Enter Account No: ");
          num = Integer.parseInt(sc.nextLine());
          account[num - 1].checkBalance();
          break;
        case 6:
          return; // return to the main function

        default:
          System.out.println("invalid choice!!");
          break;
      }
    } while (true);
  }
}
